package practice_free;

import java.util.Scanner;

public class QQ6 {
    public static void main(String[] args) {
        /*     Interview Question
         Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
       ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
       hesaplayan kodu yazınız.

      Örnek Ekran Çıktısı
      Girilen sayı=4
      Kareler toplamı=14

*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz.");
        int sayı=scan.nextInt();
        int toplam =0;
        for (int i = 1; i <sayı ; i++) {
            toplam+=(i*i);

            
        }
        System.out.println("sayıların kareleri toplamı :" + toplam);
    }
}
