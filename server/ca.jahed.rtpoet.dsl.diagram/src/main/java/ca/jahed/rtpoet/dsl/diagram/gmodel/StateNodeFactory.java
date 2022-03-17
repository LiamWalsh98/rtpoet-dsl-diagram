package ca.jahed.rtpoet.dsl.diagram.gmodel;

import ca.jahed.rtpoet.dsl.diagram.model.RTPoetModelState;
import ca.jahed.rtpoet.dsl.diagram.util.RTPoetConfig.*;
import ca.jahed.rtpoet.dsl.rt.*;
import org.eclipse.glsp.graph.GLabel;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.builder.impl.GEdgePlacementBuilder;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.graph.util.GConstants;

public class StateNodeFactory extends AbstractGModelFactory<State, GNode>{

//    private RTPoetGModelFactory parentFactory; // not needed for now

//    public StateNodeFactory(RTPoetModelState modelState, RTPoetGModelFactory gModelFactory) {
//        super(modelState);
//        this.parentFactory = gModelFactory;
//    }

    public StateNodeFactory(RTPoetModelState modelState) {
        super(modelState);
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
                .size(80,80)
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        if (state.getName() != null) {
            b.add(createStateNameLabel(state.getName(), Types.STATE_NAME));
        }
        return b.build();
    }

    public GNode create(CompositeState state) {
        GNodeBuilder b = new GNodeBuilder(Types.COMPOSITE_STATE) //
                .id(toId(state)) //
                .size(80,80)
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
                .size(30,30)
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    public GNode create(ExitPoint state) {
        GNodeBuilder b = new GNodeBuilder(Types.EXIT_POINT) //
                .id(toId(state)) //
                .size(30,30)
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    public GNode create(InitialPoint state) {
        GNodeBuilder b = new GNodeBuilder(Types.INITIAL_POINT) //
                .id(toId(state)) //
                .size(20,20)
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    public GNode create(JunctionPoint state) {
        GNodeBuilder b = new GNodeBuilder(Types.JUNCTION_POINT) //
                .id(toId(state)) //
                .size(50,50)
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    public GNode create(ChoicePoint state) {
        GNodeBuilder b = new GNodeBuilder(Types.CHOICE_POINT) //
                .id(toId(state)) //
                .size(30,30)
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    public GNode create(DeepHistory state) {
        GNodeBuilder b = new GNodeBuilder(Types.DEEP_HISTORY) //
                .id(toId(state)) //
                .size(30,30)
                .layout(GConstants.Layout.VBOX) //
                .addCssClass(CSS.NODE); //
        return b.build();
    }

    private GLabel createStateNameLabel(String label, String type) {
        return new GLabelBuilder(type) //
                .edgePlacement(new GEdgePlacementBuilder()//
                        .side(GConstants.HAlign.CENTER)//
                        .offset(2d) //
                        .rotate(false) //
                        .build())//
                .text(label).build();

//        return new GLabelBuilder(type) //
////                .addCssClass(CSS.ITALIC)//
//                .text(label) //
//                .build();
    }

 }
