import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CookieTest extends PageBase{

    // private By goToGroupPage = By.xpath("//a[contains(@href,'https://www.qt.io/company')]");
    private By goToGroupPage = By.xpath("//html/body/div/footer/footer/div/div/div[2]/ul/li[1]/ul/li[1]/a");

    public CookieTest(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
        
    }

    public void deleteCookies () {
        // Set<Cookie> ck = driver.manage().getCookies();
        // for(Cookie c : ck){
        //     System.out.println(c.getName()+ " = " + c.getValue());
        // }

        

        // ChromeOptions options = new ChromeOptions();
        // options.addArguments("--disable-popup-blocking");

        // WebDriver driver = new ChromeDriver(options);
        // driver.get("https://www.qt.io/group");

        WebElement gotoGroupPage = waitAndReturnElement(goToGroupPage);
        gotoGroupPage.sendKeys(Keys.ENTER);

        Cookie c1 = new Cookie("_ga_97Y6D98RZL", "GS1.1.1685315614.1.0.1685315615.59.0.0");
        Cookie c2 = new Cookie("_gat_UA-54043535-2", "1");
        Cookie c3 = new Cookie("__hssrc", "1");
        Cookie c4 = new Cookie("__cfruid", "c7517ff98ff43c7aead5dd31279af4a63f647909-1685315614");
        Cookie c5 = new Cookie("ln_or", "eyIyODcyODI2IjoiZCJ9");
        Cookie c6 = new Cookie("__cf_bm", "HvdAQ529BRkl31Rq.AU1X9dCBeVTbfa_RG0kW_JWTms-1685315614-0-ASr2+Ir5bowxsjGp6zeVQwIe1172dPAraoVExwNkaLbRQ9FUarjc+H+wBhtGF/nxBv1FeE7rReDKvrhOQkqOSbw=");
        Cookie c7 = new Cookie("_ga_QK0NGHVB4S", "GS1.1.1685315614.1.0.1685315615.59.0.0");
        Cookie c8 = new Cookie("_dc_gtm_UA-54043535-5", "1");
        Cookie c9 = new Cookie("OptanonConsent", "isGpcEnabled=0&datestamp=Sun+May+28+2023+23%3A13%3A34+GMT%2B0000+(UTC)&version=202304.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&landingPath=https%3A%2F%2Fwww.qt.io%2Fgroup&groups=C0004%3A0%2CC0003%3A0%2CC0001%3A1%2CC0002%3A0");
        Cookie c10 = new Cookie("_gid", "GA1.2.161565937.1685315615");
        Cookie c11 = new Cookie("__hstc", "152220518.5f9852d0c90c6745286f13c7332f6f8c.1685315615332.1685315615332.1685315615332.1");
        Cookie c12 = new Cookie("__hssc", "152220518.1.1685315615332");
        Cookie c13 = new Cookie("hubspotutk", "5f9852d0c90c6745286f13c7332f6f8c");
        Cookie c14 = new Cookie("_ga", "GA1.2.2005016794.1685315615");
        Cookie c15 = new Cookie("_fbp", "fb.1.1685315614788.553392036");
        Cookie c16 = new Cookie("_gcl_au", "1.1.874517489.1685315614");
        Cookie c17 = new Cookie("_vwo_uuid_v2", "DAF3C2A69D0DD88DCE46AE0BAA08A81B0|ce3df53048074762ec494e0c7922ae87");

        driver.manage().addCookie(c1);
        driver.manage().addCookie(c2);
        driver.manage().addCookie(c3);
        driver.manage().addCookie(c4);
        driver.manage().addCookie(c5);
        driver.manage().addCookie(c6);
        driver.manage().addCookie(c7);
        driver.manage().addCookie(c8);
        driver.manage().addCookie(c9);
        driver.manage().addCookie(c10);
        driver.manage().addCookie(c11);
        driver.manage().addCookie(c12);
        driver.manage().addCookie(c13);
        driver.manage().addCookie(c14);
        driver.manage().addCookie(c15);
        driver.manage().addCookie(c16);
        driver.manage().addCookie(c17);

        driver.manage().deleteAllCookies();

        // driver.navigate().refresh();
    

        // Cookie cookie = new Cookie(null, null, null, null, null, false, false)

        // driver.manage().deleteAllCookies();
    }

}
