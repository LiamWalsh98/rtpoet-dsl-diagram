package ca.jahed.rtpoet.dsl.diagram;

import ca.jahed.rtpoet.dsl.diagram.gmodel.RTPoetGModelFactory;
import ca.jahed.rtpoet.dsl.diagram.handler.RTPoetCreateStateOperationHandler;
import ca.jahed.rtpoet.dsl.diagram.handler.CreateTransitionOperationHandler;
import ca.jahed.rtpoet.dsl.diagram.model.RTPoetModelSourceLoader;
import ca.jahed.rtpoet.dsl.diagram.model.RTPoetModelStateProvider;
import ca.jahed.rtpoet.dsl.diagram.toolpalette.RTPoetToolPaletteItemProvider;
import org.eclipse.glsp.server.di.DefaultGLSPModule;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.features.contextmenu.ContextMenuItemProvider;
import org.eclipse.glsp.server.features.core.model.GModelFactory;
import org.eclipse.glsp.server.features.core.model.ModelSourceLoader;
import org.eclipse.glsp.server.features.toolpalette.ToolPaletteItemProvider;
import org.eclipse.glsp.server.layout.ILayoutEngine;
import org.eclipse.glsp.server.model.ModelStateProvider;
import org.eclipse.glsp.server.operations.OperationHandler;
import org.eclipse.glsp.server.utils.MultiBinding;

public class RTPoetGLSPModule extends DefaultGLSPModule {

    @Override
    protected void configureDiagramConfigurations(final MultiBinding<DiagramConfiguration> binding) {
      binding.add(RTPoetDiagramConfiguration.class);
    }

    @Override
    protected void configureOperationHandlers(final MultiBinding<OperationHandler> binding) {
      super.configureOperationHandlers(binding);
      binding.add(RTPoetCreateStateOperationHandler.class);
      binding.add(CreateTransitionOperationHandler.class);
    }

    @Override
    protected Class<? extends ContextMenuItemProvider> bindContextMenuItemProvider() {
        return RTPoetContextMenuItemProvider.class;
    }

    @Override
    protected Class<? extends ILayoutEngine> bindLayoutEngine() {
        return RTPoetLayoutEngine.class;
    }

    @Override
    protected Class<? extends ModelSourceLoader> bindSourceModelLoader() {
      return RTPoetModelSourceLoader.class;
   }

    @Override
    protected Class<? extends ToolPaletteItemProvider> bindToolPaletteItemProvider() {
        return RTPoetToolPaletteItemProvider.class;
    }

    @Override
    protected Class<? extends ModelStateProvider> bindModelStateProvider() {
        return RTPoetModelStateProvider.class;
    }

    @Override
    protected Class<? extends GModelFactory> bindGModelFactory() {
        return null;
    }


}
