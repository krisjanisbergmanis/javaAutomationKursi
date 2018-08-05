package pages.header;

import com.codeborne.selenide.SelenideElement;
import pages.login.LoginPageObject;
import pages.sigunp.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    private SelenideElement getMyAccountButton() {
        return $("test");
    }

    private SelenideElement getSignUpButton() { return $("test"); }

    private SelenideElement getLoginButton() { return $("test"); }

    public void selectMyAccountButton() {
        getMyAccountButton().click();
    }

    public SignUpPageObject selecSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPageObject.class);
    }

    public LoginPageObject selectLogInOption() {
        getLoginButton().click();
        return page(LoginPageObject.class);
    }
}
