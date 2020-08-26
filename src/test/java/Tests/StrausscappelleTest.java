package Tests;

import Config.TestConfig;
import Pages.NarzedziaNonStopPage;
import Pages.StrausscappellePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class StrausscappelleTest extends TestConfig {

    @Test
    public void strausscappelleTest() {
        String url = "https://strausscapelle.com/";
        getUrl(url);
        WebDriver driver = getDriver();
        StrausscappellePage test = new StrausscappellePage();
        System.out.println("*** Strauss capelle Vienna page ***");
        test.checkHeaderVisibility(test.getHeader());
        test.checkUrl(driver, url);
    }
}
