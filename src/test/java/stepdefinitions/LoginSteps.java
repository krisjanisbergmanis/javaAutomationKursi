package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.login.LoginPageObject;
import pages.sigunp.SignUpPageObject;

public class LoginSteps {
    LoginPageObject login = new LoginPageObject();

    @And("^I press Login button$")
    public void iPressLoginButton() throws Throwable {
        login.pressLoginButton();
    }
}
