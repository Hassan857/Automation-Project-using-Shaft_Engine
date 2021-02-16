package selenium.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class MyAccountPage {

    private WebDriver driver;
    private By welcome_message = By.xpath("//p[text()='Welcome to your account. Here you can manage all of your personal information and orders.']");
    private By username = By.xpath("//span[text()='ramadan lionel']");
    private By dresses = By.xpath("//li/a[@title='Women'][@class='sf-with-ul']");
    private By casual_dresses = By.linkText("Casual Dresses");


    public MyAccountPage (WebDriver driver ) {

        this.driver=driver;
    }

    public String get_welcome_message_text () {
        String welcome_message_text = ElementActions.getText(driver, welcome_message);
        return welcome_message_text ;
    }
    public String get_username_text () {
        String username_text = ElementActions.getText(driver, username);
        return username_text ;
    }

    public Controller_AuthenticationPage clcik_signout () {

        return new Controller_AuthenticationPage(driver);
    }

    public Casual_Dresses_Page click_casual_dresses () {
        ElementActions.hover(driver , dresses);
        ElementActions.click(driver , casual_dresses);
        return new Casual_Dresses_Page(driver);
    }
}

