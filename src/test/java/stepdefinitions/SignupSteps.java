package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

import static utils.RandomGenerator.*;

public class SignupSteps {
    private TestContext test;
    public SignupSteps(TestContext testContext) {
        this.test = testContext;
    }


    @And("^I am in Signup form$")
    public void isSignUpOpened() throws Throwable {
        test.getSignUpPage().isSignUpOpened();
    }

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        test.getSignUpPage().enterFirstName(test.getUser().getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        test.getSignUpPage().enterLastName(test.getUser().getLastName());
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() throws Throwable {
        test.getSignUpPage().enterMobileNumber(test.getUser().getMobileNumber());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() throws Throwable {
        test.getSignUpPage().enterEmail(test.getUser().getEmailAddress());
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable {
        test.getSignUpPage().enterPassword(test.getUser().getPassword());
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() throws Throwable {
        test.getSignUpPage().enterConfirmPassword(test.getUser().getPassword());
    }

    @And("^I click Sign up button")
    public void iSelectSignUpPassword() throws Throwable {
        test.getSignUpPage().selectSignupButton();
    }

    @And("^I have created account$")
    public void iHaveCreatedAccount() throws Throwable {
        test.getNavigationPage().selectMyAccountButton();
        test.getNavigationPage().selecSignUpButton();
        test.getSignUpPage().enterFirstName(test.getUser().getFirstName());
        test.getSignUpPage().enterLastName(test.getUser().getLastName());
        test.getSignUpPage().enterMobileNumber(test.getUser().getMobileNumber());
        test.getSignUpPage().enterEmail(test.getUser().getEmailAddress());
        test.getSignUpPage().enterPassword(test.getUser().getPassword());
        test.getSignUpPage().enterConfirmPassword(test.getUser().getPassword());
        test.getSignUpPage().selectSignupButton();
    }
}
