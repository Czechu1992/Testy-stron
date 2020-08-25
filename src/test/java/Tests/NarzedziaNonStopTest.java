package Tests;

import Config.TestConfig;
import Pages.NarzedziaNonStopPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NarzedziaNonStopTest extends TestConfig {

    @Test
    public void narzedziaNonStopTest() {
        String url = "https://narzedzianonstop.pl/";
        getUrl(url);
        WebDriver driver = getDriver();
        NarzedziaNonStopPage test = new NarzedziaNonStopPage();
        System.out.println("*** Narzędzia non stop page ***");
        test.checkHeaderVisibility(test.getHeader());
        test.checkUrl(driver, url);
    }
}
