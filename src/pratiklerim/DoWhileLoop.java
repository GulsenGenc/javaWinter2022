package pratiklerim;

import day16_MethodCreatıon.C01_MethodileSıfreKontrol;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        //Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
        //edin ve sifredeki hatalari yazdirin.
        //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
        //girdiginde “Sifreniz Kabul edilmistir” yazdirin.

        //Sifre kucuk harf icermelidir
        //Sifre buyuk harf icermelidir
        //Sifre özel karakter icermemelidir
        //Sifre en az 8 karakter olmalidir.


       String sifre="abcjkl_8";
       int uzunluk=sifre.length();
       boolean kucukHarfKontrol=false;
       boolean buyukHarfKontrol=false;
       boolean ozelKarakter=false;
       boolean uzunlukKontrol=false;
       do {
           for (int i = 0; i < uzunluk-1; i++) {
               if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z')
                   kucukHarfKontrol=true;
               if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z')
                   buyukHarfKontrol=true;
           }
           if (uzunluk<=8)
               uzunlukKontrol=true;
           if (!sifre.contains("\\W"))
               ozelKarakter=true;


       }while(!kucukHarfKontrol&&buyukHarfKontrol&&uzunlukKontrol&&ozelKarakter);

       if (kucukHarfKontrol&&buyukHarfKontrol&&uzunlukKontrol&&ozelKarakter){
           System.out.println("şifre başarıyla kaydedılmıştır.");
       } else {
           System.out.println("lütfen şifrenizi kontrol ediniz.");
       }















    }



}
