package val;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class App {
    public static String configuredLog(String message) throws Exception {
        File log = File.createTempFile("cfg", ".log");
        File conf = File.createTempFile("log4j", ".properties");
        FileWriter w = new FileWriter(conf);
        w.write("log4j.rootLogger=INFO, F\n");
        w.write("log4j.appender.F=org.apache.log4j.FileAppender\n");
        w.write("log4j.appender.F.File=" + log.getAbsolutePath().replace("\\", "/") + "\n");
        w.write("log4j.appender.F.layout=org.apache.log4j.PatternLayout\n");
        w.write("log4j.appender.F.layout.ConversionPattern=%m%n\n");
        w.close();
        PropertyConfigurator.configure(conf.getAbsolutePath());
        Logger.getRootLogger().info(message);
        return new String(Files.readAllBytes(log.toPath()));
    }
}
