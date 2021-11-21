package KloiaWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeadphonesFilterPage {

    public HeadphonesFilterPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//ul//li//button")
    public List<WebElement> showMoreList;

    @FindBy(id = "brand_facet-Philips-modal-23")
    public WebElement philipsCheckBox;

    @FindBy(css = ".c-button.c-button-secondary.c-button-md.large-facet-group-show-results")
    public WebElement showResultsButton;

    @FindBy(className = "image-link")
    public List<WebElement> products;

}
