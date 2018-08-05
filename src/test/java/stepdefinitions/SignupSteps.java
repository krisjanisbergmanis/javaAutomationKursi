package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.User;
import pages.sigunp.SignUpPageObject;

import static utils.RandomGenerator.*;

public class SignupSteps {

    SignUpPageObject signup = new SignUpPageObject();
    private User user = new User();
    private User userTwo = new User("janis", "berzins");

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        signup.enterFirstName(user.getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        signup.enterLastName(user.getLastName());
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() throws Throwable {
        signup.enterMobileNumber(user.getMobileNumber());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() throws Throwable {
        signup.enterEmail(user.getEmailAddress());
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable {
        signup.enterPassword(user.getPassword());
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() throws Throwable {
        signup.enterConfirmPassword(user.getPassword());
    }

    @And("^I click Sign up button")
    public void iSelectSignUpPassword() throws Throwable {
        signup.selectSignupButton();
    }
}
