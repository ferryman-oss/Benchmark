package val;

import java.nio.file.Path;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class App {
    public static String selectByVisibleText(Path html, String label) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--no-sandbox", "--disable-gpu");
        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get(html.toUri().toString());
            Select select = new Select(driver.findElement(By.id("s")));
            select.selectByVisibleText(label);
            return select.getFirstSelectedOption().getText();
        } finally {
            driver.quit();
        }
    }
}
