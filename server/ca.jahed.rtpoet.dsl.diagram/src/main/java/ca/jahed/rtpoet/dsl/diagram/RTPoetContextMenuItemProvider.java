package ca.jahed.rtpoet.dsl.diagram;

import com.google.common.collect.Lists;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.features.contextmenu.ContextMenuItemProvider;
import org.eclipse.glsp.server.features.contextmenu.MenuItem;
import org.eclipse.glsp.server.features.core.model.RequestModelAction;
import org.eclipse.glsp.server.model.GModelState;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RTPoetContextMenuItemProvider implements ContextMenuItemProvider {
    @Override
    public List<MenuItem> getItems(List<String> selectedElementIds, GPoint position, Map<String, String> args, GModelState modelState) {
        // todo: implement below logic.
        System.err.println("Create context menu");
        List<MenuItem> contextItems = Lists.newArrayList();

        //  if selected element ID's is a "drill down" type,
        //  then add a trigger to "drill down"
//        if (selectedElementIds.size() == 1) {
            //todo: check if it's also a compatible element
            contextItems.add(getMenuItemOpenAsGraph(selectedElementIds.get(0)));
//        }

        return contextItems;

    }

    private MenuItem getMenuItemOpenAsGraph(String elementId) {
        Map<String, String> arguments = new HashMap<>();
        arguments.put("id", elementId);
        Action action = new RequestModelAction(arguments);

        List<Action> node = Lists.newArrayList(action);

        MenuItem item = new MenuItem("openGraph", "Open as Graph", node, true);

        return item;
    }


}
