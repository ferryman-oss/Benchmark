package val;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;

public class App {
    public static String configuredLog(String message) throws Exception {
        File log = File.createTempFile("cfg", ".log");
        File conf = File.createTempFile("logback", ".xml");
        FileWriter w = new FileWriter(conf);
        w.write("<configuration><appender name=\"F\" class=\"ch.qos.logback.core.FileAppender\">");
        w.write("<file>" + log.getAbsolutePath() + "</file>");
        w.write("<encoder><pattern>%msg%n</pattern></encoder></appender>");
        w.write("<root level=\"INFO\"><appender-ref ref=\"F\"/></root></configuration>");
        w.close();
        LoggerContext ctx = (LoggerContext) LoggerFactory.getILoggerFactory();
        ctx.reset();
        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(ctx);
        configurator.doConfigure(conf.getAbsolutePath());
        ((Logger) LoggerFactory.getLogger("ROOT")).info(message);
        return new String(Files.readAllBytes(log.toPath()));
    }
}
