import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverTest extends PageBase{

    Actions actions = new Actions(driver);

    private By goToDownloadPage = By.xpath("//a[contains(@href,'https://www.qt.io/download-open-source')]");
    private By findProductOption = By.xpath("//a[contains(@href,'https://www.qt.io/product')]");
    // private By findProductOption = By.id("hs_menu_wrapper_header_menu"); 

    public HoverTest(WebDriver driver) {
        super(driver);
        // this.driver.get("https://www.qt.io/download-open-source");
    }

    public void GoToDownloadPage (){
        WebElement downloadPage = waitAndReturnElement(goToDownloadPage);
        downloadPage.click();
    }

    public void hoverOnProductOption () throws InterruptedException {
        WebElement productOption = driver.findElement(findProductOption);
        actions.moveToElement(productOption).build().perform();
        Thread.sleep(3000);
        actions.clickAndHold(productOption).perform();
        Thread.sleep(3000);
        System.out.println(productOption.getText());
    }

}
