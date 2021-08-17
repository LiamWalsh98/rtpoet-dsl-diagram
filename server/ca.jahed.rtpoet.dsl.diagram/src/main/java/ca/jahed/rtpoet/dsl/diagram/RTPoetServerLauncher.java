package ca.jahed.rtpoet.dsl.diagram;

import java.io.IOException;

import org.apache.commons.cli.ParseException;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.eclipse.glsp.server.launch.DefaultCLIParser;
import org.eclipse.glsp.server.launch.DefaultGLSPServerLauncher;
import org.eclipse.glsp.server.launch.GLSPServerLauncher;
import org.eclipse.glsp.server.utils.LaunchUtil;

public final class RTPoetServerLauncher {
   private RTPoetServerLauncher() {}

   @SuppressWarnings("checkstyle:uncommentedmain")
   public static void main(final String[] args) {
      try {
         DefaultCLIParser cliParser = new DefaultCLIParser(args, "rtpoet server");
         LaunchUtil.configure(cliParser);
         GLSPServerLauncher launcher = new DefaultGLSPServerLauncher(new RTPoetGLSPModule());
         int port = cliParser.parsePort();
         launcher.start("localhost", port);
      } catch (ParseException | IOException e) {
         e.printStackTrace();
      }
   }

   public static void configureLogger() {
      Logger root = Logger.getRootLogger();
      if (!root.getAllAppenders().hasMoreElements()) {
         root.addAppender(new ConsoleAppender(
            new PatternLayout(PatternLayout.TTCC_CONVERSION_PATTERN)));
      }
      root.setLevel(Level.DEBUG);
   }

}
