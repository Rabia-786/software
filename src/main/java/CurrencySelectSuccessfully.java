import org.openqa.selenium.By;
import org.testng.Assert;

public class CurrencySelectSuccessfully extends Utils{
    public static void currencySelect(){
        Assert.assertEquals(getTextFromElement(By.xpath("//select[@id='customerCurrency']")));

    }
}
