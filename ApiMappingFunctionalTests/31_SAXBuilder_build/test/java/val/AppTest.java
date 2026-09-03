package val;

import java.io.File;
import java.io.FileWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void readsRootName() throws Exception {
        File f = File.createTempFile("doc", ".xml");
        FileWriter w = new FileWriter(f);
        w.write("<root><item>1</item></root>");
        w.close();
        Assertions.assertEquals("root", App.rootName(f));
    }
}
