package pages.hotereservation;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HotelReservationConfirmationPageObject {
    private SelenideElement getConfirmPayment(String buttonName) {
        return $(By.xpath("//button[contains(.,'" + buttonName + "')][@type]"));
    }

    public void confirmPayment(String buttonName) {
        getConfirmPayment(buttonName).click();
    }
}
