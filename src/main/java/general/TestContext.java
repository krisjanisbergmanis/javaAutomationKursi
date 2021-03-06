package general;

import lombok.Data;
import pages.account.AccountPageObject;
import pages.header.NavigationPageObject;
import pages.hoteldetails.HotelDetailsPageObject;
import pages.hotereservation.HotelReservationConfirmationPageObject;
import pages.invoice.InvoicePageObject;
import pages.landingpage.BookingHotelsPageObject;
import pages.login.LoginPageObject;
import pages.sigunp.SignUpPageObject;

@Data
public class TestContext {
    private User user;
    private AccountPageObject accountPage;
    private NavigationPageObject navigationPage;
    private BookingHotelsPageObject bookingHotelsPage;
    private LoginPageObject loginPage;
    private SignUpPageObject signUpPage;
    private HotelDetailsPageObject hotelDetailsPage;
    private HotelReservationConfirmationPageObject hotelConfirmation;
    private InvoicePageObject invoicePageObject;

public TestContext() {
    this.user = new User();
    this.accountPage = new AccountPageObject();
    this.navigationPage = new NavigationPageObject();
    this.bookingHotelsPage = new BookingHotelsPageObject();
    this.loginPage = new LoginPageObject();
    this.signUpPage = new SignUpPageObject();
    this.hotelDetailsPage = new HotelDetailsPageObject();
    this.hotelConfirmation = new HotelReservationConfirmationPageObject();
    this.invoicePageObject = new InvoicePageObject();
}

}
