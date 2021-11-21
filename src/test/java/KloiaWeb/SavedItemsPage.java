package KloiaWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SavedItemsPage {

    public SavedItemsPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".v-line-clamp.title")
    public WebElement savedItem;

}
