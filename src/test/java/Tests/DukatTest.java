package Tests;

import Config.TestConfig;
import Pages.DukatPage;
import Pages.StrausscappellePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DukatTest extends TestConfig {

    @Test
    public void dukatTest() {
        String url = "https://dukat-bizuteria.pl/";
        getUrl(url);
        WebDriver driver = getDriver();
        DukatPage test = new DukatPage();
        System.out.println("*** Dukat page ***");
        test.checkHeaderVisibility(test.getHeader());
        test.checkUrl(driver, url);
    }
}
