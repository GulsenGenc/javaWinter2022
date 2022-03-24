package pratiklerim;

import java.util.Scanner;

public class Ternary2 {
    public static void main(String[] args) {
        //Soru: Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayı = scan.nextDouble();

        System.out.println(sayı<0 ? sayı*(-1) : sayı);

        //Kullanicidan bir sayi alin Sayi pozitifse “Sayi pozitif” yazdirin, negatifse
        //sayinin karesini yazdirin


        System.out.println(sayı>0 ? "sayı pozitif": sayı*sayı );

        }
    }

