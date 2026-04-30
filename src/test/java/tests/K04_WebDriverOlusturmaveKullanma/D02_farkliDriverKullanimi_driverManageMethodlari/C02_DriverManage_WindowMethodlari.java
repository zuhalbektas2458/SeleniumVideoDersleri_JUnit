package tests.K04_WebDriverOlusturmaveKullanma.D02_farkliDriverKullanimi_driverManageMethodlari;

import com.google.j2objc.annotations.Weak;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class C02_DriverManage_WindowMethodlari {

    public static void main(String[] args) throws InterruptedException {


  WebDriverManager.chromedriver().setup();

  WebDriver driver=new ChromeDriver();




        // 1. https://www.testotomasyonu.com/ sayfasina gidin

        driver.get("https://www.testotomasyonu.com/");

        // 2. Sayfanin konumunu ve boyutlarini yazdirin

        System.out.println("Açılışta sayfanın konumu: " +driver.manage().window().getPosition());

        System.out.println("Açılışta sayfanın boyutu: " +driver.manage().window().getSize());

        Thread.sleep(2000);

        // 3. Sayfayi simge durumuna getirin

        driver.manage().window().minimize();


        // 4. Simge durumunda 3 saniye bekleyip sayfayi maximize yapin

        Thread.sleep(3000);

        driver.manage().window().maximize();

        Thread.sleep(3000);


        // 5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin

        System.out.println("Maximize durumda sayfa konumu :"+ driver.manage().window().getPosition());
        System.out.println("Maximize durumda sayfa boyutu :"+driver.manage().window().getSize());


        // 6. Sayfayi fullscreen yapin

        driver.manage().window().fullscreen();

        Thread.sleep(2000);


        // 7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin

        System.out.println("Fullscreen konumda sayfanın konumu:"+driver.manage().window().getPosition());

        System.out.println("Fullscreen konumda sayfanın boyutu:"+driver.manage().window().getSize());
        //Çalıştığı ekranının çözünürlüğünü gösterir



        // 8. Sayfanin konumunu pixel olarak (150,150)’ye getirin
        Thread.sleep(2000);
        driver.manage().window().setPosition(new Point(150,150));

        // 9. Sayfa boyutunu pixel olarak (1000,500)’ye ayarlayin

        driver.manage().window().setSize(new Dimension(1000,500));


        //10. Sayfayi kapatin
        Thread.sleep(4000);
        driver.quit();


    }
}
