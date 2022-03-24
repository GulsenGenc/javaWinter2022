package day18_NestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan kac sayı toplamak ıstedıgını alın
        //ve bu sayıların toplamını ekrana yazdırın

        int sayıAdedi=3;
        Scanner scan =new Scanner(System.in);
        int sayı=0;
        int toplam=0;

        for (int i = 1; i <=sayıAdedi ; i++) {
            System.out.println("lütfen bir sayı gırınız");
           sayı=scan.nextInt();
           toplam+=sayı;
        }
        System.out.println("girilen "+sayıAdedi+ " sayının toplamı :" +toplam);

        //while ile yapalım
        sayı=0;
        toplam=0;
        int sayac=1;

        while (sayac<=sayıAdedi){
            System.out.println("lütfen bir sayı gırınız");
            sayı=scan.nextInt();
            toplam+=sayı;
            sayac++;


        }
        System.out.println("girilen "+sayıAdedi+ " sayının toplamı :" +toplam);

    }
}
