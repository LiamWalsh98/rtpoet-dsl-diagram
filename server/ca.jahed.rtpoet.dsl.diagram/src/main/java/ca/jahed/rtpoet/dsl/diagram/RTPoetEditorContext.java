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

//import org.eclipse.emfcloud.ecore.glsp.gmodel.GModelFactory;
//import org.eclipse.emfcloud.ecore.glsp.model.EcoreModelState;

import ca.jahed.rtpoet.dsl.diagram.gmodel.GModelFactory;
import ca.jahed.rtpoet.dsl.diagram.model.RTPoetModelState;

public class RTPoetEditorContext {
	private final ResourceManager resourceManager;
	private final GModelFactory gModelFactory;
	private final RTPoetModelState modelState;

	public RTPoetEditorContext(RTPoetModelState modelState) {
		this.modelState = modelState;
		gModelFactory = new GModelFactory(modelState);
		resourceManager = new ResourceManager(modelState);
	}

	public RTPoetFacade getRTPoetFacade() {
		return resourceManager.getRTPoetFacade();
	}

	public ResourceManager getResourceManager() {
		return resourceManager;
	}

	public GModelFactory getGModelFactory() {
		return gModelFactory;
	}

	public RTPoetModelState getModelState() {
		return modelState;
	}

}
