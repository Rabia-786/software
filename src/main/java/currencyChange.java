import org.openqa.selenium.By;
import org.testng.Assert;

public class currencyChange extends Utils {
    public void userShouldBeAbleToChangeCurrency(){
        Assert.assertEquals(getTextFromElement(By.xpath("//select[@id='customerCurrency']"));
        //clickOnElement(By.xpath("//select[@id='customerCurrency']/option[@value='https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F']"));
       // getTextFromElement(By.xpath("//select[@id='customerCurrency']"));
      //  return;
    }
    }

