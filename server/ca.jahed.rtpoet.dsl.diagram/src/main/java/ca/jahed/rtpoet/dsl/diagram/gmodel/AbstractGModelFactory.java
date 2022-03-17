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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.glsp.graph.GModelElement;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public abstract class AbstractGModelFactory<T extends EObject, E extends GModelElement> {

    protected RTPoetModelState modelState;
//    protected static Map<EObject, String> idMap = new HashMap<>();

    public AbstractGModelFactory(RTPoetModelState modelState) {
        this.modelState = modelState;
    }


    public abstract E create(T semanticElement);

    public <U extends E> Optional<U> create(T semanticElement, Class<U> clazz) {
        return Optional.ofNullable(create(semanticElement)).filter(clazz::isInstance).map(clazz::cast);
    }

    protected String toId(EObject element) {

//        EcoreUtil.getID(element);

        return modelState.getIndex().getOrCreateId(element); //


//		String id = modelState.getIndex().getId(element).orElse(null);
//
//        // todo: fix this
//
//        if (id == null) {
//			id = UUID.randomUUID().toString();
//			modelState.getIndex().indexElement(id, element);
//		}
//		return id;
//
    }
}
