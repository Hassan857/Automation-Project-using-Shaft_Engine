package selenium.demo.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ORDER_SUMMARY {


    private WebDriver driver;

    private By confirm_my_order = By.xpath("//text()[.='I confirm my order']/ancestor::span[1]");

    public ORDER_SUMMARY  (WebDriver driver) {
        this.driver = driver;
    }

    public ORDER_CONFIRMATION click_proced_to_checkout () {
        ElementActions.click(driver , confirm_my_order);
        return new ORDER_CONFIRMATION (driver);
    }
}
