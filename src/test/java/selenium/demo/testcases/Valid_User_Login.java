package selenium.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.demo.pages.Controller_AuthenticationPage;
import selenium.demo.pages.MyAccountPage;

public class Valid_User_Login extends BaseClass {

    Controller_AuthenticationPage controllerpage ;
    MyAccountPage myaccount;

    @Test
    public void test_valid_login()  {
        controllerpage =  home.click_signin();
        controllerpage.enter_login_email_address(jsonfile.Email);
        controllerpage.enter_login_password(jsonfile.Password);
        myaccount = controllerpage.click_sign_in_button();
        Assert.assertTrue(myaccount.get_username_text().contains(jsonfile.FirstName),
                "The Account response doesn't contain the expected message: " + "welcome");
        home = home.click_signout();
    }
}
