package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import util.DriverFactory;

public class homePageSteps {

pages.homePage homePage = new homePage(DriverFactory.getDriver());

    @Given("Berfin is on Home page")
    public void berfinIsOnHomePage() {
        homePage.goToUrl();
    }

    @Then("check {string} title")
    public void checkTitle(String homePageTitle) { homePage.checkHomePageTitle(homePageTitle); }

    @Then("check login button image")
    public void checkLoginButtonImage() {
        homePage.checkLoginButtonImage();
    }

    @When("click login button")
    public void clickloginButton() {
        homePage.clickLoginButton();
    }

    @When("click understood button")
    public void clickUnderstoodButton() { homePage.clickUnderstoodButton(); }

    @When("click on woman page")
    public void clickOnWomanPage() { homePage.clickWomanPage(); }

    @When("click on blouse page")
    public void clickOnBlousePage() {
        homePage.clickBlousePage();
    }

}
