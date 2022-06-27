package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class paymentPage {

    By debitOrCreditCart = By.cssSelector("label[for='PaymentButtonRadio_PaymentCardMasterpassView'] span[class='label']");
    By giveUpButton = By.cssSelector(".btn.btn-cancel.btn-bold.btn-block");
    By nameSurnameBox = By.cssSelector("input[placeholder='Ad Soyad']");
    By creditCartBox = By.cssSelector("input[placeholder='Kart Numarası']");
    By expirationDateBox = By.cssSelector("input[placeholder='Ay']");
    By expirationDateBox2 = By.cssSelector("input[placeholder='Yıl']");
    By CvvBox = By.cssSelector("input[placeholder='***']");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public paymentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickDebitOrCreditCart() {
        elementHelper.click(debitOrCreditCart,20);
    }

    public void clickGiveUpButton() { elementHelper.click(giveUpButton,25); }

    public void checknameSurnameBox() { elementHelper.checkElementVisible(nameSurnameBox); }

    public void checkCreditCartBox() { elementHelper.checkElementVisible(creditCartBox); }

    public void checkExpirationDateBoxes() {
        elementHelper.checkElementVisible(expirationDateBox);
        elementHelper.checkElementVisible(expirationDateBox2);
    }

    public void checkCvvBox() { elementHelper.checkElementVisible(CvvBox); }

}

