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
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.features.core.model.ModelSourceLoader;
import org.eclipse.glsp.server.features.core.model.RequestModelAction;
import org.eclipse.glsp.server.model.GModelState;

import java.util.List;

public class RTPoetModelSourceLoader implements ModelSourceLoader {
	private static final String ROOT_ID = "sprotty";


//    @Override
//    public List<Action> executeAction(final RequestModelAction action, final GModelState modelState) {
//        modelState.setClientOptions(action.getOptions());
//
//        notifyStartLoading(modelState);
//        sourceModelLoader.loadSourceModel(action, modelState);
//        notifyFinishedLoading(modelState);
//
//        modelSourceWatcher.startWatching(modelState);
//
//        return modelSubmissionHandler.submitModel(modelState);
//    }

	@Override
	public void loadSourceModel(RequestModelAction action, GModelState graphicalModelState) {

//        if (action.getOptions().size() != 0) {
//
//        }

        for (String name :
                action.getOptions().keySet()) {
            System.out.printf("%s: \"%s\"",name,action.getOptions().get(name));
        }



		RTPoetModelState modelState = RTPoetModelState.getModelState(graphicalModelState); //
		graphicalModelState.setClientOptions(action.getOptions());

		RTPoetEditorContext context = new RTPoetEditorContext(modelState);

		modelState.setEditorContext(context);

		RTPoetFacade rtpoetFacade = context.getRTPoetFacade();
		if (rtpoetFacade == null) {
			return;
		}
//		Model model = rtpoetFacade.getModel();

        //todo: add new function to create from alternate root

        GModelRoot gmodelRoot = context.getGModelFactory().create(rtpoetFacade.getModel());

//		rtpoetFacade.initialize(model, gmodelRoot);
		modelState.setRoot(gmodelRoot);
	}


}
