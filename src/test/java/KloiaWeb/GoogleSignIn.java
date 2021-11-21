package KloiaWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSignIn {

    public GoogleSignIn(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "identifierId")
    public WebElement googleSignInEmail;

    @FindBy(css = ".VfPpkd-LgbsSe.VfPpkd-LgbsSe-OWXEXe-k8QpJ.VfPpkd-LgbsSe-OWXEXe-dgl2Hf.nCP5yc.AjY5Oe.DuMIQc.qIypjc.TrZEUc.lw1w4b")
    public WebElement googleNextButton;



}

//