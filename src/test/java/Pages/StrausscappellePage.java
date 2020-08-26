package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Config.WebDriverSingledon.getInstance;

public class StrausscappellePage extends Methods{


    public StrausscappellePage() {
        super();
        PageFactory.initElements(getInstance(), this);
    }

    @FindBy(id = "wrapper-header")
    private WebElement indexHeader;

    public WebElement getHeader() {
        return indexHeader;
    }
}
