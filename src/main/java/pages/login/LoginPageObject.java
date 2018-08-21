package pages.login;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {

    private SelenideElement getUserNameField() {
        return $("[name='username']");
    }

    private SelenideElement getLoginButton() {
        return $(".btn-lg[type='submit']");
    }

    public void enterUserName(String email) {
        getUserNameField().sendKeys(email);
    }

    public AccountPageObject pressLoginButton() {
        getLoginButton().click();
        return page(AccountPageObject.class);
    }
}
