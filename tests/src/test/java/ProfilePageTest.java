import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ProfilePageTest extends PageBase {

    private By titleOfProfilePage = By.xpath("//div/h1");
    private By firstnameField = By.name("given_name");
    private By lastnameField = By.name("family_name");
    private By companyField = By.name("company");
    // private By checkboxArea = By.xpath("//form/fieldset[2]/field[3]/input");
    private By checkboxArea = By.xpath("//form/fieldset[2]/field[3]");
    private By uploadButton = By.tagName("button");
    private By successfulMassage = By.xpath("//div[contains(@class,'c-alert c-alert--success')]");

    private By profilePageText = By.xpath("//a[contains(@href,'/profile')]");
    
    public ProfilePageTest(WebDriver driver) {
        super(driver);
    }

    public void ProfilePageElement () {
        WebElement changeToProfilePage = this.driver.findElement(profilePageText);
        changeToProfilePage.click();
    }

    public String getTitleOfProfilePage () {
        WebElement TitleElement = waitAndReturnElement(titleOfProfilePage);
        return TitleElement.getText();
    }

    public void typeIntoFirstnameText (String firstname) {
        WebElement firstnameText = waitAndReturnElement(firstnameField);
        firstnameText.sendKeys(firstname);
    }

    public void typeIntoLastnameText (String lastname) {
        WebElement lastnameText = waitAndReturnElement(lastnameField);
        lastnameText.sendKeys(lastname);
    }

    public void typeIntoCompanyText (String company) {
        WebElement companyText = waitAndReturnElement(companyField);
        companyText.sendKeys(company);
    }

    public void chooseCheckboxElement () {
        WebElement checkboxClick = waitAndReturnElement(checkboxArea);
        checkboxClick.click();
    }

    public void clickUploadButton () {
        WebElement findUploadButton = waitAndReturnElement(uploadButton);
        findUploadButton.click();
    }

    public String successfulUploaded () {
        WebElement successMassageElement = waitAndReturnElement(successfulMassage);
        return successMassageElement.getText();
    }
}
