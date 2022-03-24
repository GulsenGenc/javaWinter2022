package day08ifElseIfStatement;

import java.util.Scanner;

public class C03_SayıKontrol {
    public static void main(String[] args) {
        // Kullanicidan iki sayi isteyin,
// sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
// sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
// sayilarin ikisi farkli isaretlere sahipse
// "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
// sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz.");

        double sayı1=scan.nextDouble();
        double sayı2=scan.nextDouble();
       //sayılardan ikisi de pozıtıf ise sayıların toplamı yazdırılır.
        if (sayı1>0 && sayı2>0){
            System.out.println("gırdıgınız iki sayı pozıtıf oldugundan toplamları : "+ (sayı1+sayı2));
        //sayıların iki de negatif ise
        }else if (sayı1<0 && sayı2<0){
            System.out.println("gırdıgınız iki sayı negatıf oldugundan sayıların çarpımı : "+ (sayı1*sayı2));
         //sayıların işaretleri farklı ise ;
        }else if(sayı1*sayı2<0){
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        }else {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }










    }
}
