package tests.Day11_POM_assertions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class C06_SoftAsserts {



    @Test
    public void webappTesti() {
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));
        ZeroPage zeroPage = new ZeroPage();
        zeroPage.signInButonu.click();
        zeroPage.usernameKutusu.sendKeys(new CharSequence[]{"username"});
        zeroPage.passwordKutusu.sendKeys(new CharSequence[]{"password"});
        zeroPage.signInSubmitButonu.click();
        Driver.getDriver().navigate().back();
        zeroPage.onlineBanking.click();
        zeroPage.payBillLinki.click();
        zeroPage.purchaseFCButonu.click();
        Select select = new Select(zeroPage.currencyDropdown);
        ReusableMethods.bekle(2);
        select.selectByVisibleText("Eurozone (euro)");
        SoftAssert softAssert = new SoftAssert();
        String expectedSecim = "Eurozone (euro)";
        String actualsecim = select.getFirstSelectedOption().getText();
        softAssert.assertEquals(actualsecim, expectedSecim, "dropdownda eurozone secili degil");
        List<WebElement> optionsElementListesi = select.getOptions();
        List<String> actualOptionsStringList = ReusableMethods.stringListeCevir(optionsElementListesi);
        String[] expectedArr = new String[]{"Select One", "Australia (dollar)", "Canada (dollar)", "Switzerland (franc)", "China (yuan)", "Denmark (krone)", "Eurozone (euro)", "Great Britain (pound)", "Hong Kong (dollar)", "Japan (yen)", "Mexico (peso)", "Norway (krone)", "New Zealand (dollar)", "Sweden (krona)", "Singapore (dollar)", "Thailand (baht)"};
        List<String> expectedOptionListesi = new ArrayList();
        String[] var10 = expectedArr;
        int var11 = expectedArr.length;

        for(int var12 = 0; var12 < var11; ++var12) {
            String each = var10[var12];
            expectedOptionListesi.add(each);
        }

        softAssert.assertEquals(actualOptionsStringList, expectedOptionListesi);
        softAssert.assertAll();
        Driver.closeDriver();
    }
}

