package KloiaWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[alt='United States']")
    public WebElement countryIcon;

    @FindBy(id = "gh-search-input")
    public WebElement searchBox;

    @FindBy(xpath = "//span[text()='Account']")
    public WebElement accountMenu;

    @FindBy(css = ".c-close-icon.c-modal-close-icon")
    public WebElement closeButton;

    @FindBy(linkText = "Create Account")
    public WebElement createAccount;

    @FindBy(linkText = "Sign In")
    public WebElement signIn;

    @FindBy(css = ".c-button-unstyled.hamburger-menu-button")
    public  WebElement menu;

   @FindBy(css = ".c-button-unstyled.hamburger-menu-flyout-list-item")
   public List<WebElement> menuList;

    @FindBy(css = ".c-button-unstyled.hamburger-menu-flyout-list-item")
    public List<WebElement> audioMenuList;

    @FindBy(className = "hamburger-menu-flyout-list-item")
    public List<WebElement> headphoneMenuList;

    @FindBy(xpath = "//ul//li//button")
    public List<WebElement> showMoreList;

}
