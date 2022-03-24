package day09_ternary_Switch;

import java.util.Scanner;

public class C06_ArtıkYılSorusu {
    public static void main(String[] args) {
        //Soru13 Interview Question
        //Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
        //Kural 1 4 ile bolunemeyen yillar artik yil degildir
        //Kural 2 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        //Kural 3 4 ’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400 ’un kati olan yillar artik
        //yildir
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir yıl giriniz");
        int yıl = scan.nextInt();

        if (yıl % 4 == 0) {
            if (yıl % 100 != 0) {
                System.out.println("artık yıldır");
            } else {
                System.out.println(yıl % 400 == 0 ? "artık yıldır" : "artık yıl değildir");
            }
        } else {
            System.out.println("artık yıl değildir.");
        }
    }
}