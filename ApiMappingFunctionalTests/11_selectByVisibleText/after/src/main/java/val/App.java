package val;

import java.nio.file.Path;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class App {
    public static String selectByVisibleText(Path html, String label) {
        try (Playwright pw = Playwright.create()) {
            Browser browser = pw.chromium().launch();
            Page page = browser.newPage();
            page.navigate(html.toUri().toString());
            Locator loc = page.locator("#s");
            loc.selectOption(new SelectOption().setLabel(label));
            String selected = (String) loc.evaluate("el => el.options[el.selectedIndex].text");
            browser.close();
            return selected;
        }
    }
}
