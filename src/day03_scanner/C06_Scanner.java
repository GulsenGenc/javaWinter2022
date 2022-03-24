package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        System.out.println("Lütfen soisminizi giriniz");
        System.out.println("isim ve soyisim : " +isim + " " + soyisim );
    }
}
