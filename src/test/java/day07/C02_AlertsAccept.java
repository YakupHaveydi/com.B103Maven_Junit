package day07;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
public class C02_AlertsAccept extends TestBase {
    @Test
    public void acceptAlertTest() throws InterruptedException {
        //https://testcenter.techproeducation.com/index.php?page=javascript-alerts
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");


//        1. butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();


//        uyarıdaki OK butonuna tıklayın
        Thread.sleep(5000);
        driver
                .switchTo()//degistir
                .alert()//alerte degistir
                .accept();//OK secenegine tiklanir
        Thread.sleep(5000);

//        ve result mesajının
//       “You successfully clicked an alert” oldugunu test edin.
        //button[@onclick='jsAlert()']
    }

    /*
    Alertleri nasil automate edersiniz? How to handle alets in Selenium?
     -Alertler Javascript ile olusur.Inspect edilemezler.Oncelikle alerte etmemiz gerekir.
     */
}