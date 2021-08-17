package ca.jahed.rtpoet.dsl.diagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.diagram.EdgeTypeHint;
import org.eclipse.glsp.server.diagram.ShapeTypeHint;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class RTPoetDiagramConfiguration implements DiagramConfiguration {

   @Override
   public String getDiagramType() { return "rtpoet-diagram"; }

   @Override
   public Map<String, EClass> getTypeMappings() { return DefaultTypes.getDefaultTypeMappings(); }
   // todo: map types

   @Override
   public List<ShapeTypeHint> getNodeTypeHints() {
      return List.of(new ShapeTypeHint(DefaultTypes.NODE, true, true, true, false));
   }
   // todo: map node shape types

   @Override
   public List<EdgeTypeHint> getEdgeTypeHints() { return Collections.emptyList(); }
   // todo: map edge shape types 

}
