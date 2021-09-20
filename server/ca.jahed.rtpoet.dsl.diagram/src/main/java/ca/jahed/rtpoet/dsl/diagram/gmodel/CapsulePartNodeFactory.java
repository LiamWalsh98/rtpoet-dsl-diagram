package ca.jahed.rtpoet.dsl.diagram.gmodel;

import ca.jahed.rtpoet.dsl.diagram.model.RTPoetModelState;
import ca.jahed.rtpoet.dsl.rt.Part;
import org.eclipse.glsp.graph.GNode;

public class CapsulePartNodeFactory extends AbstractGModelFactory<Part, GNode> {


    public CapsulePartNodeFactory(RTPoetModelState modelState) {
        super(modelState);
    }

    @Override
    public GNode create(Part semanticElement) {
        return null;
    }
}
