package ca.jahed.rtpoet.dsl.diagram.toolpalette;

import ca.jahed.rtpoet.dsl.diagram.util.RTPoetConfig.*;
import com.google.common.collect.Lists;
import org.eclipse.glsp.server.actions.TriggerEdgeCreationAction;
import org.eclipse.glsp.server.actions.TriggerNodeCreationAction;
import org.eclipse.glsp.server.features.toolpalette.PaletteItem;
import org.eclipse.glsp.server.features.toolpalette.ToolPaletteItemProvider;
import org.eclipse.glsp.server.model.GModelState;

import java.util.List;
import java.util.Map;

public class RTPoetToolPaletteItemProvider implements ToolPaletteItemProvider {

	@Override
	public List<PaletteItem> getItems(Map<String, String> args, GModelState modelState) {
		System.err.println("Create palette");
		return Lists.newArrayList(nodes(), edges(), attributes());
	}

	private PaletteItem nodes() {
        PaletteItem createState = node(Types.SIMPLE_STATE, "Simple State");

//		PaletteItem createCapsule = node("RTPoet:Capsule", "Capsule");
//        PaletteItem createCapsulePart = node("RTPoet:CapsulePart", "CapsulePart");
//        PaletteItem createPort = node("RTPoet:Port", "Port");


//        PaletteItem createAbstract = node("RTPoet:", "Abstract");
//		PaletteItem createInterface = node(Types.INTERFACE, "Interface");
//		PaletteItem createEnum = node(Types.ENUM, "Enum");
//		PaletteItem createDataType = node(Types.DATATYPE, "DataType");

		List<PaletteItem> nodes = Lists.newArrayList(createState);
		return PaletteItem.createPaletteGroup("rtpoet.node", "Nodes", nodes);
	}

	private PaletteItem edges() {
        PaletteItem createTransition = edge(Types.TRANSITION, "Transition");

//		PaletteItem createConnector = edge("RTPoet:Connector", "Connector");
//		PaletteItem createComposition = edge(Types.COMPOSITION, "Containment");
//		PaletteItem createInheritance = edge(Types.INHERITANCE, "Inheritance");
//		PaletteItem createBiReference = edge(Types.BIDIRECTIONAL_REFERENCE, "Bi-Directional Reference");
//		PaletteItem createBiComposition = edge(Types.BIDIRECTIONAL_COMPOSITION, "Bi-Directional Containment");

		List<PaletteItem> edges = Lists.newArrayList(createTransition);
		return PaletteItem.createPaletteGroup("rtpoet.edge", "Edges", edges);
	}

	private PaletteItem attributes() {
		PaletteItem createAttributeOperation = node(Types.ATTRIBUTE, "Attribute");
//		PaletteItem createEnumLiteral = node("Types.ENUMLITERAL", "Literal");

		List<PaletteItem> attributes = Lists.newArrayList(createAttributeOperation);
		
		return PaletteItem.createPaletteGroup("rtpoet.attribute", "Attribute", attributes);
	}

	private PaletteItem node(String elementTypeId, String label) {
		return new PaletteItem(elementTypeId, label, new TriggerNodeCreationAction(elementTypeId));
	}

	private PaletteItem edge(String elementTypeId, String label) {
		return new PaletteItem(elementTypeId, label, new TriggerEdgeCreationAction(elementTypeId));
	}
}
