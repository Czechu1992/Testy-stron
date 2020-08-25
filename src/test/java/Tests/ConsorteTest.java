package Tests;

import Config.TestConfig;
import Pages.ConsortePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ConsorteTest extends TestConfig {

    @Test
    public void consorteTest() {
        String url = "https://consorte.pl/";
        getUrl(url);
        WebDriver driver = getDriver();
        ConsortePage test = new ConsortePage();
        System.out.println("*** Consorte page ***");
        test.checkHeaderVisibility(test.getHeader());
        test.checkUrl(driver, url);
    }
}
