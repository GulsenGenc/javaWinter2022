package day07_ifElseStatements;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class C03_TekCiftSayı {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bır tamsayı gırınız");
        int sayı = scan.nextInt();

        if (sayı % 2 == 0) {
            System.out.println("girilen sayı çift sayıdır");
        }


        if (sayı%2!=0){

            System.out.println("girdiğiniz sayı çitf sayıdır");
        }


        // normalde bir tamsayi ya tektir veya cifttir, ucuncu bir durum yoktur
        // o zaman tek olmasi ve cift olmasini iki ayri if ile degil
        // if else ile tek statement'da yapmak daha guzel olur
        // ======== if else ile cozum=======

        if (sayı%2==0){
            System.out.println("girdiginiz sayi cift sayidir");
        } else {
            System.out.println("girdiginiz sayi tek sayidir");
        }




    }
}
