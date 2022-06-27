package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.cartPage;
import util.DriverFactory;

public class cartPageSteps {

pages.cartPage cartPage = new cartPage(DriverFactory.getDriver());

    String cartPageTitle = "Sepetim - LC Waikiki";

    @Then("check shopping cart page")
    public void checkShoppingCartPage() {
        cartPage.checkShoppingCartPage(cartPageTitle);
    }

    @Then("check product name")
    public void checkProductName() {
        cartPage.checkProductName();
    }

    @Then("check product code")
    public void checkProductCode() {
        cartPage.checkProductCode();
    }


    @Then("check how many product")
    public void checkHowManyProduct() { cartPage.checkHowManyProduct(); }

    @Then("check size of product")
    public void checkSizeOfProduct() { cartPage.checkSizeOfProduct(); }

    @Then("check total price")
    public void checkTotalPrice() { cartPage.checkTotalPrice(); }

    @When("click pay button")
    public void clickPayButton() {
        cartPage.clickPayButton();
    }
}
