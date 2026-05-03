package tests.K05_Webelements_Locators.D02_byName_byClassName;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C03_WebAppTesti {

    public static void main(String[] args){

        //1- Bir test class’i olusturun ilgili ayarlari yapin

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2- http://zero.webappsecurity.com/ adresine gidin

        driver.get("http://zero.webappsecurity.com/");


        //3-"ONLİNE  BANKING" linkine tıklayın


        driver.findElement(By.id("onlineBankingMenu")).click();


        //4- Resim altinda 6 islem basligi oldugunu test edin


        List<WebElement> islemBaslıklarıList=driver.findElements(By.className("headers"));


        int expectedİslemSayisi=6;
        int actualİslemSayisi=islemBaslıklarıList.size();


        if (expectedİslemSayisi==actualİslemSayisi){


            System.out.println("İşlem başlığı adet sayısı testi PASSED");
        }else{

            System.out.println("İşlem başlığı adet sayısı testi FAILED");

        }


        //5- Islem basliklari icinde “Pay Bills” oldugunu test edin
         /*
            1.yontem : for loop ile her bir webelementi gozden gecirip
                       bir flag ile eger istenen metne esit olan baslik varsa
                       sonucu true olarak kaydedebiliriz





          */

           boolean payBillsVarMi=false;



          for (WebElement  eachElement: islemBaslıklarıList){

              if ( eachElement.getText().equals("Pay Bills")){

                  payBillsVarMi=true;

              }
          }

          if (payBillsVarMi){

              System.out.println("PayBills testi 1 PASSED");
          } else System.out.println("PayBills testi 1 FAILED");

         /*
               2.yontem : Bos bir String list olusturup
               for loop ile webelement'ler uzerindeki yazilari alip
               String list'e ekleriz,
               Sonra o String listede aranan basligin olup olmadigini test ederiz
          */



        List<String> webElementIsimleri=new ArrayList<>();

        for (WebElement each  : islemBaslıklarıList){

            webElementIsimleri.add(each.getText());

        }

        System.out.println("Başlık yazıları :" +webElementIsimleri);

        if (webElementIsimleri.contains("Pay Bills")){

            System.out.println("PayBills testi 2 PASSED");
        }else System.out.println("PayBills testi 2 FAILED");






        //6- Sayfayi kapatin

        driver.quit();


        }








    }



