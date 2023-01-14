package practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class HWActions01 extends TestBase {
    // https://demoqa.com/ url'ine gidin.
    // Alerts, Frame & Windows Butonuna click yap
    // clickWithText("div.card-body>h5","Alerts, Frame & Windows");
    // ""Please select an item from left to start practice."" yazısının görünür olduğunu doğrula
    // Sol'da açılan Menu den ""Browser Windows"" butonuna click yap
    // New Tab butonunun görünür olduğunu doğrula
    // New Tab butonuna click yap
    // Açılan yeni Tab da ""This is a sample page"" yazısının görünür olduğunu doğrula
    // İlk Tab'a geri dön
    // New Tab butonunun görünür olduğunu doğrula


    @Test
    public void test01() {
        //https://demoqa.com/ url'ine gidin.
        driver.get("https://demoqa.com/");

        //Alerts, Frame & Windows Butonuna click yap
        WebElement box = driver.findElement(By.xpath("(//*[@class='card-up'])[3]"));

        //clickWithText("div.card-body>h5","Alerts, Frame & Windows");
        Actions actions = new Actions(driver);
        actions.moveToElement(box).perform();
        box.click();

        //""Please select an item from left to start practice."" yazısının görünür olduğunu doğrula
        WebElement text = driver.findElement(By.xpath("//*[text()='Please select an item from left to start practice.']"));
        Assert.assertTrue(text.isDisplayed());

        //Sol'da açılan Menu den ""Browser Windows"" butonuna click yap
        driver.findElement(By.xpath("(//*[@id='item-0'])[3]")).click();

        //New Tab butonunun görünür olduğunu doğrula
        WebElement newTab = driver.findElement(By.id("tabButton"));
        Assert.assertTrue(newTab.isDisplayed());

        //New Tab butonuna click yap
        String firstTab = driver.getWindowHandle();
        newTab.click();

        //Açılan yeni Tab da ""This is a sample page"" yazısının görünür olduğunu doğrula
        List<String> allWindow = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allWindow.get(1));
        WebElement samplePage = driver.findElement(By.xpath("//*[@id='sampleHeading']"));
        Assert.assertTrue(samplePage.isDisplayed());

        //İlk Tab'a geri dön
        driver.switchTo().window(allWindow.get(0));

        //New Tab butonunun görünür olduğunu doğrula
        Assert.assertTrue(newTab.isDisplayed());
    }
}
