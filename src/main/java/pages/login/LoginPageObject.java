package pages.login;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {

    private SelenideElement getLoginButton() {
        return $("test");
    }

    public AccountPageObject pressLoginButton() {
        getLoginButton().click();
        return page(AccountPageObject.class);
    }
}
