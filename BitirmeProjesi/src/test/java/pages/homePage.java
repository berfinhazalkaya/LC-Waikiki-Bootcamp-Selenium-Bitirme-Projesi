package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ConfigReader;
import util.ElementHelper;
import java.util.Properties;

public class homePage {
    By loginButtonImage = By.id("user_1_");
    By loginButton = By.cssSelector("span:nth-child(1) > div:nth-child(1) > a:nth-child(1) > span:nth-child(2)");
    By womanTitle = By.xpath("//a[@class='menu-header-item__title'][normalize-space()='KADIN']");
    By blouse = By.cssSelector("li:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(10) > a:nth-child(1)");
    By understoodButton = By.cssSelector("#cookieseal-banner > div > button:nth-child(3)");


    WebDriver driver;
    WebDriverWait wait;
    Properties properties;
    ElementHelper elementHelper;

    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void goToUrl() {
        properties = ConfigReader.getProperties();
        String url = properties.getProperty("url");
        driver.get(url);
    }

    public void checkHomePageTitle(String homePageTitle) {
        Assert.assertTrue(driver.getTitle().contains("LC Waikiki"));
        System.out.println("Home Page Title is : " + driver.getTitle());
    }

    public void checkLoginButtonImage() {
        elementHelper.checkElementVisible(loginButtonImage);
    }

    public void clickLoginButton() {
        elementHelper.click(loginButton,20);
    }

    public void clickUnderstoodButton() {
                elementHelper.click(understoodButton,20);
    }

    public void clickWomanPage() {
        waitBySecond(10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(womanTitle));
        WebElement clickable = driver.findElement(womanTitle);
        new Actions(driver)
                .clickAndHold(clickable)
                .perform();
    }

    public void clickBlousePage() {
        elementHelper.click(blouse,20);
    }

    public void waitBySecond(int sec){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
