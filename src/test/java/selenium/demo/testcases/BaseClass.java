package selenium.demo.testcases;
import java.io.IOException;
import org.json.JSONException;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import org.testng.annotations.BeforeMethod;
import selenium.demo.pages.HomePage;
import utilis.JsonDataReader;

public class BaseClass {

    private  WebDriver driver ;
    protected HomePage home ;
     JsonDataReader jsonfile ;

    @BeforeMethod
    public  void setUp () throws ParseException, IOException, JSONException {

        jsonfile = new JsonDataReader();
            jsonfile.JsonReader();
        WebDriver driver = BrowserFactory.getBrowser();
        BrowserActions.navigateToURL(driver , jsonfile.url ,jsonfile.url);
        home = new HomePage(driver);
    }

    @AfterMethod
    public void teardown () {

        BrowserActions.closeCurrentWindow(driver);
    }
}

