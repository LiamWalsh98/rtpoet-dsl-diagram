package ca.jahed.rtpoet.dsl.diagram;

import ca.jahed.rtpoet.dsl.diagram.handler.RTPoetCreateNodeOperationHandler;
import org.eclipse.glsp.server.di.DefaultGLSPModule;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.features.core.model.JsonFileModelFactory;
import org.eclipse.glsp.server.features.core.model.ModelFactory;
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
      binding.add(RTPoetCreateNodeOperationHandler.class);
   }

   @Override
   protected Class<? extends ModelFactory> bindModelFactory() {
      return JsonFileModelFactory.class;
   }

}
