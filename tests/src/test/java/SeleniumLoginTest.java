import org.junit.*;

import java.net.URL;
import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumLoginTest {

    private WebDriver driver;
    

    @Before
    public void Setup() throws MalformedURLException {
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        this.driver = new RemoteWebDriver(new URL("http://selenium:4444/wd/hub"), options);
        this.driver.manage().window().maximize();
    }

    @Test  
    public void loginLogoutTests() throws InterruptedException {
        LoginLogoutTest loginLogoutTest = new LoginLogoutTest(driver);

        //Login test
        loginLogoutTest.typeIntoUsernameField("mileydxy@163.com \n");
        loginLogoutTest.typeIntoPasswordField("Aaa1234567");
        loginLogoutTest.clickTheSignInButton();
        Thread.sleep(3000);

        //Login check
        Assert.assertTrue(loginLogoutTest.getLoginPageTitle().contains("Your unified login to everything Qt"));

        // Logout test
        loginLogoutTest.clickTheLogoutButton();

        //Logout test
        Assert.assertTrue(loginLogoutTest.getLogoutPageTitle().contains("Thank you for visiting Qt Account. See you again soon."));
        
    }
    

    @Test
    public void profilePageTest () throws InterruptedException {
        LoginLogoutTest loginLogoutTest = new LoginLogoutTest(driver);
        ProfilePageTest profilePage = new ProfilePageTest(driver);

        //login
        loginLogoutTest.typeIntoUsernameField("mileydxy@163.com \n");
        loginLogoutTest.typeIntoPasswordField("Aaa1234567");
        loginLogoutTest.clickTheSignInButton();
        Thread.sleep(3000);

        //change to profile page
        profilePage.ProfilePageElement();
        Assert.assertTrue(profilePage.getTitleOfProfilePage().contains("My Profile"));

        //fill the text boxes
        profilePage.typeIntoFirstnameText("Xiaoyan");
        profilePage.typeIntoLastnameText("Du");
        // profilePage.typeIntoCompanyText("ELTE");
        Thread.sleep(3000);

        //choose the check box
        profilePage.chooseCheckboxElement();

        //upload the profile informations
        profilePage.clickUploadButton();
        Thread.sleep(3000);
        // profilePage.successfulUploaded();
        // Assert.assertTrue(profilePage.successfulUploaded().contains("Your profile was updated successfully"));
    }

    @Test
    public void historyTest () throws InterruptedException {
        LoginLogoutTest loginLogoutTest = new LoginLogoutTest(driver);
        ProfilePageTest profilePage = new ProfilePageTest(driver);
        SupportPageTest supportPageTest = new SupportPageTest(driver);

        //login
        loginLogoutTest.typeIntoUsernameField("mileydxy@163.com \n");
        loginLogoutTest.typeIntoPasswordField("Aaa1234567");
        loginLogoutTest.clickTheSignInButton();
        Thread.sleep(3000);

        //change to profile page
        profilePage.ProfilePageElement();
        Assert.assertTrue(profilePage.getTitleOfProfilePage().contains("My Profile"));
        Thread.sleep(3000);

        //change to support page
        supportPageTest.SupportPageElement();
        Assert.assertTrue(profilePage.getTitleOfProfilePage().contains("Support center"));
        Thread.sleep(3000);

        //browse back button
        this.driver.navigate().back();
        Thread.sleep(3000);
        Assert.assertTrue(loginLogoutTest.getLoginPageTitle().contains("My Profile"));

        this.driver.navigate().back();
        Thread.sleep(3000);
        Assert.assertTrue(loginLogoutTest.getLoginPageTitle().contains("Your unified login to everything Qt"));
    }

    @Test
    public void HoverTest () throws InterruptedException {
        LoginLogoutTest loginLogoutTest = new LoginLogoutTest(driver);
        HoverTest hoverTest = new HoverTest(driver);

        //login
        loginLogoutTest.typeIntoUsernameField("mileydxy@163.com \n");
        loginLogoutTest.typeIntoPasswordField("Aaa1234567");
        loginLogoutTest.clickTheSignInButton();
        Thread.sleep(3000);

        //go to the download page
        hoverTest.GoToDownloadPage();

        //hover on the product option
        hoverTest.hoverOnProductOption();
        Thread.sleep(3000);
    }

    @Test
    public void DragAndDropTest () throws InterruptedException {
        DragAndDropTest dragAndDropTest = new DragAndDropTest(driver);
        LoginLogoutTest loginLogoutTest = new LoginLogoutTest(driver);

        //login
        loginLogoutTest.typeIntoUsernameField("mileydxy@163.com \n");
        loginLogoutTest.typeIntoPasswordField("Aaa1234567");
        loginLogoutTest.clickTheSignInButton();
        Thread.sleep(3000);

        //go to the download page
        dragAndDropTest.goToFAQPage();
        Thread.sleep(3000);

        dragAndDropTest.dragElementToSearchField();
        Thread.sleep(3000);
    }

    @Test
    public void CookieTest () throws InterruptedException {
        CookieTest cookieTest = new CookieTest(driver);
        LoginLogoutTest loginLogoutTest = new LoginLogoutTest(driver);

        //login
        loginLogoutTest.typeIntoUsernameField("mileydxy@163.com \n");
        loginLogoutTest.typeIntoPasswordField("Aaa1234567");
        loginLogoutTest.clickTheSignInButton();
        Thread.sleep(3000);

        //go to the download page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.alert = function() {};");

        cookieTest.deleteCookies();

        Thread.sleep(3000);
    }

    @After
    public void close() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }

}
