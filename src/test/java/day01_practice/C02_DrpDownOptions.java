package day01_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C02_DrpDownOptions {

    // ...Exercise 2...


// https://www.amazon.com/ sayfasina gidin
// dropdown'dan "Baby" secenegini secin
// sectiginiz option'i yazdirin
// dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin

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
        driver.close();
    }

    @Test
    public void test02() {

        // ...Exercise 2...


       // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com/");


       // dropdown'dan "Baby" secenegini secin
        // 1. Adim: Locate edilmeli.
        WebElement ddMenu = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));

        // 2. Adim: Select object'i olusturulmali.
        Select select = new Select(ddMenu);

        // 3. Adim: Option secilir.
        select.selectByVisibleText("Baby");


       // sectiginiz option'i yazdirin
        String sectigimOptin = select.getFirstSelectedOption().getText();//sectigimiz optionu getirmek icin kullanilir
        System.out.println("SECTIGIM OPTION : "+ sectigimOptin);


       // dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin.
        List<WebElement> tumOptionlar = select.getOptions();
        int actuelOptionSayisi = tumOptionlar.size();
        int expectedOptionSayisi = 28;

        Assert.assertEquals(expectedOptionSayisi,actuelOptionSayisi);


    }
}
