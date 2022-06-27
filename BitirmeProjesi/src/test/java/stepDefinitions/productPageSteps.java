package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.productPage;
import util.DriverFactory;

public class productPageSteps {

pages.productPage productPage = new productPage(DriverFactory.getDriver());

    @Then("check product page")
    public void checkProductPage() { productPage.checkProductPage(); }

    @When("click medium")
    public void clickMedium() { productPage.clickMedium(); }

    @When("click add to shopping cart button")
    public void clickAddToShoppingCartButton() {
        productPage.clickAddToShoppingCartButton();
    }

    @When("click shopping cart button")
    public void clickShoppingCartButton() {
        productPage.clickShoppingCartButton();
    }

}
