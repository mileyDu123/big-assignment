import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest extends PageBase{

    private By goToFAQPage = By.xpath("//a[contains(@href,'https://www.qt.io/faq/overview')]");
    // private By goToFAQPage = By.xpath("//footer/div/div/div[2]/ul/li[2]/ul/li[3]/a");
    private By dragElement = By.xpath("//a[contains(@href,'https://www.qt.io/pricing/?hsLang=en')]");
    private By dropField = By.id("search");

    public DragAndDropTest(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
        // this.driver.get("https://www.qt.io/faq/overview");
    }

    public void goToFAQPage () {
        WebElement FAQPage = waitAndReturnElement(goToFAQPage);
        FAQPage.sendKeys(Keys.ENTER);
    }

    public void dragElementToSearchField () throws InterruptedException {
        WebElement DragElement = this.driver.findElement(dragElement);
        WebElement DropElement = this.driver.findElement(dropField);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(DragElement, DropElement).sendKeys(DragElement.getText()).build().perform();
        System.out.println(DragElement.getText());
    }

    
}
