package selenium.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.pages.*;

public class Complete_Purchase_Process extends BaseClass{

    Controller_AuthenticationPage authpage;
    MyAccountPage account;
    Casual_Dresses_Page dressespage;
    ShoppingCart_SummaryPage summary;
    Addresses addresses;
    SHIPPING shiping;
    PAYMENT_METHOD paymentpage;
    ORDER_SUMMARY order_summary;
    ORDER_CONFIRMATION order_confirm;

    @Test
    public void Valid_Purchase_Process () {

        authpage = home.click_signin();
        authpage.enter_login_email_address(jsonfile.Email);
        authpage.enter_login_password(jsonfile.Password);
        account = authpage.click_sign_in_button();
        Assert.assertTrue(account.get_username_text().contains(jsonfile.FirstName),
                "The Account response doesn't contain the expected message: " + "welcome");
        dressespage = account.click_casual_dresses();
        dressespage.click_addtocart();
        Assert.assertTrue(dressespage.get_addtocart_text().contains("Product successfully added to your shopping cart"),
                "The Account response doesn't contain the expected message: " + "Product successfully ");
         summary = dressespage.click_proceedtocheckout();
         addresses = summary.click_proced_to_checkout();
         shiping = addresses.click_proced_to_checkout();
         shiping.agree_terms_of_service();
         paymentpage = shiping.click_proced_to_checkout();
         order_summary = paymentpage.click_proced_to_checkout();
         order_confirm = order_summary.click_proced_to_checkout();
        Assert.assertTrue(order_confirm.get_confirmation_message().contains("ORDER"),
                "The Account response doesn't contain the expected message: " + "ORDER");

    }

}
