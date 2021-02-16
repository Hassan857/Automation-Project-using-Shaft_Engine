package selenium.demo.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Casual_Dresses_Page {

  private WebDriver driver ;
  private By addtocart_button = By.xpath("//span[text()='Add to cart']");
  private By product_img = By.xpath("//img[@title='Printed Dress']");
  private By productaddedtoCart_text = By.xpath("//text()[contains(.,'Product successfully added to your shopping cart')]/ancestor::h2[1]");
  private By proceedToCheckout_Button = By.xpath("//text()[contains(.,'Proceed to checkout')]/ancestor::span[1]");


    public Casual_Dresses_Page (WebDriver driver ) {
        this.driver=driver;
    }
    public void click_addtocart () {
        ElementActions.hover(driver , product_img);
        ElementActions.click(driver , addtocart_button);
    }
    public String get_addtocart_text () {
        return ElementActions.getText(driver , productaddedtoCart_text);
    }
    public ShoppingCart_SummaryPage click_proceedtocheckout () {
        ElementActions.click(driver , proceedToCheckout_Button);
        return new ShoppingCart_SummaryPage(driver);
    }
}
