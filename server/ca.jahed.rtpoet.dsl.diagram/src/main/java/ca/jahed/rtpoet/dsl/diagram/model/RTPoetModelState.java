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

import ca.jahed.rtpoet.dsl.diagram.RTPoetFacade;
import ca.jahed.rtpoet.dsl.diagram.RTPoetModelIndex;
import ca.jahed.rtpoet.dsl.diagram.ResourceManager;
import org.eclipse.emf.common.command.BasicCommandStack;
import ca.jahed.rtpoet.dsl.diagram.RTPoetEditorContext;
import org.eclipse.glsp.server.model.GModelState;
import org.eclipse.glsp.server.model.GModelStateImpl;

public class RTPoetModelState extends GModelStateImpl implements GModelState {

	private RTPoetEditorContext editorContext;

	public static RTPoetModelState getModelState(GModelState state) {
		if (!(state instanceof RTPoetModelState)) {
			throw new IllegalArgumentException("Argument must be a RTPoetModelState. Argument was of type: " + state.getClass().getName());
		}
		return ((RTPoetModelState) state);
	}

	public static RTPoetEditorContext getEditorContext(GModelState state) {
		return getModelState(state).getEditorContext();
	}

	public static ResourceManager getResourceManager(GModelState modelState) {
		return getEditorContext(modelState).getResourceManager();
	}

	public static RTPoetFacade getRTPoetFacade(GModelState modelState) {
		return getEditorContext(modelState).getRTPoetFacade();
	}

	public RTPoetEditorContext getEditorContext() {
		return editorContext;
	}

	public void setEditorContext(RTPoetEditorContext editorContext) {
		this.editorContext = editorContext;
		setCommandStack((BasicCommandStack) editorContext.getResourceManager().getEditingDomain().getCommandStack());
	}

	@Override
	public RTPoetModelIndex getIndex() {
		return RTPoetModelIndex.get(getRoot());
	}

}
