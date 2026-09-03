package val;

import java.io.File;
import java.io.FileWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void readsSectionKey() throws Exception {
        File f = File.createTempFile("cfg", ".ini");
        FileWriter w = new FileWriter(f);
        w.write("[sec]\nkey = val\n");
        w.close();
        Assertions.assertEquals("val", App.get(f, "sec", "key"));
    }
}
