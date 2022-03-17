package ca.jahed.rtpoet.dsl.diagram;

import static ca.jahed.rtpoet.dsl.diagram.util.RTPoetConfig.Types.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.diagram.EdgeTypeHint;
import org.eclipse.glsp.server.diagram.ShapeTypeHint;
import org.eclipse.glsp.server.layout.ServerLayoutKind;

import java.util.*;

public class RTPoetDiagramConfiguration implements DiagramConfiguration {

    @Override
    public String getDiagramType() { return "rtpoet-diagram"; }

    @Override
    public ServerLayoutKind getLayoutKind() {
        return ServerLayoutKind.AUTOMATIC;
    }

    @Override
    public Map<String, EClass> getTypeMappings() {
       Map<String, EClass> mappings = DefaultTypes.getDefaultTypeMappings();
       mappings.put(LABEL_EDGE_NAME, GraphPackage.Literals.GLABEL);
       mappings.put(LABEL_NAME, GraphPackage.Literals.GLABEL);
       mappings.put(TRANSITION, GraphPackage.Literals.GEDGE);

       mappings.put(SIMPLE_STATE, GraphPackage.Literals.GNODE);

       // test composite state as compartment type
       mappings.put(COMPOSITE_STATE, GraphPackage.Literals.GCOMPARTMENT);

       mappings.put(INITIAL_POINT, GraphPackage.Literals.GNODE);
       mappings.put(ENTRY_POINT, GraphPackage.Literals.GNODE);
       mappings.put(CHOICE_POINT, GraphPackage.Literals.GNODE);
       mappings.put(JUNCTION_POINT, GraphPackage.Literals.GNODE);
       mappings.put(DEEP_HISTORY, GraphPackage.Literals.GNODE);

       return DefaultTypes.getDefaultTypeMappings();

    }    // todo: map types

    @Override
    public List<ShapeTypeHint> getShapeTypeHints() {
    //      return List.of(new ShapeTypeHint(DefaultTypes.NODE, false, true, false, false));

        return new ArrayList<ShapeTypeHint>();
    }   // todo: map node shape types

    @Override
    public List<EdgeTypeHint> getEdgeTypeHints() {
       List<EdgeTypeHint> edgeHints = new ArrayList<>();
       edgeHints.add(createDefaultEdgeTypeHint(DefaultTypes.EDGE));
       EdgeTypeHint transitionHint = new EdgeTypeHint(
               TRANSITION,
               false,
               true,
               true,
               Arrays.asList(INITIAL_POINT, SIMPLE_STATE),
               Arrays.asList(SIMPLE_STATE));
       edgeHints.add(transitionHint);
       return edgeHints;
    }
    // todo: finish mapping edge shape types

}
