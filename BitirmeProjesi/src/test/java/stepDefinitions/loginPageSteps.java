package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;
import pages.loginPage;

public class loginPageSteps {

pages.loginPage loginPage = new loginPage(DriverFactory.getDriver());

    @Then("check login page title")
    public void checkLoginPageTitle() { loginPage.checkLoginPageTitle(); }

    @Then("check sign up button")
    public void checkSignUpButton() { loginPage.checkSignUpButton(); }

    @When("click sign up button")
    public void clickSignUpButton() { loginPage.clickSignUpButton(); }

    @When("write {string} in email part")
    public void writeInEmailPart(String email) { loginPage.writeEmail(email); }

    @When("write {string} in password part")
    public void writeInPasswordPart(String psw) {
        loginPage.writePassword(psw);
    }

    @When("click show password button")
    public void clickShowPasswordButton() { loginPage.clickShowPassword(); }

    @When("click login button again")
    public void clickLoginButtonAgain() { loginPage.clickLoginButtonAgain(); }

    @When("click show password button in sign up page")
    public void clickShowPasswordButtonInSignUpPage() { loginPage.clickShowPasswordInSignUp(); }

    @When("write {string} in telephone part")
    public void writeInTelephonePart(String tel) {
        loginPage.writeTelephoneNumber(tel);
    }

    @When("click check boxes")
    public void clickCheckBoxes() {
        loginPage.clickCheckBoxes();
    }

    @When("click memberPrivacyApprove button")
    public void clickMemberPrivacyApproveButton() {
        loginPage.clickMPAButton();
    }

    @When("click register button")
    public void clickRegisterButton() {
        loginPage.clickRegisterButton();
    }

    @Then("check email error message")
    public void checkEmailErrorMessage() {
        loginPage.checkEmailErrorMessage();
    }

    @When("print email error message")
    public void printEmailErrorMessage() {
        loginPage.printEmailErrorMessage();
    }

    @Then("check password error message")
    public void checkPasswordErrorMessage() {
        loginPage.checkPasswordErrorMessage();
    }

    @When("print password error message")
    public void printPasswordErrorMessage() {
        loginPage.printPasswordErrorMessage();
    }

    @Then("check verification code screen")
    public void checkVerificationCodeScreen() {
        loginPage.checkVerificationCodeScreen();
    }

    @Then("check member login page")
    public void checkMemberLoginPage() {
        loginPage.checkMemberLoginPage();
    }

    @Then("check phone error message")
    public void checkPhoneErrorMessage() { loginPage.checkPhoneErrorMessage(); }

    @When("print phone error message")
    public void printPhoneErrorMessage() { loginPage.printPhoneErrorMessage(); }

    @Then("check contract error message")
    public void checkContractErrorMessage() { loginPage.checkContractErrorMessage(); }

    @When("print contract error message")
    public void printContractErrorMessage() { loginPage.printContractErrorMessage(); }
}
