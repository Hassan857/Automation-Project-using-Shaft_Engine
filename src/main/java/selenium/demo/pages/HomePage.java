package selenium.demo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class HomePage {

    private WebDriver driver ;
    private By sign_in_button =By.xpath("//a[contains(text(),'Sign in')]");
    private By sign_out_button =By.xpath("//a[@class='logout']");



    public HomePage (WebDriver driver ) {

        this.driver=driver;
    }

    public Controller_AuthenticationPage click_signin () {

        ElementActions.click(driver, sign_in_button);
        return new Controller_AuthenticationPage(driver);
    }
    public HomePage click_signout () {

        ElementActions.click(driver, sign_out_button);
        return this;
    }
}
