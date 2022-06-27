package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

public class cartPage {

    By productCode = By.cssSelector(".rd-cart-item-code");
    By productName = By.cssSelector(".rd-cart-item-title");
    By howManyProduct = By.cssSelector("input[value='1']");
    By sizeOfProduct = By.cssSelector("span[class='rd-cart-item-size'] strong");
    By totalPrice = By.cssSelector("div[class='row grand-total mt-10 mb-10'] span[class='pull-right']");
    By payButton = By.cssSelector("div[class='col-md-12 pl-20 pr-20'] a[class='main-button mt-15']");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public cartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkShoppingCartPage(String name){
        String title = driver.getTitle();
        Assert.assertEquals(name,title);
        System.out.println("Cart Page Title : " + title);
    }

    public void checkProductName() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(productName))).getText();
        System.out.println("Product Name = " + text);
    }

    public void checkProductCode() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(productCode))).getText();
        System.out.println("Product Code = " + text);
    }

    public void checkHowManyProduct() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(howManyProduct))).getAttribute("value");
        System.out.println("How many products are in the Shopping Cart = " + text);
    }

    public void checkSizeOfProduct() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(sizeOfProduct))).getText();
        System.out.println("Size of Product = " + text);
    }

    public void checkTotalPrice() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(totalPrice))).getText();
        System.out.println("Total Price is : = " + text);
    }

    public void clickPayButton() {
        elementHelper.click(payButton,20);
    }
}
