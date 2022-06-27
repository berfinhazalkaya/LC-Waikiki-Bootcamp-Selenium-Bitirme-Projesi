package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;
import java.util.List;
public class loginPage {

    By loginPageTitle = By.cssSelector(".login-form__title");
    By signUpButton = By.cssSelector(".login-form__link");
    By emailAddress = By.cssSelector("input[placeholder='E-Posta Adresiniz']");
    By password = By.cssSelector("input[placeholder='Şifreniz']");
    By showPassword = By.cssSelector(".login-form__show-password-icon");
    By loginButton = By.cssSelector("button[type='submit']");
    By showPasswordInSignUp = By.cssSelector(".register__show-password-icon");
    By telephoneBox = By.cssSelector("input[placeholder='0 (5__) ___ __ __']");
    By checkBoxes = By.className("checkbox-span");
    By MPAButton = By.cssSelector("input[value='false'][name='memberPrivacyApprove']");
    By registerButton = By.cssSelector("button[type='submit']");
    By telCodeTitle = By.xpath("//div[@class='confirmation-code-modal__title']");
    By emailerror = By.cssSelector("form:nth-child(2) > div:nth-child(1) > div:nth-child(2)");
    By pswerror = By.cssSelector("div:nth-child(2) > div:nth-child(2) > div:nth-child(2)");
    By phoneError = By.cssSelector("form:nth-child(2) > div:nth-child(3) > div:nth-child(2)");
    By contractError = By.cssSelector("div[id='member-privacy-approve-container'] div:nth-child(2)");


    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkLoginPageTitle() {elementHelper.checkElementVisible(loginPageTitle);}

    public void checkSignUpButton() {elementHelper.checkElementVisible(signUpButton);}

    public void clickSignUpButton() {elementHelper.click(signUpButton,15);}

    public void writeEmail(String email) {
        elementHelper.sendKey(emailAddress, email);
    }

    public void writePassword(String psw) {
        elementHelper.sendKey(password,psw);
    }

    public void clickShowPassword() {
        elementHelper.click(showPassword,15);
    }

    public void clickLoginButtonAgain() { elementHelper.click(loginButton,15); }

    public void clickShowPasswordInSignUp() { elementHelper.click(showPasswordInSignUp, 15); }

    public void writeTelephoneNumber(String tel) {
        elementHelper.sendKey(telephoneBox,tel);
    }

    public void clickCheckBoxes() {
        List<WebElement> allCheckBoxes = driver.findElements(checkBoxes);
        int size = allCheckBoxes.size();
        System.out.println("Number of Check Boxes:" + size);
        for(int i=0; i<size; i++){
            allCheckBoxes.get(i).click();
        }  }
    public void clickMPAButton() {
        elementHelper.click(MPAButton,20);
    }

    public void clickRegisterButton() {
        elementHelper.checkElementPresence(registerButton);
        elementHelper.click(registerButton,20);
    }

    public void checkVerificationCodeScreen() {
        String title = driver.findElement(telCodeTitle).getText();
        System.out.println("Telephone Verification Code Screen Title is : " + title);
        System.out.println("The case of checking the sms verification screen by entering the correct data on the register page is over.");
    }

    public void checkEmailErrorMessage() {
        elementHelper.checkElementVisible(emailerror);
    }

    public void printEmailErrorMessage() {
        String error = driver.findElement(emailerror).getText();
        System.out.println("Email Error Message is : " + error);
    }

    public void checkPasswordErrorMessage() {
        elementHelper.checkElementVisible(pswerror);
    }

    public void printPasswordErrorMessage() {
        String error = driver.findElement(pswerror).getText();
        System.out.println("Password Error Message is : " + error);
    }

    public void checkPhoneErrorMessage() {
        elementHelper.checkElementVisible(phoneError);
    }

    public void printPhoneErrorMessage() {
        String error = driver.findElement(phoneError).getText();
        System.out.println("Phone Error Message is : " + error);
    }

    public void checkContractErrorMessage() {
        elementHelper.checkElementVisible(contractError);
    }

    public void printContractErrorMessage() {
        String error = driver.findElement(contractError).getText();
        System.out.println("Conrtact Error Message is : " + error);
    }

    public void checkMemberLoginPage() {
        Assert.assertTrue(driver.getTitle().contains("LC Waikiki"));
        System.out.println("Member Login Page Title is : " + driver.getTitle());
        System.out.println("The scenario of adding and checking products to the cart has been successfully completed.");
    }
}
