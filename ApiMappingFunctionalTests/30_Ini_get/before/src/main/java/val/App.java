package val;

import java.io.File;
import org.ini4j.Ini;

public class App {
    public static String get(File file, String section, String key) throws Exception {
        Ini ini = new Ini(file);
        return ini.get(section, key);
    }
}
