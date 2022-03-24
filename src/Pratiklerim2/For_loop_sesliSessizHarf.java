package Pratiklerim2;

import java.util.Scanner;

public class For_loop_sesliSessizHarf {
    public static void main(String[] args) {
        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
 değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
 Sesli harfler: a,e,i,o,u

 Test Data:
 a
 Beklenen Çıktı:
 a harfi sesli harfdir.

 Test Data:
 d
 Beklenen Çıktı:
 d harfi sesiz harftir.

 Test Data:
 we  yada  %

 Beklenen Çıktı:
 Yanlis karakter girdiniz!

  */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        String harf=scan.next();

        if (!Character.isAlphabetic(harf.charAt(0))){
            System.out.println("yanlış karakter girdiniz.");
        } else if (harf.length()-1!=0){
            System.out.println("yanlış karakter girdiniz");
        }
        else if (harf.charAt(0)=='a'||harf.charAt(0)=='e'||harf.charAt(0)=='o'||harf.charAt(0)=='ı'||harf.charAt(0)=='u'){
            System.out.println(harf+ " sesli harftir.");
        } else{
            System.out.println(harf+" sessiz harftir" );
        }


























    }


}
