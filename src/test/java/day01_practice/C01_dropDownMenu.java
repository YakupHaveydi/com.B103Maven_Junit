package day01_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.time.Duration;

public class C01_dropDownMenu {

// ...Exercise 1...


// https://www.amazon.com/ sayfasina gidin
// dropdown'dan "Books" secenegini secin
// arama cubuguna "Java" aratın
// arama sonuclarinin Java icerdigini test edin

    WebDriver driver;

    @Before
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown(){
       // driver.close();
    }

    @Test
    public void test01() {

        // ...Exercise 1...


      // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com/");

      // dropdown'dan "Books" secenegini secin
        // Dropdown 3 adimda handle edilir.

      // 1. Adim: Locate edilmeli.
        WebElement ddMenu = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));

      // 2. Adim: Select object'i olusturulmali.
        Select select = new Select(ddMenu);

      // 3. Adim: Option secilir.
        select.selectByVisibleText("Books");
        //select.selectByValue("search-alias=stripbooks");
        //select.selectByIndex(12);


      // arama cubuguna "Java" aratın.
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java" + Keys.ENTER);


        // arama sonuclarinin Java icerdigini test edin
        WebElement aramaSonucElementi=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        String aramaSonucYazısı=aramaSonucElementi.getText();

        Assert.assertTrue(aramaSonucYazısı.contains("Java"));

    }
}
