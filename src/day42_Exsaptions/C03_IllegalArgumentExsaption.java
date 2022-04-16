package day42_Exsaptions;

import pratiklerim.İfElse;

import java.util.Scanner;

public class C03_IllegalArgumentExsaption {
    public static void main(String[] args) {
        /*
        kullanıcıdan yaşını ısteyın
        kullanıcı yas olarak negatıf bır sayı,
        0 veya 120 den buyuk bır sayı gırerse ıllegalArgumentExsaption oluşacak sekılde bır program yazınız
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı gırınız");
        int yas=scan.nextInt();

        if (yas<=0 || yas>120  ){
           // System.out.println("lütfen gecerli bır yas gırınız");
            //java bızım ıstedıgımız durumlarda exsaptıon fırlatabılır
            throw new IllegalArgumentException();
        }else {
            System.out.println("uygun yas gırdınız tesekkurler ");
        }
    }
}
