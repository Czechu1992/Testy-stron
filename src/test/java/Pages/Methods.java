package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Config.WaitForVisibility.waitForVisibilityOfElement;

public class Methods {

    public void checkHeaderVisibility(WebElement webElement) {
        waitForVisibilityOfElement(webElement);
        if (webElement.isDisplayed()) {
            System.out.println("Header się wyświetla");
        } else {
            System.out.println("Header się NIE WYŚWIETLA !!!!!!!!!!!!!");
        }
    }

    public void checkUrl(WebDriver driver, String url) {
        Assert.assertEquals(driver.getCurrentUrl(), url);
        System.out.println("Wyświetlany adres url: " + driver.getCurrentUrl());
    }
}
