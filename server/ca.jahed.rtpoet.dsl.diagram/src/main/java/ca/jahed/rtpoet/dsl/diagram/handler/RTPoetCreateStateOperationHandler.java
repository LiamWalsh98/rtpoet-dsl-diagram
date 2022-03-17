package ca.jahed.rtpoet.dsl.diagram.handler;

import ca.jahed.rtpoet.dsl.diagram.util.RTPoetConfig.*;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.server.model.GModelState;
import org.eclipse.glsp.server.operations.gmodel.CreateNodeOperationHandler;

import java.util.Map;
import java.util.Optional;

public class RTPoetCreateStateOperationHandler extends CreateNodeOperationHandler {

    public RTPoetCreateStateOperationHandler() {
        super(Types.SIMPLE_STATE);
    }

    @Override
    protected GNode createNode(Optional<GPoint> point, Map<String,String> args, GModelState modelState) {
        GNodeBuilder builder = new GNodeBuilder(Types.SIMPLE_STATE)
                .size(40, 20)
                .addCssClass(CSS.NODE);
        point.ifPresent(builder::position);
        return builder.build();    }

    @Override
    public String getLabel() {
        return "Simple State Creation";
    }

}
