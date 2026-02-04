import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FormPage;
import pages.ConfirmationPage;

import static org.junit.Assert.assertEquals;

public class FormTest {

    @Test
    public void submitFormTest() {

        System.setProperty("webdriver.chrome.driver", "/Users/jobj/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.fillAndSubmitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        driver.quit();
    }
}
