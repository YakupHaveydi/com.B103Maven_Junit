package day10;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03_Actions3 extends TestBase {

    @Test
    public void scrolUpDown() {


        //https://techproeducation.com a git
        //Sayfanin altına doğru gidelim
        //Sonra sayfanın üstüne doğru gidelim


        //https://techproeducation.com a git
        driver.get("https://techproeducation.com");


        //Sayfanin altına doğru gidelim
        Actions actions = new Actions(driver);
        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();  //sayfayi assagiya suruklemek icin kullanilir.


        actions.sendKeys(Keys.PAGE_UP).perform();  //sayfayi yukariya suruklemek icin kullanilir.
        actions.sendKeys(Keys.ARROW_RIGHT).perform();//sayfayi saga suruklemek icin kullanilir.
        actions.sendKeys(Keys.ARROW_LEFT).perform();//sayfayi sola suruklemek icin kullanilir.


        //Sonra sayfanın üstüne doğru gidelim.


       // ACTIONS CLASS'ı NEDİR? HANGİ METHODLAR İLE  NASIL KULLANILIR?..

//   Actions classını kullanarak klavye ve mouse ile yapabileciğiz tüm işlemleri otomosyonda da  yapmamızı sağlamaktayız..!!
//   Bu classa ait metdodlar kısaca aşağıdaki gibidir....

//       actions.doubleClick () :   WebElement'e çift tıklama yapar
//       actions.clickAndHold () :  Uzerinde click yapili olarak bekler
//       actions .dragAndDrop () :  Bir noktadan diğerine sürükler ve bırakır
//       actions.moveToElement () : Mouse'u istedigimiz WebElement'in uzerinde tutar
//       actions.contextClick ():   Mouse ile istedigimiz WebElement'e sag tiklama yapar.
//       actions.sendKeys() :       Öğeye bir dizi anahtar gönderir
//       actions.keyDown () :       Klavyede tuşa basma işlemi gerçekleştirir
//       actions.keyUp () :         Klavyede tuşu serbest bırakma işlemi gerçekleştirir
//
//
//        !!!!Actions classını kullanmak için üç aşama vardır.

//     1.Action classından obje üretiriz.
//     (Actions actions= new Actions(driver);)
//     2.actions objesi ile kullanacağımız web elementi locate ederiz...
//     3.istediğimiz methodları action objesi ile kullanırız.
//     actions.doubleClick(element ismi).perform;

    }
}
