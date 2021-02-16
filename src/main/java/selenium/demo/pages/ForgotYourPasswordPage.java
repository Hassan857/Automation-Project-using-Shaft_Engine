package selenium.demo.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotYourPasswordPage {

    private WebDriver driver;
    private By email_field = By.id("email");
    private By retrieve_password_button = By.xpath("//text()[.='Retrieve Password']/ancestor::span[1]");

    public ForgotYourPasswordPage (WebDriver driver) {
        this.driver = driver;
    }

    public void enter_email_address (String Email) {

        ElementActions.type(driver, email_field, Email );
    }
    public PasswordControllerPage click_forgetpassword_button () {
        ElementActions.click(driver, retrieve_password_button);
        return new PasswordControllerPage(driver);
    }
}
