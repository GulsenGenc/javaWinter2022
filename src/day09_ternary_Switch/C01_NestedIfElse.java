package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        // Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
//bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana "5’e bölünen
//çift sayı" yazdırın. Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
//Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir sayı gırınız.");
        int sayı = scan.nextInt();

    if (sayı<1000 || sayı>9999){
        System.out.println("lütfen 4 basamaklı bir sayı giriniz");
    }else if (sayı%5==0){
        if (sayı%10==0){
            System.out.println("5 e bölünebilen çift sayı");
        } else{
            System.out.println("5 e bölünebilen tek sayı");
        }
    } else {
        System.out.println("tekrar deneyiniz");
    }


        }
    }


