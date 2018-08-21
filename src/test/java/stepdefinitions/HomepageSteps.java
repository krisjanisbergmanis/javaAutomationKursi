package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.TestContext;

public class HomepageSteps {
    private TestContext test;
    public HomepageSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("OPEN HOME PAGE");
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        test.getNavigationPage().selectMyAccountButton();
    }

    @And("^I select Sign up button$")
    public void iSelectSignUpButton() throws Throwable {
        test.getNavigationPage().selecSignUpButton();
    }

    @And("^I select Log in option")
    public void iSelectLogInOption() throws Throwable {
        test.getNavigationPage().selectLogInOption();
    }

    @When("^I have logged out$")
    public void iLogOut() throws Throwable {
        test.getNavigationPage().selectMyAccountButtonWhenLoggedIn(test.getUser().getEmailAddress());
        test.getNavigationPage().selectLogOutOption();
    }

    @When("^I select User account menu$")
    public void iSelectUserAccountMenu() throws Throwable {
        test.getNavigationPage().selectMyAccountButtonWhenLoggedIn(test.getUser().getEmailAddress());
    }

    @When("^When I select Home button in Navigation bar$")
    public void iSelectHomeButton() throws Throwable {
        test.getNavigationPage().selectHomeButton();
    }

    @When("^I select book Hotels button$")
    public void iSelectBookHotels() throws Throwable {
        test.getNavigationPage().selectHotels();
    }

    @When("^I enter ([^\\”]*) hotel$")
    public void iOpenHotelDetails(String hotel) throws Throwable {
        test.getBookingHotelsPage().selectHotelDetails(hotel);
    }
}
