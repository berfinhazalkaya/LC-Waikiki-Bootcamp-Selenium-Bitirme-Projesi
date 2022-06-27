package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.searchPage;
import util.DriverFactory;

public class searchPageSteps {

pages.searchPage searchPage = new searchPage(DriverFactory.getDriver());

    @Then("check blouse page")
    public void checkBlousePage() { searchPage.checkBlousePage(); }

    @When("write {string} in the color search box")
    public void writeInTheColorSearchBox(String color) {
        searchPage.writeColorInSearchBox(color);
    }

    @When("click black button")
    public void clickBlackButton() {
        searchPage.clickBlackButton();
    }

    @When("click medium size button")
    public void clickMediumSizeButton() { searchPage.clickMediumSizeButton(); }

    @When("click {int}. product")
    public void clickProduct(int a) {
        searchPage.clickSecondProduct(a);
    }
}
