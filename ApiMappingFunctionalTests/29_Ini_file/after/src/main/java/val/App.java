package val;

import java.io.File;
import org.apache.commons.configuration2.INIConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;

public class App {
    public static String get(File file, String section, String key) throws Exception {
        Configurations configurations = new Configurations();
        INIConfiguration ini = configurations.ini(file);
        return ini.getSection(section).getString(key);
    }
}
