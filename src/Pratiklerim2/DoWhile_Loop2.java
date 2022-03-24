package Pratiklerim2;

import java.util.Scanner;

public class DoWhile_Loop2 {
    public static void main(String[] args) {
         /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char tus = scan.next().charAt(0);


        if (tus != 'x') {
            System.out.println("program çalışıyor");


        } else {
            System.out.println("program bitti");

        }


    }
}
