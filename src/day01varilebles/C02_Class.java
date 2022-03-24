package day01varilebles;

import java.util.Scanner;

public class C02_Class {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");

        String Isim= scan.nextLine();

        System.out.println("lütfen soyisminizi giriniz");
        String Soyisim=scan.nextLine();
        System.out.println("kullanıcı ismi : "+ Isim );
        System.out.println("kullanıcı soismi :" + Soyisim);
        System.out.println("kursa kaydınız alınmıştır ,katılımınız icin tesekkurederız");


    }
}
