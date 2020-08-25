package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Config.WebDriverSingledon.getInstance;

public class ConsortePage extends Methods {

    public ConsortePage() {
        super();
        PageFactory.initElements(getInstance(), this);
    }

    @FindBy(id = "header")
    private WebElement indexHeader;

    public WebElement getHeader() {
        return indexHeader;
    }
}
