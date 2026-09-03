package val;

import java.io.ByteArrayOutputStream;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

public class App {
    public static String writeRoot(String text) throws Exception {
        Document doc = new Document(new Element("root").setText(text));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        new XMLOutputter().output(doc, out);
        return out.toString("UTF-8");
    }
}
