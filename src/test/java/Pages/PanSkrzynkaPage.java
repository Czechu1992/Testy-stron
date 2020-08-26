package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Config.WebDriverSingledon.getInstance;

public class PanSkrzynkaPage extends Methods {
    public PanSkrzynkaPage() {
        super();
        PageFactory.initElements(getInstance(), this);
    }

    @FindBy(className = "header")
    private WebElement indexHeader;

    public WebElement getHeader() {
        return indexHeader;
    }
}
