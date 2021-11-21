package KloiaWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeadphonesPage {

    public HeadphonesPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    //@FindBy(css = "#shop-header-91c7058f-ab8a-4e59-bd7b-7cbf4c84e7fc > div > div.header-hamburger.scroll-locked-hamburger > header > div.top-fluid-container.flyout-open > div > nav > div > div > ul > li.hamburger-menu-empty-flyout-list-item > div > ul > li:nth-child(11) > a")
    //public WebElement allHeadphones;
    //All Headphones

    //calisan
    @FindBy(css = "#widget-f2ddba8d-72b8-4ced-9847-0a13c404ee9e > div > nav > div:nth-child(1) > a")
    public WebElement allHeadphones;

   // @FindBy(className ="navigation-link")
    //public WebElement allHeadphones;
}
