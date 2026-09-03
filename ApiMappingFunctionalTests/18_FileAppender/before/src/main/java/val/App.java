package val;

import java.io.File;
import java.nio.file.Files;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class App {
    public static String writeLog(String message) throws Exception {
        File log = File.createTempFile("app", ".log");
        FileAppender appender = new FileAppender(new PatternLayout("%m%n"), log.getAbsolutePath());
        Logger logger = Logger.getLogger("val.app");
        logger.removeAllAppenders();
        logger.addAppender(appender);
        logger.setAdditivity(false);
        logger.info(message);
        appender.close();
        return new String(Files.readAllBytes(log.toPath()));
    }
}
