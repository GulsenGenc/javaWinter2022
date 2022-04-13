package day40_Overrıdıng_Pollymorphisym;

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
            int sayı= scan.nextInt();
            toplam+=sayı;
        }while (toplam<500);
    }
}
