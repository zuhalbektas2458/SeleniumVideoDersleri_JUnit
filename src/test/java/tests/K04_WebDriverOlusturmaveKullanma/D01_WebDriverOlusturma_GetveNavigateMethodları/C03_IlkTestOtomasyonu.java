package tests.K04_WebDriverOlusturmaveKullanma.D01_WebDriverOlusturma_GetveNavigateMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTestOtomasyonu {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();


        //1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/

        driver.get("https://www.testotomasyonu.com");


        //2. Sayfa basligini(title) yazdirin

        System.out.println(driver.getTitle());


        //3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin

         String expectedTitle="Test Otomasyonu";
         String actualTitle= driver.getTitle();

         if (actualTitle.contains(expectedTitle)){

             System.out.println("Title Test PASSED");
         }else{

             System.out.println("Title Test FAİLED");
         }


        //4. Sayfa adresini(url) yazdirin

        System.out.println(driver.getCurrentUrl());


        //5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.


        String actualUrl="https://testotomasyonu.com/";
        String expectedUrl= driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){

            System.out.println("Url Test PASSED");
        }else{

            System.out.println("Url Test FAİLED");
        }


        //6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandles());


        //7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin


        String expectedSayfakaynakIcerik="otomasyon";

        String actualSayfaKaynagi=driver.getPageSource();

        if (actualSayfaKaynagi.contains(expectedUrl)){

            System.out.println("sayfa kaynağı testi PASSED");
        }else{

            System.out.println("sayfa kaynağı testi FAİLED");
        }




        //8. Sayfayi kapatin.


   Thread.sleep(3000);
        driver.quit();



    }
}
