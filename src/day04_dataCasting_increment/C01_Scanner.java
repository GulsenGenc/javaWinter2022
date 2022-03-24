package day04_dataCasting_increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz  ");
        char ilkHarf=scan.next().charAt(0); // charAt(index) method'u parametre olarak yazdigimiz index'deki char'i bize getirir
        // String'de index 0'dan baslar

        System.out.println("girdiginiz ismin ilk harfi :" + ilkHarf);
    }
}
