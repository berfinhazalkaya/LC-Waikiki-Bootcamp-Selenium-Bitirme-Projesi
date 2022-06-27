package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.paymentPage;
import util.DriverFactory;

public class paymentPageSteps {

pages.paymentPage paymentPage = new paymentPage(DriverFactory.getDriver());

    @When("click debit-credit card")
    public void clickDebitCreditCard() {
        paymentPage.clickDebitOrCreditCart();
    }

    @When("click give up button")
    public void clickGiveUpButton() { paymentPage.clickGiveUpButton(); }

    @Then("check name surname box")
    public void checkNameSurnameBox() { paymentPage.checknameSurnameBox(); }

    @Then("check credit cart no box")
    public void checkCreditCartNoBox() { paymentPage.checkCreditCartBox(); }

    @Then("check expiration date boxes")
    public void checkExpirationDateBoxes() { paymentPage.checkExpirationDateBoxes(); }

    @Then("check cvv box")
    public void checkCvvBox() { paymentPage.checkCvvBox(); }
}
