package tests.K05_Webelements_Locators.D04_xPath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath_TextKullanimi {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //1- https://testotomasyonu.com/addremove/ adresine gidin

        driver.get("https://testotomasyonu.com/addremove/");

        //2- Add Element butonuna basin

        driver.findElement(By.xpath("//button[text()='Add']")).click();


        //3- Remove butonu’nun gorunur oldugunu test edin

        WebElement removeButonu= driver.findElement(By.xpath("//button[text()='Remove']"));

        if (removeButonu.isDisplayed()){

            System.out.println("Remove butonu görünürlük testi PASSED");
        }else System.out.println("Remove butonu görünürlük testi FAILED");



        //4- Remove tusuna basin

        removeButonu.click();


        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement AddRemoveElementsYazisi= driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));

        if (AddRemoveElementsYazisi.isDisplayed()){

            System.out.println("AddRemoveElementsYazisi butonu görünürlük testi PASSED");
        }else System.out.println("AddRemoveElementsYazisi butonu görünürlük testi FAILED");






        // WebElement addRemoveYaziElementi = driver.findElement(By.tagName("h2"));




        //6- sayfayi kapatin

        Thread.sleep(2000);
        driver.quit();





    }
}
