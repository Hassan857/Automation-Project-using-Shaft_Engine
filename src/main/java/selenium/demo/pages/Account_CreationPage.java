package selenium.demo.pages;

import com.shaft.gui.element.ElementActions;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Account_CreationPage {

    private WebDriver driver;

    private By Mr_radiobutton = By.id("id_gender1");
    //private By Mr_radiobutton = By.xpath("input[@type='radio'][@id='id_gender1']");
    private By Mrs_radiobutton = By.id("id_gender2");
    private By firstname_field = By.id("customer_firstname");
    private By lastname_field = By.id("customer_lastname");
    private By password_field = By.id("passwd");
    private By days_dropdown = By.id("days");
    private By months_dropdown = By.id("months");
    private By years_dropdown = By.id("years");
    private By address_firstname = By.id("firstname");
    private By address_lastname = By.id("lastname");
    private By address= By.id("address1");
    private By city_field = By.id("city");
    private By state_dropdown = By.id("id_state");
    private By postcode_field = By.id("postcode");
    private By country_dropdown = By.id("uniform-id_country");
    private By mobilephone_field = By.id("phone_mobile");
    private By alias_email_field = By.id("alias");
    private By register_button = By.xpath("//text()[.='Register']/ancestor::span[1]");

    public Account_CreationPage (WebDriver driver ) {
        this.driver=driver;
    }

    @Step ("User Sign up with Data -->  Name: [{name}], Last country_code: [{countrycode}], Mobile : [{mobilenumber}], Email: [{email}] , Password: [{password}] , StoreName:[{storename}] , Arabic store Name:[{arabicstorename}] , Category Name:[{categoryname} and Code : [{code}] ")
    public MyAccountPage user_register_method (String firstname ,String lastname ,String password , String day , String months , String years , String addressfirstname , String addresslastname , String Address , String city , String state , String postalcode , String mobilephone , String aliasemailname) {
        choose_gender_male();
        enter_firstname(firstname);
        enter_lastname(lastname);
        enter_password(password);
        choose_date_of_birth(day, months, years);
        enter_address_firstname(addressfirstname);
        enter_address_lastname(addresslastname);
        enter_address(Address);
        enter_city(city);
        select_state(state);
        enter_postalcode(postalcode);
        select_country();
        enter_mobilenumber(mobilephone);
        enter_alias_email(aliasemailname);
        click_register_button();

        return new MyAccountPage(driver);
    }
    @Step("Enter Name --> [{name}]")
    public Account_CreationPage choose_gender_male () {
        WebDriverWait wait = new WebDriverWait(driver , 60);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Mr_radiobutton));
            ElementActions.click(driver, Mr_radiobutton);
        return this;
    }
    public Account_CreationPage choose_gender_female () {
        ElementActions.click(driver, Mrs_radiobutton);
        return this;
    }
    @Step("Enter mobilenumber --> [{mobilenumber}]")
    public Account_CreationPage enter_firstname (String firstname ) {
        ElementActions.type(driver, firstname_field, firstname);
        return this;
    }
    public Account_CreationPage enter_lastname (String lastname ) {
        ElementActions.type(driver, lastname_field, lastname);
        return this;
    }
    public Account_CreationPage enter_password (String password ) {
        ElementActions.type(driver, password_field, password);
        return this;
    }
    public Account_CreationPage choose_date_of_birth (String daynumber , String month , String year) {
        Select selectdays = new Select (driver.findElement(days_dropdown));
        selectdays.selectByValue(daynumber);
        Select selectmonths = new Select (driver.findElement(months_dropdown));
        selectmonths.selectByVisibleText(month);
        Select selectyears = new Select (driver.findElement(years_dropdown));
        selectyears.selectByVisibleText(year);
        return this;
    }
    public Account_CreationPage enter_address_firstname (String addrfirstname ) {
        ElementActions.type(driver, address_firstname, addrfirstname);
        return this;
    }
    public Account_CreationPage enter_address_lastname (String addrlastname ) {
        ElementActions.type(driver, address_lastname, addrlastname);
        return this;
    }
    public Account_CreationPage enter_address (String addressname ) {
        ElementActions.type(driver, address, addressname);
        return this;
    }
    public Account_CreationPage enter_city (String cityname ) {
        ElementActions.type(driver, city_field, cityname);
        return this;
    }
    public Account_CreationPage select_state (String statename) {
        Select select = new Select (driver.findElement(state_dropdown));
        select.selectByVisibleText(statename);
        return this;
    }
    public Account_CreationPage enter_postalcode (String postalcode ) {
        ElementActions.type(driver, postcode_field, postalcode);
        return this;
    }
    public Account_CreationPage select_country () {
        ElementActions.click(driver, country_dropdown);
        //Select select = new Select (driver.findElement(country_dropdown));
        //select.selectByVisibleText(countryname);
        return this;
    }
    public Account_CreationPage enter_mobilenumber (String phone ) {
        ElementActions.type(driver, mobilephone_field, phone);
        return this;
    }
    public Account_CreationPage enter_alias_email (String alias_email ) {
        ElementActions.type(driver, alias_email_field, alias_email);
        return this;
    }
    @Step("click_next -->")
    public Account_CreationPage click_register_button () {
        ElementActions.click(driver, register_button);
        return this;
    }
}
