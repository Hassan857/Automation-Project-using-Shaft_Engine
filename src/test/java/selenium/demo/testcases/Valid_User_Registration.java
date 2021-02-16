package selenium.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.demo.pages.Account_CreationPage;
import selenium.demo.pages.Controller_AuthenticationPage;
import selenium.demo.pages.MyAccountPage;


public class Valid_User_Registration extends BaseClass{

    Account_CreationPage registerpage ;
    MyAccountPage useraccountpage;
    Controller_AuthenticationPage controller ;

    //Faker fakedata = new Faker();
    //String Name = fakedata.name().fullName();
    //String Mobile_Number = fakedata.number().digits(8).toString();
    //String Email = fakedata.internet().emailAddress();
    //String Password = fakedata.number().digits(8).toString();
    //String Store_Name = fakedata.name().firstName();
    //String Arabic_Store_Name = fakedata.name().fullName();
    //String Category_Name = "كتب";
    //String Code = fakedata.code().asin();


    @Test
    public void test_valid_user_registration() {

        controller = home.click_signin();
        controller.enter_email_address(jsonfile.Email);
        registerpage =  controller.click_create_account_button();
        useraccountpage =  registerpage.user_register_method(jsonfile.FirstName,
                jsonfile.LastName,
                jsonfile.Password,
                jsonfile.Day,
                jsonfile.Month,
                jsonfile.Year,
                jsonfile.AddressFirstName,
                jsonfile.AddressLastName,
                jsonfile.Address, jsonfile.City,
                jsonfile.State,
                jsonfile.PostalCode,
                jsonfile.MobileNumber,
                jsonfile.AliasEmail);
        Assert.assertTrue(useraccountpage.get_username_text().contains(jsonfile.FirstName),
                "The Account response doesn't contain the expected message: " + "welcome");



    }
}
