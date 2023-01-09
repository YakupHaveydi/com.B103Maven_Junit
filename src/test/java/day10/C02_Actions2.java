package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions2 extends TestBase {
        /*
           MANUEL:
      1. Amazon home sayfasina git
      2. Account & list e uzerinde bekle
      3. Acilan pencerede Account linkine tikla
      4. Acilan sayfanin Title inin, your Account oldugunu dogrula.

    */

    @Test
    public void hoverOverTest(){
    //    Amazon home sayfasina git
        driver.get("https://www.amazon.com/");

    //    Account & List e uzerinde bekle -mouse over - hover over
    //    1. ACTIONS OBJESI
        Actions actions = new Actions(driver);

    //    2. ELEMANI BUL
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        waitFor(1);

    //    2. UYGUN ACTIONS METHODUNU KULLAN.  --> EN SONRA PERFORM KULLANMAYI UNUTMA
        actions.moveToElement(accountList).perform();
        waitFor(3);

    //    Acilan pencerede Account linkine tikla
        driver.findElement(By.linkText("Account")).click();

    //    Acilan sayfanin title'inin Your Account icerdigini dogrula.
        Assert.assertTrue(driver.getTitle().contains("Your Account"));


    }
}
