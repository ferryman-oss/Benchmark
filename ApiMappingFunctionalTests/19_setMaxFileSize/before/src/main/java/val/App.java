package val;

import java.io.File;
import java.nio.file.Files;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class App {
    public static String writeLog(String message) throws Exception {
        File log = File.createTempFile("roll", ".log");
        RollingFileAppender appender = new RollingFileAppender(new PatternLayout("%m%n"), log.getAbsolutePath());
        appender.setMaxFileSize("10KB");
        appender.activateOptions();
        Logger logger = Logger.getLogger("val.roll");
        logger.removeAllAppenders();
        logger.addAppender(appender);
        logger.setAdditivity(false);
        logger.info(message);
        appender.close();
        return new String(Files.readAllBytes(log.toPath()));
    }
}
