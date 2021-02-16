package selenium.demo.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordControllerPage {


    private WebDriver driver;
    private By confirmation_message = By.xpath("//p[text()='A confirmation email has been sent to your address: hassan@tmpbox.net']");


    public PasswordControllerPage (WebDriver driver) {

        this.driver = driver;
    }
    public String get_confirmation_message_text () {
        return ElementActions.getText(driver , confirmation_message);
    }
}
