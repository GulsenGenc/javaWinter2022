package day40_Overrıdıng_Pollymorphisym;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exsaption {
    //kullanıcıdan ıstedıgı kadar sayı alınız
   //toplam 500 ü gecerse programı bıtırsın veya
    //kullanıcı bıtrmek ıstedıgınde Q a basmalıdır

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        do {
            System.out.println("lütfen toplamak ıstedıgınız sayıyı gırınız\nbitirmek için Q ya basınız");
            int sayı= 0;


            try {
               sayı= scan.nextInt();
               toplam+=sayı;
            } catch (InputMismatchException e) {
                String hatalıGiris=scan.next();
                if (hatalıGiris.equalsIgnoreCase("q")){
                    System.out.println("girdiğiniz sayıların toplamı = " +toplam);
                    break;
                } else
                    System.out.println("hatalı giriş");
            }
        }while (toplam<500);
    }
}
