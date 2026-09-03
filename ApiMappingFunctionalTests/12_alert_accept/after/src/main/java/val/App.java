package val;

import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicBoolean;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class App {
    public static boolean acceptAlert(Path html) {
        AtomicBoolean accepted = new AtomicBoolean(false);
        try (Playwright pw = Playwright.create()) {
            Browser browser = pw.chromium().launch();
            Page page = browser.newPage();
            page.onDialog(dialog -> {
                dialog.accept();
                accepted.set(true);
            });
            page.navigate(html.toUri().toString());
            page.locator("#b").click();
            browser.close();
        }
        return accepted.get();
    }
}
