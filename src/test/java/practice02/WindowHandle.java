package practice02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class WindowHandle extends TestBase {

    @Test
    public void test01() {

        //Amazon anasayfa adresine gidin.
        //Sayfa’nin window handle degerini String bir degiskene atayin
        //Sayfa title’nin “Amazon” icerdigini test edin
        //Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
        //Sayfa title’nin “TECHPROEDUCATION” icerip icermedigini test edin
        //Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        //Sayfa title’nin “Walmart” iceri icermedigini test edin
        //Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin.


        //Amazon anasayfa adresine gidin.
        driver.get("https://amazon.com");

        //Sayfa’nin window handle degerini String bir degiskene atayin
        String amazonWindow = driver.getWindowHandle();

        //Sayfa title’nin “Amazon” icerip icermedigini test edin.
        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";
        Assert.assertTrue(actualTitle.contains(arananKelime));

        //Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);//yeni bir sekme acmis olduk.
        driver.get("https://techproeducation.com");

        //Sayfa title’nin “TECHPROEDUCATION” icerip icermedigini test edin.
        String actualTechProTitle = driver.getTitle();
        String istenenKelime = "TECHPROEDUCATION";
        Assert.assertFalse(actualTechProTitle.contains(istenenKelime));

        //Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://Walmart.com");

        //Sayfa title’nin “Walmart” icerip icermedigini test edin
        String actualWalmartTitle = driver.getTitle();
        String beklenenKelime = "Walmart";
        Assert.assertTrue(actualWalmartTitle.contains(beklenenKelime));

        //Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin.
        driver.switchTo().window(amazonWindow);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        Assert.assertEquals(expectedUrl,actualUrl);

    }
}
