package val;

import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void acceptsAlert() throws Exception {
        Path html = Files.createTempFile("alert", ".html");
        Files.write(html, ("<!DOCTYPE html><html><body>"
                + "<button id=\"b\" onclick=\"alert('hi')\">go</button>"
                + "</body></html>").getBytes());
        Assertions.assertTrue(App.acceptAlert(html));
    }
}
