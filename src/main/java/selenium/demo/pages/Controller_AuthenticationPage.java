package selenium.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class Controller_AuthenticationPage {

    private WebDriver driver;

    private By email_address = By.id("email_create");
    private By login_email_address = By.id("email");
    private By login_password = By.id("passwd");
    private By create_account_button = By.xpath("//text()[contains(.,'Create an account')]/ancestor::span[1]");
    private By sign_in_button = By.xpath("//text()[contains(.,'Sign in')]/ancestor::span[1]");
    private By forget_password_button = By.xpath("//a[text()='Forgot your password?']");


    public Controller_AuthenticationPage (WebDriver driver) {
        this.driver = driver;
    }

    public void enter_email_address (String Email) {

        ElementActions.type(driver, email_address, Email );
    }
    public void enter_login_email_address (String Email) {

        ElementActions.type(driver, login_email_address, Email );
    }
    public void enter_login_password (String password) {

        ElementActions.type(driver, login_password, password );
    }

    public Account_CreationPage click_create_account_button () {
        ElementActions.click(driver, create_account_button);
        return new Account_CreationPage(driver);
    }
    public MyAccountPage click_sign_in_button () {
        ElementActions.click(driver, sign_in_button);
        return new MyAccountPage(driver);
    }
    public ForgotYourPasswordPage click_forgetpassword_button () {
        ElementActions.click(driver, forget_password_button);
        return new ForgotYourPasswordPage(driver);
    }

}
