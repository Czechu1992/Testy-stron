package Tests;

import Config.TestConfig;
import Pages.ComputerSoftPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ComputerSoftTest extends TestConfig {

    @Test
    public void computerSoftTest(){
        String url = "https://computersoft.net.pl/";
        getUrl(url);
        WebDriver driver = getDriver();
        ComputerSoftPage test = new ComputerSoftPage();
        System.out.println("*** Computer soft page ***");
        test.checkHeaderVisibility(test.getHeader());
        test.checkUrl(driver, url);
    }
}
