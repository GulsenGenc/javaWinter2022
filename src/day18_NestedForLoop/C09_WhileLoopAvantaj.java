package day18_NestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner scan =new Scanner(System.in);

        int sayı=0;
        int toplam=0;

        while (toplam<500){
            System.out.println("lütfen bir sayı gırınız");
            sayı=scan.nextInt();
            toplam+=sayı;
        }
        System.out.println("artık yeter çok sayı gırdın.toplam :" +toplam+" oldu");

    }
}
