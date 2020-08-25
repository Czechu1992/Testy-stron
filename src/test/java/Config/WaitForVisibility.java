package Config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Config.WebDriverSingledon.getInstance;


public class WaitForVisibility {

    static final int WAIT_TIMEOUT = 10;
    private static WebDriverWait wait = new WebDriverWait(getInstance(), WAIT_TIMEOUT);

    public static void waitForVisibilityOfElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
