package stepdefinitions;

import cucumber.api.java.en.Then;

public class AccountSteps {
    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        isUserAccountPageOpened();
    }
}
