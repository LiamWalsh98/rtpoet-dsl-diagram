/********************************************************************************
 * Copyright (c) 2019-2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
package ca.jahed.rtpoet.dsl.diagram.handler;

import ca.jahed.rtpoet.dsl.diagram.RTPoetEditorContext;
import ca.jahed.rtpoet.dsl.diagram.RTPoetFacade;
import ca.jahed.rtpoet.dsl.diagram.RTPoetModelIndex;
import ca.jahed.rtpoet.dsl.diagram.model.RTPoetModelState;
import ca.jahed.rtpoet.dsl.diagram.util.RTPoetConfig.Types;
import ca.jahed.rtpoet.dsl.rt.RtPackage;
import ca.jahed.rtpoet.dsl.rt.State;
import ca.jahed.rtpoet.dsl.rt.StateMachine;
import ca.jahed.rtpoet.dsl.rt.Transition;
import com.google.common.collect.Lists;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.GGraph;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.server.model.GModelState;
import org.eclipse.glsp.server.operations.BasicOperationHandler;
import org.eclipse.glsp.server.operations.CreateEdgeOperation;
import org.eclipse.glsp.server.operations.Operation;

import java.util.List;
import java.util.Optional;

import static org.eclipse.glsp.server.protocol.GLSPServerException.getOrThrow;

public class CreateTransitionOperationHandler extends BasicOperationHandler<CreateEdgeOperation> {
	private List<String> handledElementTypeIds = Lists.newArrayList(Types.TRANSITION);

	@Override
	public boolean handles(Operation operation) {
		if (operation instanceof CreateEdgeOperation) {
			CreateEdgeOperation connectAction = (CreateEdgeOperation) operation;
			return this.handledElementTypeIds.contains(connectAction.getElementTypeId());
		}
		return false;
	}

	@Override
	public void executeOperation(CreateEdgeOperation operation, GModelState modelState) {
		String elementTypeId = operation.getElementTypeId();

		RTPoetEditorContext context = RTPoetModelState.getEditorContext(modelState);
		RTPoetModelIndex modelIndex = context.getModelState().getIndex();

		EObject sourceObject = getOrThrow(modelIndex.getSemanticObject(operation.getSourceElementId()),
				"No element found for source with id: " + operation.getSourceElementId());
		EObject targetObject = getOrThrow(modelIndex.getSemanticObject(operation.getTargetElementId()),
				"No element found for target with id: " + operation.getTargetElementId());

		EObject parent = sourceObject.eContainer();

        if (elementTypeId.equals(Types.TRANSITION)) {
            Transition transition = createTransition((State) sourceObject, (State) targetObject);
            parent.eContents().add(transition);
            GEdge edge = getOrThrow(context.getGModelFactory().create(transition, GEdge.class),
                    "No viewmodel factory found for element: " + transition);

            GGraph parentStateMachine = (GGraph) getOrThrow(modelIndex.get(operation.getSourceElementId()),
                    "No parent viewmodel object found: " + parent).getParent();

            parentStateMachine.getChildren().add(edge);



        }

    }

	private Transition createTransition(State source, State target) {
        Transition transition = RtPackage.eINSTANCE.getRtFactory().createTransition();
        transition.setSource(source);
        transition.setTarget(target);
        return transition;
	}


	@Override
	public String getLabel() {
		return "Create transition";
	}

}
