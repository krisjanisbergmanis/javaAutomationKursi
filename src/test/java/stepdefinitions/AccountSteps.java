package stepdefinitions;

import cucumber.api.java.en.Then;
import general.TestContext;
import pages.account.AccountPageObject;

public class AccountSteps {
    private TestContext test;
    public AccountSteps(TestContext testContext) {
        this.test = testContext;
    }
    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        test.getAccountPage().isOpened();
    }
}
