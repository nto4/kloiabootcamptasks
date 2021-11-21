package KloiaWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductDetailPage {

    public ProductDetailPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h1")
    public WebElement productDetailText;

    @FindBy(className = "save-for-later-save")
    public WebElement saveButton;

    @FindBy(xpath = "//span[text()='Saved Items']")
    public WebElement savedItems;

    @FindBy(className = "see-all-link")
    public List<WebElement> savedItemPage;

}
