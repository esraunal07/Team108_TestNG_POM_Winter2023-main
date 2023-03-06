package tests.Day12_xmlFiles;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C03_RaporluPozitifLoginTesti extends TestBaseRapor {

    @Test
    public void pozitifLoginTesti() {
        extentTest = extentReports.createTest("Pozitif login testi", "gecerli bilgilerle giris yapilabilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        extentTest.info("Qualitydemy anasayfaya gidildi");
        QdPage qdPage = new QdPage();
        qdPage.ilkLoginLinki.click();
        extentTest.info("Ilk login linkine tiklandi");
        qdPage.emailKutusu.sendKeys(new CharSequence[]{ConfigReader.getProperty("qdGecerliUsername")});
        extentTest.info("Gecerli email yazildi");
        qdPage.passwordKutusu.sendKeys(new CharSequence[]{ConfigReader.getProperty("qdGecersizPassword")});
        extentTest.info("Gecerli password yazildi");
        qdPage.loginButonu.click();
        extentTest.info("Login butonuna basildi");
        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());
        extentTest.pass("Basarili sekilde giris yapildigi test edildi");
    }
}

