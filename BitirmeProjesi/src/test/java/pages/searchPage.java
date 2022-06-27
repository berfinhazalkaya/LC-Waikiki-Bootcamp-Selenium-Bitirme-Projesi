package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import java.util.List;

public class searchPage {

    By blousePageTitle = By.cssSelector("div[class='col-xs-12'] h1");
    By colorSearchBox = By.cssSelector("input[placeholder='Renk Ara']");
    By blackButton = By.cssSelector(".color-filter-option__text");
    By mediumButton = By.xpath("//span[normalize-space()='M']");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public searchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkBlousePage() {
        elementHelper.checkElementVisible(blousePageTitle);
    }

    public void writeColorInSearchBox(String color) { elementHelper.sendKey(colorSearchBox, color); }

    public void clickBlackButton() { elementHelper.click(blackButton,20); }

    public void clickMediumSizeButton() {
        waitBySecond(15);
        elementHelper.checkElementPresence(mediumButton);
        elementHelper.click(mediumButton,25);
    }

    public void clickSecondProduct(int a) {
        List<WebElement> element = driver.findElements(By.cssSelector(".product-grid > div"));
        element.get(1).click();
    }

    public void waitBySecond(int sec){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
