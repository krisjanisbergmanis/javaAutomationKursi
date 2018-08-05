package pages.header;

import com.codeborne.selenide.SelenideElement;
import pages.sigunp.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    private SelenideElement getMyAccountButton() {
        return $("test");
    }

    private SelenideElement getSignUpButton() {
        return $("test");
    }

    public void selectMyAccountButton() {
        getMyAccountButton().click();
    }

    public SignUpPageObject selecSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPageObject.class);
    }

}
