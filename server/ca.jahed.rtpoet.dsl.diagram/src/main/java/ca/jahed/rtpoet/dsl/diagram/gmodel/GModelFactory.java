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
import ca.jahed.rtpoet.dsl.diagram.util.RTPoetConfig.CSS;
import ca.jahed.rtpoet.dsl.rt.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.glsp.graph.*;
import org.eclipse.glsp.graph.builder.impl.*;
import org.eclipse.glsp.graph.util.GConstants;
import org.eclipse.glsp.server.model.GModelStateImpl;
import org.eclipse.glsp.server.protocol.GLSPServerException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GModelFactory extends AbstractGModelFactory<EObject, GModelElement> {

	private LabelFactory labelFactory;
	private StateNodeFactory stateNodeFactory;

	public GModelFactory(RTPoetModelState modelState) {
		super(modelState);
		stateNodeFactory = new StateNodeFactory(modelState, this);
		labelFactory = new LabelFactory(modelState);
		getOrCreateRoot();

	}

	@Override
	public GModelElement create(EObject semanticElement) {
		GModelElement result = null;
		if (semanticElement instanceof Model) {
			result = create((Model) semanticElement);
		} else if (semanticElement instanceof State) {
			result = create((State) semanticElement);
        } else if (semanticElement instanceof Transition) {
            result = create((Transition) semanticElement);
        }
//        else if (semanticElement instanceof Protocol) {
//        }
//        if (result == null) {
//			throw createFailed(semanticElement);
//		}
		return result;
	}

    public GGraph create(Model model) {
        GGraph graph = getOrCreateRoot();

//        graph.setId(toId(model));

//        graph.getChildren().addAll(model.eContents().stream()//
//                .map(this::create)//
//                .collect(Collectors.toList()));
//
//        graph.getChildren().addAll(model.eContents().stream() //
//                .filter(Part.class::isInstance) //
//                .map(Part.class::cast) //
//                .flatMap(part -> createEdges(part).stream()) //
//                .collect(Collectors.toList()));
        // todo: expand upon state machine example

        graph.getChildren().addAll(model.eContents().stream()//
                .filter(Capsule.class::isInstance)
                .map(this::create)
                .collect(Collectors.toList()));

        return graph;

    }

//	public GModelElement create(Part semanticElement) {
//
//    }

    private List<GModelElement> create(Capsule capsule) {
        // FOR NOW RETURNS ALL THE ELEMENTS OF THE CONTAINED BEHAVIOUR

        List<GModelElement> children = new ArrayList<>();
        // create reference edges

        if (capsule.getStateMachine() != null) {
            children.addAll(create(capsule.getStateMachine()));
            return children;
        }
        return null;
    }

    private List<GModelElement> create(Part part) {
	    // FOR NOW RETURNS ALL THE ELEMENTS OF THE CONTAINED BEHAVIOUR

        List<GModelElement> children = new ArrayList<>();
        // create reference edges

        children.addAll(create(part.getType().getStateMachine()));

        return children;
    }

    private List<GModelElement> create(StateMachine stateMachine) {
	    // RETURNS A COLLECTION OF ALL NODES AND EDGES OF STATE MACHINE
        List<GModelElement> elements = new ArrayList<>();

//	    List<GNode> states = new ArrayList<>();
//        List<GEdge> transitions = new ArrayList<>();
//
//	    states.addAll(stateMachine.getSubstates().stream()
//                .map(stateNodeFactory::create)
//                .collect(Collectors.toList()));
//
//	    transitions.addAll(stateMachine.getTransitions().stream()
//                .map(this::create)
//                .collect(Collectors.toList()));

        List<GNode> states = stateMachine.getSubstates().stream()
                .map(stateNodeFactory::create).collect(Collectors.toList());

        List<GEdge> transitions = stateMachine.getTransitions().stream()
                .map(this::create).collect(Collectors.toList());

	    elements.addAll(states);
        elements.addAll(transitions);

	    return elements;
    }

    private GNode create(State state) {
	    GNode result = null;
        result = stateNodeFactory.create(state);
        return result;
    }

    public GEdge create(Transition transition) {
        String source = toId(transition.getSource());
        String target = toId(transition.getTarget());
        String id = toId(transition);

        GEdgeBuilder b = new GEdgeBuilder().id(id) //
                .addCssClass(CSS.EDGE) //
                .sourceId(source) //
                .targetId(target) //
                .routerKind(GConstants.RouterKind.POLYLINE);
        return b.build();
    }

//    private GCompartment buildHeader(EClassifier classifier) {
//        return new GCompartmentBuilder(Types.COMP_HEADER) //
//                .layout("hbox") //
//                .id(toId(classifier) + "_header").add(new GCompartmentBuilder(getType(classifier)) //
//                        .id(toId(classifier) + "_header_icon").build()) //
//                .add(new GLabelBuilder(Types.LABEL_NAME) //
//                        .id(toId(classifier) + "_header_label").text(classifier.getName()) //
//                        .build()) //
//                .build();
//    }

    public static GLSPServerException createFailed(EObject semanticElement) {
        return new GLSPServerException("Error during model initialization!", new Throwable(
                "No matching GModelElement found for the semanticElement of type: " + semanticElement.getClass()));
    }

    private GGraph getOrCreateRoot() {
        GModelRoot existingRoot = modelState.getRoot();
        if (existingRoot != null && existingRoot instanceof GGraph) {
            GGraph graph = (GGraph) existingRoot;
            graph.getChildren().clear();
            return graph;
        } else {
            GGraph graph = new GGraphBuilder().build();
            modelState.setRoot(graph);
            return graph;
        }
    }


}
