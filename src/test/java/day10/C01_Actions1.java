package day10;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
public class C01_Actions1 extends TestBase {
    @Test
    public void rightClick(){
//       https://the-internet.herokuapp.com/context_menu  sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");


//        1. ACTIONS OBJESI OLUSTURULUR
        Actions actions = new Actions(driver);


//        2. ELEMENT'I LOCATE EDELIM
        WebElement kutu = driver.findElement(By.id("hot-spot"));


//        Kutuya sag tıklayın
//        TUM ACTIONS'LAR actions OBJESIYLE BASLAR permorm() ILE BITER.
        actions.contextClick(kutu).perform();


//        Alert’te cikan yazinin “You selected a context menu” oldugunu test edin
//        Object olusturmak wait gerektiren durumlarda makul.


        Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());
//       Tamam diyerek alert’i kapatın
        driver.switchTo().alert().accept();



        //Class: Actions1
        //Method: rightClick
        //https://the-internet.herokuapp.com/context_menu  sitesine gidin
        //Kutuya sag tıklayın
        //Alert’te cikan yazinin “You selected a context menu” oldugunu test edin
        //Tamam diyerek alert’i kapatın


        //1- Actons nedir?         //ayni sey
        //2- Actons Class nedir ?  //ayni sey
        //3- Ne tur methodlar kullandin?
        //4- Hangi methodlari kullandin ne  ise yarar?


        /*
        1- Actions nedir?
       *Actions selenium dan gelen bir kütüphanedir. Mouse ve Keyboard
       işlemlerini gerçekleştirmek icin kullandigimiz hazır bir
       selenium kütüphanesidir. Ornegin, sag tiklqmqk(contextClick) ,
       çift tıklamak(doub1eClick), elementin uzerine
       gitmek(moveToElement) gibi mouse işlemlerini
       gerçekleştirebiliriz. Ayni zamanda, shift, control, delete,
       enter gibi keyboard tuşlar.inada actions yardımıyla basabiliriz.
       Bu tur işlemlerde sendKeys metodu kullanilir.

       2- Ne tür methodlar kullandin?
       Actions methodlari önemlidir. o yüzden ve tekrar kullanmam gerektiginden, Actions method lari iceren
       Reusable methodlari olusturdum ve gerektiginde bu Reusable metholdari kullaniyorum.
       örnegin; rightClick methodunu bir elemente saga tiklamak icin test classimda cagirabilirim.

       3- Ne tür methodlar kullandin?
       Actions methodlari önemlidir. o yüzden ve tekrar kullanmam gerektiginden, Actions method'lari iceren
       Reusable methodlari olusturdum ve gerektiginde bu Reusable metholdari kullaniyorum.
       örnegin; rightClick methodunu bir elemente saga tiklamak icin test classimda cagirabilirim.




         */


    }
}