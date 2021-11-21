package KloiaWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class POM_class {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        // AppData
        //options.addArguments("user-data-dir=C:/Users/mehmet_basaran/AppData/Local/Google/Chrome/User Data");
        //options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36");
        //options.addArguments("--profile-directory=Profile 2");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.bestbuy.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void task1() {

        HomePage homepage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        // Task1
        homepage.countryIcon.click();
        homepage.closeButton.click();
        String title = driver.getTitle();
        Assert.assertEquals("Best Buy | Official Online Store | Shop Now & Save", title);
        driver.manage().window().maximize();
        homepage.searchBox.click();
        homepage.searchBox.sendKeys("Drone");
        homepage.searchBox.sendKeys(Keys.RETURN);
        String searchHeader = searchPage.searchTitle.getText();
        Assert.assertEquals("\"Drone\"", searchHeader);
        String dji = searchPage.dji.getText();
        Assert.assertEquals("DJI Mini 2 Fly More Combo Quadcopter with Remote Controller", dji);

    }

    @Test
    public void task2() {
        HomePage homepage = new HomePage(driver);
        SignInPage signinpage = new SignInPage(driver);
        HomeLoginPage homeloginpage = new HomeLoginPage(driver);
        homepage.countryIcon.click();
        homepage.closeButton.click();
        homepage.accountMenu.click();
        homepage.signIn.click();
        signinpage.emailField.sendKeys("stabilizator1990@gmail.com");
        signinpage.passwordField.sendKeys("-px6akstZ32-NEw");
        signinpage.signInButton.sendKeys(Keys.RETURN);

        String hiUser = homeloginpage.hiUsername.getText();
        Assert.assertEquals("Hi, Steve", hiUser);
    }

    // Task 3 not complated
    @Test
    public void task3() {
        HomePage homepage = new HomePage(driver);
        SignInPage signinpage = new SignInPage(driver);
        GoogleSignIn googlesignin = new GoogleSignIn(driver);
        homepage.countryIcon.click();
        homepage.closeButton.click();
        homepage.accountMenu.click();
        homepage.signIn.click();
        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();
        signinpage.googleSignInButton.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        googlesignin.googleSignInEmail.sendKeys("stabilizator1990@gmail.com");
        googlesignin.googleNextButton.click();

        // Thread.sleep(50000);
        // Close the new window, if that window no more required
        //driver.close();
        // Switch back to original browser (first window)
        // driver.switchTo().window(winHandleBefore);
        //Thread.sleep(5000);
    }

    @Test
    public void task4() throws InterruptedException {
        HomePage homepage = new HomePage(driver);
        HeadphonesPage headphonepage = new HeadphonesPage(driver);
        HeadphonesFilterPage headphonesfilterpage = new HeadphonesFilterPage(driver);
        ProductDetailPage productdetailpage = new ProductDetailPage(driver);
        SavedItemsPage saveditemspage = new SavedItemsPage(driver);
        homepage.countryIcon.click();
        homepage.closeButton.click();
        homepage.menu.click();
        homepage.menuList.get(5).click();
        homepage.audioMenuList.get(1).click();
        homepage.headphoneMenuList.get(11).click();
        headphonepage.allHeadphones.click();
        Actions actions = new Actions(driver);
        // for guaranteed show more link is clickable
        for (WebElement x : homepage.showMoreList) {
            actions.moveToElement(x).perform();
        }
        // if dost waith my selector is select wrong elements can be choice better selector
        Thread.sleep(10000);
        headphonesfilterpage.showMoreList.get(5).click();
        headphonesfilterpage.philipsCheckBox.click();
        // if dost waith my selector is select wrong elements can be choice better selector

        Thread.sleep(10000);
        headphonesfilterpage.showResultsButton.click();

        // for guaranteed showed only philips  headphones waith until removed other brands products
        // (waith until document  ready state completed)
        checkPageIsReady(); // or can be added sleep 2-3  second
        headphonesfilterpage.products.get(1).click();
        String productDescription = productdetailpage.productDetailText.getText();
        productdetailpage.saveButton.click();
        productdetailpage.savedItems.click();
        productdetailpage.savedItemPage.get(0).click();
        Assert.assertEquals(productDescription, saveditemspage.savedItem.getText());

    }

    public void checkPageIsReady() {

        JavascriptExecutor js = (JavascriptExecutor)driver;


        //Initially bellow given if condition will check ready state of page.
        if (js.executeScript("return document.readyState").toString().equals("complete")){
            System.out.println("Page Is loaded.");
            return;
        }

        //This loop will rotate for 25 times to check If page Is ready after every 1 second.
        //You can replace your value with 25 If you wants to Increase or decrease wait time.
        for (int i=0; i<25; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {}
            //To check page ready state.
            if (js.executeScript("return document.readyState").toString().equals("complete")){
                break;
            }
        }
    }
}