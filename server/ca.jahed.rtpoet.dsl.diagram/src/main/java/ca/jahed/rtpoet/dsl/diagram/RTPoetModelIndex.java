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

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.impl.GModelIndexImpl;

import java.util.*;

public class RTPoetModelIndex extends GModelIndexImpl {

    private final Map<String, GModelElement> idToElement;
//    private final Map<EClass, Set<GModelElement>> typeToElements = new HashMap<>();

//    private BiMap<String, GModelElement> graphIndex;
    private BiMap<String, EObject> semanticIndex;

    //	private Map<EObject, Set<GModelElement>> notationIndex;
//	private Set<String> bidirectionalReferences;
//
    private RTPoetModelIndex(EObject target) {
        super(target);
        idToElement = new HashMap<>();
        semanticIndex = HashBiMap.create();
//		notationIndex = new HashMap<>();
//		bidirectionalReferences = new HashSet<>();
    }

    //
    public static RTPoetModelIndex get(GModelElement element) {
        EObject root = EcoreUtil.getRootContainer(element);
        RTPoetModelIndex existingIndex = (RTPoetModelIndex) EcoreUtil.getExistingAdapter(root, RTPoetModelIndex.class);
        return Optional.ofNullable(existingIndex).orElseGet(() -> (create(element)));
    }

    //
    public static RTPoetModelIndex create(GModelElement element) {
        return new RTPoetModelIndex(EcoreUtil.getRootContainer(element));
    }

//    public void putGraphObject(String id, EObject graphElement) { semanticIndex.putIfAbsent(id, graphElement); }

    public void putSemanticObject(String id, EObject semanticElement) {
        semanticIndex.putIfAbsent(id, semanticElement);
    }

    public Optional<EObject> getSemanticObject(String id) {
        return Optional.ofNullable(semanticIndex.get(id));
    }

//
    public Optional<Object> getSemanticObjectId(EObject semanticElement) { return Optional.ofNullable(semanticIndex.inverse().get(semanticElement)); }


    public String getOrCreateId(EObject element) {
        if (semanticIndex.inverse().containsKey(element)) {
            return semanticIndex.inverse().get(element);
        } else {
            String newId = UUID.randomUUID().toString();
            putSemanticObject(newId, element);
            return newId;
        }
    }

//
//	@Override
//	public boolean isAdapterForType(Object type) {
//		return super.isAdapterForType(type) || RTPoetModelIndex.class.equals(type);
//	}
//
//	public void indexSemantic(String id, EObject semanticElement) {
//		semanticIndex.putIfAbsent(id, semanticElement);
//	}
//
//	public void indexNotation(EObject eObject) {
//        EObject semanticElement = eObject;
//		semanticIndex.inverse().putIfAbsent(semanticElement, UUID.randomUUID().toString());
//
//		if (gModelElement instanceof Model) {
//			((Model) gModelElement).eContents().forEach(this::indexNotation);
//		}
//	}
//

//
//	public Optional<String> getSemanticId(EObject semanticElement) {
//		return Optional.ofNullable(semanticIndex.inverse().get(semanticElement));
//	}
//
//	public <T extends EObject> Optional<T> getSemantic(String id, Class<T> clazz) {
//		return safeCast(Optional.ofNullable(semanticIndex.get(id)), clazz);
//	}
//
//	public Optional<EObject> getSemantic(GModelElement gModelElement) {
//		return getSemantic(gModelElement.getId());
//	}
//
//	public <T extends EObject> Optional<T> getSemantic(GModelElement gModelElement, Class<T> clazz) {
//		return getSemantic(gModelElement.getId(), clazz);
//	}
//
//	public Optional<GModelElement> getNotation(EObject semanticElement) {
//		return Optional.ofNullable(notationIndex.get(semanticElement));
//	}
//
//	public <T extends GModelElement> Optional<T> getNotation(EObject semanticElement, Class<T> clazz) {
//		return safeCast(getNotation(semanticElement), clazz);
//	}
//
//	public Optional<GModelElement> getNotation(String id) {
//		return getSemantic(id).flatMap(this::getNotation);
//	}
//
//	public <T extends GModelElement> Optional<T> getNotation(String id, Class<T> clazz) {
//		return safeCast(getNotation(id), clazz);
//	}
//
//	public Optional<GModelElement> getNotation(GModelElement gModelElement) {
//		return getNotation(gModelElement.getId());
//	}
//
//	public <T extends GModelElement> Optional<T> getNotation(GModelElement element, Class<T> clazz) {
//		return safeCast(getNotation(element), clazz);
//	}
//
//	private <T> Optional<T> safeCast(Optional<?> toCast, Class<T> clazz) {
//		return toCast.filter(clazz::isInstance).map(clazz::cast);
//	}
//
//	public String add(EObject eObject) {
//		if (eObject instanceof GModelElement) {
//			return ((GModelElement) eObject).getId();
//		}
//		String id = null;
//		if (eObject instanceof GModelElement) {
//			EObject semanticElement = (GModelElement) eObject;
//			id = add(semanticElement);
//			notationIndex.putIfAbsent(semanticElement, (GModelElement) eObject);
//		} else {
//			id = getSemanticId(eObject).orElse(null);
//			if (id == null) {
//				id = UUID.randomUUID().toString();
//				indexSemantic(id, eObject);
//			}
//
//		}
//		return id;
//
//	}
//
//	public void remove(EObject eObject) {
//		if (eObject instanceof GModelElement) {
//			EObject semanticElement = ((GModelElement) eObject).getSemanticElement().getResolvedElement();
//			notationIndex.remove(semanticElement);
//			remove(semanticElement);
//			return;
//		} else if (eObject instanceof GModelElement) {
//			// do nothing;
//			return;
//		}
//		semanticIndex.inverse().remove(eObject);
//	}
//
//	public Set<String> getBidirectionalReferences() {
//		return bidirectionalReferences;
//	}
}
