package stepdefinitions;

import cucumber.api.java.en.When;
import general.TestContext;

public class BookingSteps {
    private TestContext test;

    @When("^I select ([^\\”]*) as Check in date$")
    public void iSelectCheckInDate(String date) throws Throwable {
        test.getHotelDetailsPage().enterCheckInDate(date);
    }
    @When("^I select ([^\\”]*) as Check out date$")
    public void iSelectCheckOutDate(String date) throws Throwable {
        test.getHotelDetailsPage().enterCheckOutDate(date);
    }
    @When("^I select ([^\\”]*) Adult and ([^\\”]*) Children$")
    public void iSelectAdultAndChildCount(String AdultCount, String ChildCount) throws Throwable {
        test.getHotelDetailsPage().setAdultCount(AdultCount);
        test.getHotelDetailsPage().setChildCount(ChildCount);
    }

    @When("^I select Search button$")
    public void iSelectAdultAndChildCount() throws Throwable {
        test.getHotelDetailsPage().setSearchFilter();
    }

    @When("^I select ([^\\”]*) room$")
    public void iBookRoom(String roomType) throws Throwable {
        test.getHotelDetailsPage().selectRoom(roomType);
    }

    @When("^I select “([^\\”]*)” button$")
    public void iConfirmPayment(String buttonName) throws Throwable {
        test.getHotelConfirmation().confirmPayment(buttonName);
    }

    @When("^([^\\”]*) invoice page is opened$")
    public void iConfirmPayment(String invoiceStatus) throws Throwable {
        test.getInvoicePageObject().isInvoiceVisible(invoiceStatus);
    }
}
