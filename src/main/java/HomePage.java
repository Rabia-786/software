import org.openqa.selenium.By;

public class HomePage extends Utils{

    public void clickOnCustomerCurrency() {
        //clickOnElement(By.id("customerCurrency"));
        clickOnElement(By.xpath("//select[@id='customerCurrency']/option[@value='https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F']"));
        // String expected = "€";
        // getTextFromElement(By.xpath("//select[@id='customerCurrency']"));
         return;
    }}