package pages.hoteldetails;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.hotereservation.HotelReservationConfirmationPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HotelDetailsPageObject {

    private SelenideElement getSuite(String roomtype) {
        return $(By.xpath("//td[contains(.,'" + roomtype + "')]//button[@type]"));
    }
    private SelenideElement getCheckInDateInput() {
        return $("input[name = 'checkin'][placeholder]");
    }
    private SelenideElement getCheckOutDateInput() {
        return $("input[name = 'checkout'][placeholder]");
    }
    private SelenideElement getAdultCount() {
        return $("#adults");
    }
    private SelenideElement getChildCount() {
        return $("#child");
    }
    private SelenideElement getModifYButton() {
        return $("input[value='Modify']");
    }

    public void enterCheckInDate(String date) {
        getCheckInDateInput().sendKeys(date);
    }

    public void enterCheckOutDate(String date) {
        getCheckOutDateInput().sendKeys(date);
    }

    public void setAdultCount(String count) {
        getAdultCount().selectOption(count);
    }

    public void setChildCount(String count) {
        getChildCount().selectOption(count);
    }

    public void setSearchFilter() {
        getModifYButton().click();
    }

    public HotelReservationConfirmationPageObject selectRoom(String roomtype) {
        getSuite(roomtype).scrollTo();
        getSuite(roomtype).click();
        return page(HotelReservationConfirmationPageObject.class);
    }
}