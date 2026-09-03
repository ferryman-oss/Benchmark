package val;

import java.io.File;
import org.dom4j.io.SAXReader;

public class App {
    public static String rootName(File file) throws Exception {
        return new SAXReader().read(file).getRootElement().getName();
    }
}
