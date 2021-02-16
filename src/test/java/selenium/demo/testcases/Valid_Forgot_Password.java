package selenium.demo.testcases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.pages.Controller_AuthenticationPage;
import selenium.demo.pages.ForgotYourPasswordPage;
import selenium.demo.pages.PasswordControllerPage;

public class Valid_Forgot_Password extends BaseClass {

    Controller_AuthenticationPage controller ;
    ForgotYourPasswordPage forgotpasswordpage ;
    PasswordControllerPage passwordcontroller;

    @Test
    @Description("When I enter valid email then click ok en email sent to change password ")
    @Story("Forget Password")
    @Severity(SeverityLevel.CRITICAL)
    @TmsLink("focus-case-1637098")
    @Issue("bug-tracker#1")
    public void Test_Valid_ForgetPassword ()  {
       controller =  home.click_signin();
        forgotpasswordpage =  controller.click_forgetpassword_button();
        forgotpasswordpage.enter_email_address(jsonfile.Email);
        passwordcontroller = forgotpasswordpage.click_forgetpassword_button();
        Assert.assertTrue(passwordcontroller.get_confirmation_message_text().contains(jsonfile.Email),
                "The Account response doesn't contain the expected message: " + jsonfile.Email);

    }

}
