package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.CHROME;

public class Hooks {
    @Before
    public void launchBrowser() {
        System.setProperty("selenide.browser", CHROME);
    }

    @Before
    public void openHomePage() {
        open("https://www.phptravels.net/");
    }

    @After
    close();
}
//System.setProperty("selenide.browser", CHROME);