import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils{


    @BeforeMethod
    public void openBrowser(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.setProperty("webdriver.chrome.driver","src\\test\\Resourses\\Browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");

    }
    @AfterMethod
    public void closeBrowser(){
        // driver.quit();
    }
}
