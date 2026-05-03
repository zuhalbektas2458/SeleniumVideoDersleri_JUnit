package tests.K05_Webelements_Locators.D02_byName_byClassName;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class C01_ByClassName {

    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- https://www.testotomasyonu.com adresine gidin

        driver.get("https://www.testotomasyonu.com ");


        //3- urun arama kutusunu locate edin
        // WebElement aramaKutusu = driver.findElement(By.name("search"));

        //WebElement aramaKutusu=driver.findElement(By.name("search"));

        WebElement aramaKutusu=driver.findElement(By.className("search-input"));


        //4- arama kutusuna “shoe” yazdirin

        aramaKutusu.sendKeys("shoes");
        Thread.sleep(3000);

        //5- arama islemini yapabilmek icin ENTER tusuna basin

        aramaKutusu.submit();


        //6- arama sonucunda urun bulunabildigini test edin.
        /*
            WebElement'i direkt yazdiramazsiniz, direkt yazdirmak istediginizde referansini yazdirir
            Eger WebElement ustundelki yaziyi kullanmak isterseniz getText() kullanmalisiniz
         */

        WebElement aramaSonucElementi=driver.findElement(By.className("product-count-text"));

        System.out.println(aramaSonucElementi.getText());

        String aramaSonucStr=aramaSonucElementi.getText();

        aramaSonucStr=aramaSonucStr.replaceAll("\\D","");


        int aramaSonucSayisiInt =Integer.parseInt(aramaSonucStr);


        if (aramaSonucSayisiInt >0){

            System.out.println("Arama sonucu testi: PASSED" );

            }else{

            System.out.println("Arama sonucu testi: FAILED" );


        }







         Thread.sleep(3000);
        driver.quit();



    }
}