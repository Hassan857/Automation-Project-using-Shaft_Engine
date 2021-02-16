package selenium.demo.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ORDER_CONFIRMATION {

    private WebDriver driver;
    private By confirmmessage = By.xpath("//h1[text()='Order confirmation']");

    public ORDER_CONFIRMATION  (WebDriver driver) {
        this.driver = driver;
    }

    public String get_confirmation_message () {
      return  ElementActions.getText(driver , confirmmessage);
    }
}
