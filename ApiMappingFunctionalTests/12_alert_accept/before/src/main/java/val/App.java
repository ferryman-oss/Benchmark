package val;

import java.nio.file.Path;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static boolean acceptAlert(Path html) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--no-sandbox", "--disable-gpu");
        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get(html.toUri().toString());
            driver.findElement(By.id("b")).click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            return true;
        } finally {
            driver.quit();
        }
    }
}
