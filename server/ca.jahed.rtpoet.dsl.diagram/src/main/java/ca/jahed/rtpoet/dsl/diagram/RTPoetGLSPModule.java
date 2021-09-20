package ca.jahed.rtpoet.dsl.diagram;

import ca.jahed.rtpoet.dsl.diagram.handler.RTPoetCreateStateOperationHandler;
import ca.jahed.rtpoet.dsl.diagram.model.RTPoetModelFactory;
import ca.jahed.rtpoet.dsl.diagram.model.RTPoetModelStateProvider;
import ca.jahed.rtpoet.dsl.diagram.toolpalette.RTPoetToolPaletteItemProvider;
import org.eclipse.glsp.server.di.DefaultGLSPModule;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.features.core.model.ModelFactory;
import org.eclipse.glsp.server.features.toolpalette.ToolPaletteItemProvider;
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
    }

    @Override
    protected Class<? extends ModelFactory> bindModelFactory() {
      return RTPoetModelFactory.class;
   }

    @Override
    protected Class<? extends ToolPaletteItemProvider> bindToolPaletteItemProvider() {
        return RTPoetToolPaletteItemProvider.class;
    }

    @Override
    protected Class<? extends ModelStateProvider> bindModelStateProvider() {
        return RTPoetModelStateProvider.class;
    }

}
