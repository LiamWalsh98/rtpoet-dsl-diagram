package ca.jahed.rtpoet.dsl.diagram.gmodel;

import ca.jahed.rtpoet.dsl.diagram.model.RTPoetModelState;
import ca.jahed.rtpoet.dsl.diagram.util.RTPoetConfig.*;
import ca.jahed.rtpoet.dsl.rt.*;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.graph.impl.GNodeImpl;
import org.eclipse.glsp.graph.util.GConstants;

public class StateNodeFactory extends AbstractGModelFactory<State, GNode>{

    private GModelFactory parentFactory; // not needed for now

    public StateNodeFactory(RTPoetModelState modelState, GModelFactory gModelFactory) {
        super(modelState);
        this.parentFactory = gModelFactory;
    }

    @Override
    public GNode create(State state) {
        if (state instanceof SimpleState) {
            return create((SimpleState) state);
        } else if (state instanceof CompositeState) {
            return create((CompositeState) state);
        } else if (state instanceof PseudoState) {
            return create((PseudoState) state);
        }
        return null;
    }

    public GNode create(SimpleState state) {
        GNodeBuilder b = new GNodeBuilder(Types.SIMPLE_STATE) //
                .id(toId(state)) //
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    public GNode create(CompositeState state) {
        GNodeBuilder b = new GNodeBuilder(Types.COMPOSITE_STATE) //
                .id(toId(state)) //
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    public GNode create(PseudoState state) {
        if (state instanceof EntryPoint) {
            return create((EntryPoint) state);
        } else if (state instanceof ExitPoint) {
            return create((ExitPoint) state);
        } else if (state instanceof InitialPoint) {
            return create((InitialPoint) state);
        } else if (state instanceof JunctionPoint) {
            return create((JunctionPoint) state);
        } else if (state instanceof ChoicePoint) {
            return create((ChoicePoint) state);
        } else if (state instanceof DeepHistory) {
            return create((DeepHistory) state);
        }
        return null;
    }

    public GNode create(EntryPoint state) {
        GNodeBuilder b = new GNodeBuilder(Types.ENTRY_POINT) //
                .id(toId(state)) //
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    public GNode create(ExitPoint state) {
        GNodeBuilder b = new GNodeBuilder(Types.EXIT_POINT) //
                .id(toId(state)) //
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    public GNode create(InitialPoint state) {
        GNodeBuilder b = new GNodeBuilder(Types.INITIAL_POINT) //
                .id(toId(state)) //
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    public GNode create(JunctionPoint state) {
        GNodeBuilder b = new GNodeBuilder(Types.JUNCTION_POINT) //
                .id(toId(state)) //
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    public GNode create(ChoicePoint state) {
        GNodeBuilder b = new GNodeBuilder(Types.CHOICE_POINT) //
                .id(toId(state)) //
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    public GNode create(DeepHistory state) {
        GNodeBuilder b = new GNodeBuilder(Types.DEEP_HISTORY) //
                .id(toId(state)) //
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

 }
