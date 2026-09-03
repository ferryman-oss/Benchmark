package val;

import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void selectsVisibleLabel() throws Exception {
        Path html = Files.createTempFile("sel", ".html");
        Files.write(html, ("<!DOCTYPE html><html><body>"
                + "<select id=\"s\"><option>A</option><option>B</option></select>"
                + "</body></html>").getBytes());
        Assertions.assertEquals("B", App.selectByVisibleText(html, "B"));
    }
}
