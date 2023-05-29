import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLogoutTest extends PageBase {
    private By userNameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButtonField = By.className("btn");
    private By titleOfMainPage = By.xpath("//div/h1");
    private By logoutButtonField = By.xpath("//a[contains(@href,'/logout')]");
    private By titleOfLogoutPage = By.xpath("//div/h3");

    public LoginLogoutTest(WebDriver driver){
        super(driver);
        this.driver.get("https://login.qt.io/login");
    }

    public void typeIntoUsernameField (String username) {
        // username = "mileydxy@163.com \n";

        WebElement Username = waitAndReturnElement(userNameField);
        Username.sendKeys(username);
    }

    public void typeIntoPasswordField (String password) {
        // password = "Aaa1234567";

        WebElement Password = waitAndReturnElement(passwordField);
        Password.sendKeys(password);
    }

    public void clickTheSignInButton () {
        WebElement LoginButton = waitAndReturnElement(loginButtonField);
        LoginButton.click();
    }

    public void clickTheLogoutButton () {
        WebElement LogoutButton = waitAndReturnElement(logoutButtonField);
        LogoutButton.click();
    }

    public String getLoginPageTitle () {
        WebElement TitleElement = waitAndReturnElement(titleOfMainPage);
        return TitleElement.getText();
    }

    public String getLogoutPageTitle () {
        WebElement LogoutTitleElement = waitAndReturnElement(titleOfLogoutPage);
        return LogoutTitleElement.getText();
    }
}