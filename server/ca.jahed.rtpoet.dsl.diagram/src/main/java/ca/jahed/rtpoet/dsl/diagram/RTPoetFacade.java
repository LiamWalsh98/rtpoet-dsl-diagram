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
package ca.jahed.rtpoet.dsl.diagram;

import ca.jahed.rtpoet.dsl.rt.Model;
import ca.jahed.rtpoet.dsl.rt.RtFactory;
import com.google.common.base.Preconditions;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.glsp.graph.util.GraphUtil;

import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.graph.GShapeElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RTPoetFacade {

	private final Resource resource;
    private Model model;

    private boolean modelIsNewlyCreated = false;

	private RTPoetModelIndex modelIndex;

	public RTPoetFacade(Resource resource) {
		this.resource = resource;
		this.model = resource.getContents().stream().filter(Model.class::isInstance)
				.map(Model.class::cast).findFirst().orElseThrow();
		EcoreUtil.resolveAll(model);
	}

	public Resource getResource() {
		return resource;
	}

	public Model getModel() {
		if (model == null) {
			getOrCreateModel();
		}
		return model;
	}

	private Model getOrCreateModel() {
//		Optional<Model> existingModel = findModel();
//		model = existingModel.isPresent() ? existingModel.get() : createModel();
//		findUnresolvedElements(model).forEach(e -> e.setSemanticElement(resolved(e.getSemanticElement()))); //todo: replace this line
//		modelIndex.indexNotation(model);

        // todo: for now i am always creating the model from scratch

		return createModel();

	}

    private Model createModel() {
        return RtFactory.eINSTANCE.createModel();
    }

    private Optional<Model> findModel() {
	    resource.getContents().stream().filter(Model.class::isInstance)
                .map(Model.class::cast).findFirst();
        EcoreUtil.resolveAll(model);

        return null;
    }

    public Model initialize(Model model, GModelRoot gRoot) {
		Preconditions.checkArgument(model == this.model);
		gRoot.getChildren().forEach(child -> {
//			modelIndex.getNotation(child).ifPresentOrElse(n -> updateNotationElement(n, child),
//					() -> initializeNotationElement(child).ifPresent(model.getElements()::add));

            //todo: replace this block

		});
		return model;
	}

}
