package selenium.demo.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PAYMENT_METHOD {

    private WebDriver driver ;
    private By paybybankwire = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]");
    public PAYMENT_METHOD  (WebDriver driver) {
        this.driver = driver;
    }

    public ORDER_SUMMARY click_proced_to_checkout () {
        ElementActions.click(driver , paybybankwire);
        return new ORDER_SUMMARY (driver);
    }
}
