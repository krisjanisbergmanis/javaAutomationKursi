package stepdefinitions;

import cucumber.api.java.en.Then;
import pages.account.AccountPageObject;

public class AccountSteps {
    AccountPageObject accountPage = new AccountPageObject();
    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        accountPage.isOpened();
    }
}
