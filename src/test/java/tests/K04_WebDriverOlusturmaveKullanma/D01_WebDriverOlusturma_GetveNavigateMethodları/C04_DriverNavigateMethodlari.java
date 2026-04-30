package tests.K04_WebDriverOlusturmaveKullanma.D01_WebDriverOlusturma_GetveNavigateMethodları;

import com.sun.tools.javac.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(3000);

        driver.navigate().to("https://www.testotomasyonu.com");



        Thread.sleep(3000);

        driver.navigate().to("https://www.wisequarter.com");
        //driver.get() ile aynı işleve sahiptir

        Thread.sleep(3000);

        // geriye testotomasyonu sayfasina donun

        driver.navigate().back();

        Thread.sleep(3000);

        // yeniden wisequarter sayfasina gidin

        driver.navigate().forward();

        Thread.sleep(3000);


        driver.quit();


    }
}
