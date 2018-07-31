package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginSteps {
    @And("^I select Log in option")
    public void iSelectLogInOption() throws Throwable {
        selectLogInOption();
    }

    @And("^I press Login button$")
    public void iPressLoginButton() throws Throwable {
        pressLoginButton();
    }

    @Then("^I am logged in$")
    public void iAmLoggedIn() throws Throwable {
        isLoggedIn();
    }
}
