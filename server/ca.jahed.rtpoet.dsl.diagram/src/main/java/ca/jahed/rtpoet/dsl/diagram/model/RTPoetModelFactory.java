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
package ca.jahed.rtpoet.dsl.diagram.model;


import ca.jahed.rtpoet.dsl.diagram.RTPoetEditorContext;
import ca.jahed.rtpoet.dsl.diagram.RTPoetFacade;
import ca.jahed.rtpoet.dsl.rt.Model;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.builder.impl.GGraphBuilder;
import org.eclipse.glsp.server.features.core.model.ModelFactory;
import org.eclipse.glsp.server.features.core.model.RequestModelAction;
import org.eclipse.glsp.server.model.GModelState;
import org.eclipse.glsp.server.model.GModelStateImpl;

public class RTPoetModelFactory implements ModelFactory {
	private static final String ROOT_ID = "sprotty";

	@Override
	public GModelRoot loadModel(RequestModelAction action, GModelState graphicalModelState) {
		RTPoetModelState modelState = RTPoetModelState.getModelState(graphicalModelState);
		graphicalModelState.setClientOptions(action.getOptions());

		RTPoetEditorContext context = new RTPoetEditorContext(modelState);

		modelState.setEditorContext(context);

		RTPoetFacade rtpoetFacade = context.getRTPoetFacade();
		if (rtpoetFacade == null) {
			return createEmptyRoot();
		}
		Model model = rtpoetFacade.getModel();

		GModelRoot gmodelRoot = context.getGModelFactory().create(rtpoetFacade.getModel());
//		rtpoetFacade.initialize(model, gmodelRoot);
		modelState.setRoot(gmodelRoot);
		return gmodelRoot;
	}

	private static GModelRoot createEmptyRoot() {
		return new GGraphBuilder(DefaultTypes.GRAPH)//
				.id(ROOT_ID) //
				.build();
	}

}
