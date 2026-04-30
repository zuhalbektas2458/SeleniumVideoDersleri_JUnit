package tests.K04_WebDriverOlusturmaveKullanma.D01_WebDriverOlusturma_GetveNavigateMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlariTest {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();




        //1. Youtube ana sayfasina gidin . https://www.youtube.com/

        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);

        //2. url’in “youtube” icerdigini test edin.

        String expectedIcerik="youtube";
        String actualIcerik = driver.getCurrentUrl();

        if (actualIcerik.contains(actualIcerik)){

            System.out.println("Url içerik testi PASSED");
        }else{
            System.out.println("Url içerik testi FAİLED");

        }


        //3. Testotomasyonu sayfasina gidin. https://www.testotomasyonu.com/

          driver.navigate().to(" https://www.testotomasyonu.com/");


        //4. Title’in “Test Otomasyonu” icerdigini test edin.

         String expectedTitle="Test Otomasyonu";
         String actualTitle = driver.getTitle();

         if(actualTitle.contains(actualTitle)){

             System.out.println("Title testi PASSED");
         }else{

             System.out.println("Title testi FAİLED");
         }


        //5. Tekrar YouTube’sayfasina donun.

        driver.navigate().back();

        //6. Title’in “YouTube” oldugunu test edin

        String expectedTitlee="YouTube";
        String actuallTitlee = driver.getTitle();

        if (actuallTitlee.equals(actuallTitlee)){
            System.out.println("Title testi PASSED 2");

        }else{

            System.out.println("Title testi FAİLED 2");
        }


        //7. Sayfayi Refresh(yenile) yapin.

        driver.navigate().refresh();


        //8. Sayfayi kapatalim / Tum sayfalari kapattin.

     Thread.sleep(2000);

        driver.quit();



    }
}
