import org.example.HomePage;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest{

    HomePage homePage = new HomePage();
    currencyChange currencyChange = new currencyChange();
    //RegisterResultPage registerResultPage = new RegisterResultPage();
    @Test
    public void userShouldBeAbleToChangeCurrency(){
        homePage.clickOnCurrencyTab();
        currencyChange.userShouldBeAbleToChangeCurrency();
        CurrencySelectSuccessfully.currencySelect();
    }
}

