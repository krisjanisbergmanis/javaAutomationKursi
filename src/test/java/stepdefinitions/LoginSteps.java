package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import general.TestContext;

public class LoginSteps {
    private TestContext test;
    public LoginSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I press Login button$")
    public void iPressLoginButton() throws Throwable {
        test.getLoginPage().pressLoginButton();
    }

    @And("^I enter username$")
    public void iEnterUsername() throws Throwable {
        test.getLoginPage().enterUserName(test.getUser().getEmailAddress());
    }
}
