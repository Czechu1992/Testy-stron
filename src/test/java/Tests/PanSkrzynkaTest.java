package Tests;

import Config.TestConfig;
import Pages.PanSkrzynkaPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PanSkrzynkaTest extends TestConfig {
    @Test
    public void panSkrzynkaTest() {
        String url = "https://panskrzynka.pl/";
        getUrl(url);
        WebDriver driver = getDriver();
        PanSkrzynkaPage test = new PanSkrzynkaPage();
        System.out.println("*** Pan Skrzynka page ***");
        test.checkHeaderVisibility(test.getHeader());
        test.checkUrl(driver, url);
    }
}
