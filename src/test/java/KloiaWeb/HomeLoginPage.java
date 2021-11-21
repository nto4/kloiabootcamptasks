package KloiaWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLoginPage {
    public HomeLoginPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }
    @FindBy(css = ".plButton-label.v-ellipsis")
    public WebElement hiUsername;


// plButton-label v-ellipsis
}
