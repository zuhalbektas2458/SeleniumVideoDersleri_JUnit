package tests.K05_Webelements_Locators.D04_xPath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));





        //1- https://testotomasyonu.com/addremove/ adresine gidin

        driver.get("https://testotomasyonu.com/addremove/ ");


        //2- Add Element butonuna basin

        WebElement AddButon=driver.findElement(By.xpath("//button[@id='sub-btn']"));

        AddButon.click();


        //3- Remove butonu’nun gorunur oldugunu test edin

        WebElement removeButon= driver.findElement(By.xpath("//button[@class='remove-btn']"));


         if (removeButon.isDisplayed()){

             System.out.println("Remove butonu görünürlük testi PASSED");
         }else System.out.println("Remove butonu görünürlük testi FAILED");


        //4- Remove tusuna basin
        removeButon.click();


        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement AddRemoveElmentYazisi= driver.findElement(By.xpath("//h2"));


        if (AddRemoveElmentYazisi.isDisplayed()){

            System.out.println("AddRemoveElmentYazisi butonu görünürlük testi PASSED");
        }else System.out.println("AddRemoveElmentYazisi butonu görünürlük testi FAILED");




        // WebElement addRemoveYaziElementi = driver.findElement(By.tagName("h2"));




        //6- sayfayi kapatin

        Thread.sleep(3000);
        driver.quit();




    }
}
