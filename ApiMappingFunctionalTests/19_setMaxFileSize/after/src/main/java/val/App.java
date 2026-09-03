package val;

import java.io.File;
import java.nio.file.Files;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.rolling.FixedWindowRollingPolicy;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import ch.qos.logback.core.util.FileSize;

public class App {
    public static String writeLog(String message) throws Exception {
        File log = File.createTempFile("roll", ".log");
        LoggerContext ctx = new LoggerContext();
        RollingFileAppender<ILoggingEvent> appender = new RollingFileAppender<ILoggingEvent>();
        appender.setContext(ctx);
        appender.setFile(log.getAbsolutePath());
        PatternLayoutEncoder encoder = new PatternLayoutEncoder();
        encoder.setContext(ctx);
        encoder.setPattern("%msg%n");
        encoder.start();
        appender.setEncoder(encoder);
        SizeBasedTriggeringPolicy<ILoggingEvent> policy = new SizeBasedTriggeringPolicy<ILoggingEvent>();
        policy.setContext(ctx);
        FileSize size = FileSize.valueOf("10KB");
        policy.setMaxFileSize(size);
        policy.start();
        appender.setTriggeringPolicy(policy);
        FixedWindowRollingPolicy rolling = new FixedWindowRollingPolicy();
        rolling.setContext(ctx);
        rolling.setParent(appender);
        rolling.setFileNamePattern(log.getAbsolutePath() + ".%i");
        rolling.start();
        appender.setRollingPolicy(rolling);
        appender.start();
        Logger logger = ctx.getLogger("val.roll");
        logger.addAppender(appender);
        logger.setAdditive(false);
        logger.info(message);
        appender.stop();
        return new String(Files.readAllBytes(log.toPath()));
    }
}
