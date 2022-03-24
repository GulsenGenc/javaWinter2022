package pratiklerim;

import java.util.Scanner;

public class WhileLoop5 {
    public static void main(String[] args) {

      //  Soru 4 )Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
      //  harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
       // yapmadigini farz edin.
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen baslangıc için bir harf giriniz");
        System.out.println("lütfen bitiş için bir harf giriniz");
        char baslangıc=scan.next().toUpperCase().charAt(0)  ;
        char bitis=scan.next().toUpperCase().charAt(0)  ;

        for (char i = baslangıc; i <= bitis ; i++) {

            System.out.println(i);
        }
    }
}
