package val;

import java.io.File;
import org.apache.commons.configuration2.INIConfiguration;
import org.apache.commons.configuration2.SubnodeConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;

public class App {
    public static String get(File file, String section, String key) throws Exception {
        INIConfiguration ini = new Configurations().ini(file);
        SubnodeConfiguration sec = ini.getSection(section);
        return sec.getString(key);
    }
}
