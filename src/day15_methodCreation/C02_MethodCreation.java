package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //kullanıcıdan bır kelıme ısteyın.
        //eger kelıme 3 harften kısa ıse "kelıme çok kısa " yazdırın.
        //eger kelıme 3 4 vaya 5 harfli ıse harf sayısını ve kelımenın tersten yazılısını yazdırın
        //eger 5 harften uzun ıse "kelıme cok uzun " yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime = scan.next();
        String tersKelime = "";

        if (kelime.length() < 3) {
            System.out.println("kelime cok kısa");
        } else if (kelime.length() <= 5) {
            if (kelime.length() == 3) {
                tersKelime = kelime.substring(2) +
                        kelime.substring(1, 2) +
                        kelime.substring(0, 1);
                System.out.println(tersKelime);

            } else if (kelime.length() == 4) {
                tersKelime = kelime.substring(3) +
                        kelime.substring(2, 3) +
                        kelime.substring(1, 2) +
                        kelime.substring(0, 1);
                System.out.println(tersKelime);
            } else {
                tersKelime = kelime.substring(4) +
                        kelime.substring(3, 4) +
                        kelime.substring(2, 3) +
                        kelime.substring(1, 2) +
                        kelime.substring(0, 1);
                System.out.println(tersKelime);
            }
        } else {
            System.out.println("kelime cok uzun ");
        }
    }}
