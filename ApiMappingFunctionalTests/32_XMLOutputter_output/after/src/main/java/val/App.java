package val;

import java.io.ByteArrayOutputStream;
import org.dom4j.DocumentHelper;
import org.dom4j.io.XMLWriter;

public class App {
    public static String writeRoot(String text) throws Exception {
        org.dom4j.Document doc = DocumentHelper.createDocument();
        doc.addElement("root").setText(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        new XMLWriter(out).write(doc);
        return out.toString("UTF-8");
    }
}
