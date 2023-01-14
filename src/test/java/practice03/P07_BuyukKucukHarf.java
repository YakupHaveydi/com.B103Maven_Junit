package practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.awt.image.Kernel;

public class P07_BuyukKucukHarf extends TestBase {

    @Test
    public void test01() {

        //google sayfasina gidelim
        driver.get("https://google.com");

        //Buyuk kucuk harf olucak sekilde "HeLlO" yazdiralim
        WebElement searcBox = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        searcBox.sendKeys(Keys.SHIFT, "h", Keys.SHIFT,"e", Keys.SHIFT,"l", Keys.SHIFT,"l", Keys.SHIFT,"o",Keys.SHIFT);

    }
}
