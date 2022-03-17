package ca.jahed.rtpoet.dsl.diagram.handler;

import java.util.Map;
import java.util.Optional;

import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.server.model.GModelState;
import org.eclipse.glsp.server.operations.gmodel.CreateNodeOperationHandler;

public class RTPoetCreateNodeOperationHandler extends CreateNodeOperationHandler {

   public RTPoetCreateNodeOperationHandler() {
      super(DefaultTypes.NODE);
   }

   @Override
   protected GNode createNode(Optional<GPoint> point, Map<String,String> args , GModelState modelState) {
      GNodeBuilder builder = new GNodeBuilder(DefaultTypes.NODE)
         .size(40, 20)
         .addCssClass("rtpoet-node");
      point.ifPresent(builder::position);
      return builder.build();
   }

   @Override
   public String getLabel() { return "RTPoet Example Node"; }

}
