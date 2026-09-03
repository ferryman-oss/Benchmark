package val;

import java.io.File;
import java.nio.file.Files;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.FileAppender;

public class App {
    public static String writeLog(String message) throws Exception {
        File log = File.createTempFile("app", ".log");
        LoggerContext ctx = new LoggerContext();
        FileAppender<ILoggingEvent> appender = new FileAppender<ILoggingEvent>();
        PatternLayout layout = new PatternLayout();
        layout.setContext(ctx);
        layout.setPattern("%msg%n");
        layout.start();
        appender.setContext(ctx);
        appender.setLayout(layout);
        appender.setFile(log.getAbsolutePath());
        appender.start();
        Logger logger = ctx.getLogger("val.app");
        logger.addAppender(appender);
        logger.setAdditive(false);
        logger.info(message);
        appender.stop();
        return new String(Files.readAllBytes(log.toPath()));
    }
}
