package pages.landingpage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.hoteldetails.HotelDetailsPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class BookingHotelsPageObject {
    private SelenideElement getHotelDetails(String hotel) {
        return $(By.xpath("//a[contains(@href, 'hotels/detail')][contains(., '" + hotel + "')]"));
    }

    public HotelDetailsPageObject selectHotelDetails(String hotel) {
        getHotelDetails(hotel).click();
        return page(HotelDetailsPageObject.class);
    }
}
