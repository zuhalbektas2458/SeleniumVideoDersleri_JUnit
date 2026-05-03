package tests.K06_JUnitFramework.D01_JUnitFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C02_CokluTest {


    // 3 farkli method olusturun
    // 1.method testotomasyonu anasayfaya gidin
    //          title'in Test Otomasyonu icerdigini test edin
    // 2.method wisequarter anasayfaya gidin
    //          url'in wisequarter icerdigini test edin
    // 3.method junit.org adresine gidin
    //          url'in "https://junit.org/junit5/" oldugunu test edin


    public static void main(String[] args) {


        testOtomasyonuTesti();
        wiseQuarterTesti();
        jUnitTesti();



    }


    public static void testOtomasyonuTesti() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com");
        String expectedTitle = "Test Otomasyonu";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {

            System.out.println("Sayfa title testi PASSED");
        } else System.out.println("Sayfa title testi FAILED");


        ReusableMethods.bekle(1);
        driver.quit();


    }



     public static void wiseQuarterTesti()  {

         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         driver.get("https://www.wisequarter.com");

         String expectedUrlIcerik="wisequarter";

         String actualUrlIcerik= driver.getCurrentUrl();


         if (actualUrlIcerik.contains(expectedUrlIcerik)){

             System.out.println("Sayfa url içerik  testi PASSED");
         } else System.out.println("Sayfa url içerik  testi FAILED");


         ReusableMethods.bekle(1);
         driver.quit();


     }


      public static void  jUnitTesti()  {

          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


          driver.get("https://junit.org/junit5/");

          String expectedUrl="https://junit.org/junit5/";
          String actualUrl=driver.getCurrentUrl();


          if (actualUrl.contains(expectedUrl)){

              System.out.println("Sayfa url  testi PASSED");
          } else System.out.println("Sayfa url  testi FAILED");




          ReusableMethods.bekle(1);
          driver.quit();







      }





    }

