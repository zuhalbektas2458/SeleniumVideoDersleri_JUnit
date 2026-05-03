package tests.K05_Webelements_Locators.D03_byTagName_byLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_WebElementMethodlari {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // https://www.testotomasyonu.com/form adresine gidin

        driver.get("https://www.testotomasyonu.com/form");

        WebElement kadinRadioButon=driver.findElement(By.id("inlineRadio1"));
        WebElement erkekRadioButon=driver.findElement(By.id("inlineRadio2"));
        WebElement digerRadioButon=driver.findElement(By.id("inlineRadio3"));

        // Cinsiyet bolumunden size uygun radio button secin

     kadinRadioButon.click();
        // istediginiz radio button'un secili oldugunu test edin

        kadinRadioButon.isSelected();
        Thread.sleep(2000);

        if (kadinRadioButon.isSelected()){

            System.out.println("seçilen radio butonun kontrol testi PASSED");
        }else{


            System.out.println("seçilen radio butonun kontrol testi FAILED");
        }


        // sizin isaretlediginiz disindaki butonlarin secili olmadigini test edin

        if (!erkekRadioButon.isSelected() && !digerRadioButon.isSelected()){

            System.out.println("Diğer radio butonların seçili olmadığı testi PASSED");


        }else     System.out.println("Diğer radio butonların seçili olmadığı testi FAİLED");




        // soyisim kutusunun boyutlarini ve konumunu yazdirin

        WebElement soyİsimKutusu=driver.findElement(By.id("surname"));

        System.out.println("Soyisim kutusu konumu : " + soyİsimKutusu.getLocation());
        System.out.println("Soyisim kutusu boyutu : " + soyİsimKutusu.getSize());




        // soyisim kutusunun HTML kodundaki class attribute degerinin
        // "form-control" oldugunu test edin

        String expectedSoyIsimAtrDegeri="form-control";

        String actualSoyIsimAtrDegeri=soyİsimKutusu.getAttribute("class");

        if (actualSoyIsimAtrDegeri.equals(expectedSoyIsimAtrDegeri)){

            System.out.println("Soyisim kutusu class attribüte testi PASSED");
        }else    System.out.println("Soyisim kutusu class attribüte testi FAILED");



        // sayfayi kapatin

        Thread.sleep(2000);
        driver.quit();








    }
}
