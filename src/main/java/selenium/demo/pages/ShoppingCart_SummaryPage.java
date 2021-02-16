package selenium.demo.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart_SummaryPage {

    private WebDriver driver ;
    private By proceedtocheckout = By.xpath("//text()[.='Proceed to checkout']/ancestor::span[1]");

    public ShoppingCart_SummaryPage (WebDriver driver) {
        this.driver = driver;
    }
    public Addresses click_proced_to_checkout () {
        ElementActions.click(driver , proceedtocheckout);
        return new Addresses (driver);
    }
}
