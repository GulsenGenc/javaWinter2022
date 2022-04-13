package day40_Overrıdıng_Pollymorphisym;

import java.util.Scanner;

public class C04_Exsaption {
    public static void main(String[] args) {
        //String olarak verılen bır sayıyı integer a cevırp iki katını ekranda yazdırın



        String str="1345a";

        //str içinde sayı olmayan bır karakter olursa
        //NumberFormatException.forInputString hatası verır



        try {
            int sayı=Integer.parseInt(str);
            System.out.println("girilen sayının iki katı :"+2*sayı);
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("girdiğiniz string sayı olmayan elementler içeriyor");
        }
    }
}
