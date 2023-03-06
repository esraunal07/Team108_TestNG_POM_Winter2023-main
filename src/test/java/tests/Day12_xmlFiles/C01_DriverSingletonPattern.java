package tests.Day12_xmlFiles;

import org.testng.annotations.Test;
import utilities.Driver;

import javax.swing.*;

public class C01_DriverSingletonPattern {

    @Test
    public void test01(){

        /*
        POM webDriver olarak Driver classindaki
        getDriver() methodunun kullanilmasi uzerine kurgulanmistir.

        Driver.getDriver();

        Driver classinin obje olusturulurak kullanilmasini engellemek icin
        POM tasarlayanlar bir onlem koymak istemisler.

        Java'da bir class'dan obje olusturulmasini engellemek isterseniz
        SINGLETON PATTERN kullanabiliriz.

        Singleton Pattern : Bir class'dan obje olusturulmasini engellemek / sinirlamak icin
                            kullanilan bir yontemdir.
                            temel fikir obje olusturmak icin kullanilan default constructor yerine
                            gorunur parametresiz bir constructor olusturup
                            Bu constructor'in access modifier'ini private yapip, kullanilmasini
                            ENGELLEMEKTIR-
         */

       // Driver objeDriver =new Driver();



    }
}
