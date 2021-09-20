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
package ca.jahed.rtpoet.dsl.diagram.gmodel;

import ca.jahed.rtpoet.dsl.diagram.model.RTPoetModelState;
import ca.jahed.rtpoet.dsl.diagram.util.RTPoetConfig.Types;
import ca.jahed.rtpoet.dsl.rt.Capsule;
import ca.jahed.rtpoet.dsl.rt.Type;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.glsp.graph.GLabel;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;

public class LabelFactory extends AbstractGModelFactory<EObject, GLabel> {

	public LabelFactory(RTPoetModelState modelState) {
		super(modelState);
	}

	@Override
	public GLabel create(EObject semanticElement) {

		return null;
	}

}
