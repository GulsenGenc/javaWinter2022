package Pratiklerim2;

import java.util.Scanner;

public class WhileLoop_SayınınRkmlrTplmı {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı gırınız.");
        int sayı=scan.nextInt();
        int rakam=0;
        int rkmToplamı=0;
        int sayac=0;


        while (sayı>0){
            rakam=sayı%10;
            rkmToplamı+=rakam;
            sayı=sayı/10;
            sayac++;
        }
        System.out.println("girdiğiniz sayının rakamları toplamı = "+rkmToplamı);

    }
}
