package ca.jahed.rtpoet.dsl.diagram.gmodel;

import ca.jahed.rtpoet.dsl.diagram.model.RTPoetModelState;
import ca.jahed.rtpoet.dsl.rt.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.glsp.graph.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CapsuleGraphFactory extends AbstractGModelFactory<Capsule, GModelElement>{

    private StateNodeFactory stateNodeFactory;


    public CapsuleGraphFactory(RTPoetModelState modelState) {
        super(modelState);
        stateNodeFactory = new StateNodeFactory(modelState);
    }

    @Override
    public GGraph create(Capsule capsule) {
        List<GModelElement> elements = new ArrayList<>();

//        List<GNode> states = capsule.getSubstates().stream()
//                .map(stateNodeFactory::create).collect(Collectors.toList());
//
//        List<GEdge> transitions = stateMachine.getTransitions().stream()
//                .map(this::create).collect(Collectors.toList());
//
//        elements.addAll(states);
//        elements.addAll(transitions);
//
//        return elements;

        //parts

        List<GNode> parts = capsule.getParts().stream()
                .map(this::create).collect(Collectors.toList());

        //ports

        List<GPort> ports = capsule.getPorts().stream()
                .map(this::create).collect(Collectors.toList());

        //connectors

        List<GEdge> connectors = capsule.getConnectors().stream()
                .map(this::create).collect(Collectors.toList());

        elements.addAll(parts);
//todo: elements.addAll(ports);
//todo: elements.addAll(connectors);

        return null;
    }

    private GNode create(Part part) {
        return null;
    }

    private GPort create(Port port) {
        return null;
    }

    private GEdge create(Connector connector) {
        return null;
    }


    private GNode create(State state) {
        GNode result = null;
        result = stateNodeFactory.create(state);
        result.setId(toId(state));
        return result;
    }

}
