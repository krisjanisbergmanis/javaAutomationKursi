package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.sigunp.SignUpPageObject;

public class SignupSteps {

    SignUpPageObject signup = new SignUpPageObject();

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        signup.enterFirstName("test");
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        signup.enterLastName("test");
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() throws Throwable {
        signup.enterMobileNumber("test");
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() throws Throwable {
        signup.enterEmail("test");
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() throws Throwable {
        signup.enterConfirmPassword("test");
    }

    @And("^I select Sign up password$")
    public void iSelectSignUpPassword() throws Throwable {
        signup.selectSignupButton();
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable {
        signup.enterPassword("test");
    }
}
