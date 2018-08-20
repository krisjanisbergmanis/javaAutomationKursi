package pages.invoice;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InvoicePageObject {
    private SelenideElement getUnpaidIv(String status) {
        return $(By.xpath("//td[contains(.,'" + status + "')]"));
    }

    public void isInvoiceVisible(String status) {
        getUnpaidIv(status).isDisplayed();
    }
}
