package val;

import java.io.File;
import org.jdom.input.SAXBuilder;

public class App {
    public static String rootName(File file) throws Exception {
        return new SAXBuilder().build(file).getRootElement().getName();
    }
}
