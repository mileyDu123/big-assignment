import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SupportPageTest extends PageBase{

    private By titleOfSupportPage = By.xpath("//div/h1");
    private By supportPageText = By.xpath("//a[contains(@href,'/support')]");

    public SupportPageTest(WebDriver driver) {
        super(driver);
        this.driver.get("https://login.qt.io/login");
    }
    
    public void SupportPageElement () {
        WebElement changeToSupportPage = this.driver.findElement(supportPageText);
        changeToSupportPage.click();
    }

    public String getTitleOfSupportPage () {
        WebElement TitleElement = waitAndReturnElement(titleOfSupportPage);
        return TitleElement.getText();
    }

}
