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
    public void iSelectUserAccountMenu() throws Throwable {
        test.getNavigationPage().selectMyAccountButtonWhenLoggedIn(test.getUser().getEmailAddress());
        test.getNavigationPage().selectLogOutOption();
    }
}
