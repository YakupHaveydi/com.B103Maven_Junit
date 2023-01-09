package day09;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C04_Cookies extends TestBase {

    @Test
    public void handleCookiesTest() {


        //1.Amazona git
        //2.toplam cookie sayisini bul
        //3. Bir Cookie yi smiyle bul
        //4. Yeni bir cookie ekle
        //5. Bir Cookie yi ismiyle sil
        //6. Tum cookie leri sil


        //1.Amazona git
        driver.get("https://www.amazon.com");
        waitFor(3);

        //2.toplam cookie sayisini bul
        Set<Cookie> allCookies = driver.manage().getCookies();//toplam cerez sayisini verir.
        int cookieSayisi = allCookies.size();
        System.out.println("Sayfada "+cookieSayisi+ " adet cookie var");


        //3. Bir Cookie yi ismiyle bul
        //tum cookleri yazdiralim
        //allCookie.stream().forEach(t -> System.out.println(t.getName()));       //lambda ile yapildi

        for (Cookie eachCookie : allCookies) {
            System.out.println("COOKIE ISIMLERI : " +eachCookie.getName());
        }
        System.out.println(driver.manage().getCookieNamed("i18n-prefs"));


        //4. Yeni bir cookie ekle
        Cookie favoriCookiem= new Cookie("cikolatam","antem-fistikli-cikolata");
        driver.manage().addCookie(favoriCookiem);//sayfaya yeni cookie ekle
        waitFor(3);
        System.out.println("Yeni Cookie Sayisi : "+driver.manage().getCookies().size());

        //5. Bir Cookie yi ismiyle sil
        driver.manage().deleteCookieNamed("session-id");

        //6. Tum cookie leri sil
        driver.manage().deleteAllCookies();
        waitFor(5);
        System.out.println("TUM COOKIES LERI SILDIM. YENI COOKIE SAYISI : "+driver.manage().getCookies().size());

    }
}
