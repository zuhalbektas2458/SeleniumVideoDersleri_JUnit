package tests.K05_Webelements_Locators.D02_byName_byClassName;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_FindElements {

    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //2- https://www.testotomasyonu.com/ adresine gidin

        driver.get("https://www.testotomasyonu.com/ ");

        //3- arama kutusuna phone yazip aratin


        WebElement aramaKutusu=driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        Thread.sleep(3000);


        //4- Category bolumunde 8 element oldugunu test edin

        List<WebElement> categoriElementleriList=driver.findElements(By.className("panel-list"));

        int expectedCategoriElementSayisi=8;

        int actualCategoriElementSayisi=categoriElementleriList.size();

        if (expectedCategoriElementSayisi==actualCategoriElementSayisi){

            System.out.println("categori sayısı testi  PASSED");
        }else{

            System.out.println("categori sayısı testi  PASSED");
        }



        //5- Category isimlerini yazdirin
        /*
         Normalde List direkt olarak yazdirilabilir
         AMMMAAAA bizim listemiz WebElement'lerden olusuyor
         ve WebElement'ler direkt yazdirilamaz
         */

        for (int i = 0; i <categoriElementleriList.size() ; i++) {

            System.out.println(categoriElementleriList.get(i).getText());

        }


        /*
            Grocery

            Travel
            Furniture
            Shoes
            Men Fashion
            Women Fashion
            Electronics
         */


        //6- Sayfayi kapatin

        driver.quit();


    }
}