package KloiaWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "search-title")
    public WebElement searchTitle;

    @FindBy(linkText = "DJI Mini 2 Fly More Combo Quadcopter with Remote Controller")
    public WebElement dji;
    // search-title
}

