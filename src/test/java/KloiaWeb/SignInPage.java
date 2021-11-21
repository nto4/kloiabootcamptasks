package KloiaWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "fld-e")
    public WebElement emailField;

    @FindBy(id = "fld-p1")
    public WebElement passwordField;

   // @FindBy(css = "c-button.c-button-secondary.c-button-lg.c-button-block.c-button-icon.c-button-icon-leading.cia-form__controls__submit ")
    @FindBy(css = "body > div.cia-app-container > div > section > main > div.cia-wrapper__main > div.cia-content.js-cia-content > div > div > div > div > div > form > div.cia-form__controls > button")
    public  WebElement signInButton;

    @FindBy(css = "body > div.cia-app-container > div > section > main > div.cia-wrapper__main > div.cia-content.js-cia-content > div > div > div > div > div > div:nth-child(5) > button")
    public WebElement googleSignInButton;


}
