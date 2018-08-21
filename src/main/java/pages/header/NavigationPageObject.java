package pages.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;
import pages.landingpage.BookingHotelsPageObject;
import pages.login.LoginPageObject;
import pages.sigunp.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    private SelenideElement getMyAccountButton() {
        return $("#collapse #li_myaccount .dropdown-toggle");
    }
    private SelenideElement getMyAccountButtonWhenLoggedIn(String username) {
        return $(By.xpath("//nav/descendant::a[contains(text(),'" + username + "')]"));
    }
    private SelenideElement getSignUpButton() { return $("#collapse #li_myaccount [href*='register']"); }
    private SelenideElement getLoginButton() { return $("#collapse #li_myaccount [href*='login']"); }
    private SelenideElement getLogoutButton() { return $(".open [href*='logout']"); }
    private SelenideElement getHomeButton() { return $("li a[href='https://www.phptravels.net/']"); }
    private SelenideElement getHotels() { return $("[title ='Hotels']"); }

    public void selectMyAccountButton() {
        getMyAccountButton().click();
    }

    public AccountPageObject selectMyAccountButtonWhenLoggedIn(String username) {
        getMyAccountButtonWhenLoggedIn(username).click();
        return page(AccountPageObject.class);
    }

    public SignUpPageObject selecSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPageObject.class);
    }

    public LoginPageObject selectLogInOption() {
        getLoginButton().click();
        return page(LoginPageObject.class);
    }

    public NavigationPageObject selectLogOutOption() {
        getLogoutButton().click();
        return page(NavigationPageObject.class);
    }

    public BookingHotelsPageObject selectHomeButton() {
        getHomeButton().click();
        return page(BookingHotelsPageObject.class);
    }

    public BookingHotelsPageObject selectHotels() {
        getHotels().click();
        return page(BookingHotelsPageObject.class);
    }

}
