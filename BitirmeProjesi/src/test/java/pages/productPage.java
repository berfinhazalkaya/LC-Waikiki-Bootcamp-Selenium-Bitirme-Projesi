package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class productPage {

    By addToCartButton = By.cssSelector("#pd_add_to_cart");
    By mediumSize = By.xpath("//div[@class='col-xs-12 size-area main-size-area pt-5']//a[@class='selected'][normalize-space()='M']");
    By shoppingCartButton = By.id("shopping-cart");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public productPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkProductPage() {
        elementHelper.checkElementVisible(addToCartButton);
    }

    public void clickMedium() { elementHelper.click(mediumSize,20); }

    public void clickAddToShoppingCartButton() {
        elementHelper.click(addToCartButton,20);
    }

    public void clickShoppingCartButton() {elementHelper.click(shoppingCartButton,20); }
}
