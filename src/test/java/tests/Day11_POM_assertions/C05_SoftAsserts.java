package tests.Day11_POM_assertions;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_SoftAsserts {

    public void C05_SoftAssert() {
    }

    @Test (groups = "smoke")
    public void amazonTesti() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedIcerik), "url amazon icermiyor");
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(new CharSequence[]{"Nutella" + Keys.ENTER});
        expectedIcerik = "Nutella";
        String actualAramaSonucYazisi = amazonPage.aramaSonucElementi.getText();
        softAssert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik), "arama sonucu Nutella icermiyor");
        amazonPage.ilkUrun.click();
        expectedIcerik = "Nutella";
        String actualIlkUrunIsim = amazonPage.ilkUrunIsimElementi.getText();
        softAssert.assertTrue(actualIlkUrunIsim.contains(expectedIcerik), "ilk urun ismi Nutella icermiyor");
        softAssert.assertAll();
        Driver.closeDriver();
    }
}


