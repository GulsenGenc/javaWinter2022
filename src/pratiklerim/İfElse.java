package pratiklerim;

import java.util.Scanner;

public class İfElse{
    public static void main(String[] args) {

        //Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
        //isimlerini yazdirin
       // Ornek:
       // ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        //ilkHarf=S output = “Sali”
        //*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

       Scanner scan =new Scanner(System.in);
        System.out.println("lütfen gun isimlerinden birinin ilk harfini giriniz");
        char harf=scan.next().toUpperCase().charAt(0);
        if (harf=='P'){
            System.out.println("pazar,pazartesi,perşembe");
        } else if (harf=='S'){
            System.out.println("salı");
        }else if (harf=='Ç'){
            System.out.println("çarşamba");
        } else if (harf=='C'){
            System.out.println("cuma,cumartesi");
        }else {
            System.out.println("lütfen harfi kontrol ediniz");
        }

    }
}
