package selenium.demo.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SHIPPING {

    private WebDriver driver ;
   // private By proceedtocheckout = By.className("button btn btn-default standard-checkout button-medium");
   private By proceedtocheckout = By.xpath("//button[@name='processCarrier'and@class='button btn btn-default standard-checkout button-medium']");
    private By terms_of_service = By.xpath("//label[text()='I agree to the terms of service and will adhere to them unconditionally.']");

    public SHIPPING  (WebDriver driver) {
        this.driver = driver;
    }

    public PAYMENT_METHOD  click_proced_to_checkout () {
        ElementActions.click(driver , proceedtocheckout);
        return new PAYMENT_METHOD (driver);
    }
    public void agree_terms_of_service () {

        WebDriverWait wait = new WebDriverWait(driver , 80);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(terms_of_service));
        ElementActions.click(driver , terms_of_service);
    }
}
