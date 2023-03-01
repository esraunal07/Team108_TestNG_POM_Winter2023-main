package tests.Day11_POM_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_HardAssert_SoftAssert {

    @Test
    public void hardAssertionsTesti(){

        Assert.assertTrue(15>8);
        Assert.assertFalse(8==9);
        Assert.assertEquals(5,9);
        Assert.assertNotEquals(6,6);
    }

    @Test
    public void softAssertionTesti(){

     /*
       JUnit'deki Assert classi testNG' de de vardir.
        Ancak bir test methodunda birden fazla failed olan assertion varsa ilk failed olan
        assertion da calismayi durudurup exception firlattigindan tum hatayi bir defada gorup,
        hepsini duzeltme sansimiz olmaz.
        TestNG'de bunun icin bir alternatif olusturulmus. bu alternatifte Assert classindaki static methodlari
        kullanmak yerine

        SoftAssert classindan  bir obje olusturup o obje uzerinden istedigimiz testleri yapiyoruz.
        softassert objesi ile yapilan assertionlar failed olsada testimiz calismaya devam eder.

        ancak testlerin sonucunu gormek istedigimizden softassert.assertall() ile t
      */


    }
}
