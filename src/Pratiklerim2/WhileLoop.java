package Pratiklerim2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayı=scan.nextInt();

        while(sayı>=0){
            for (int i = sayı; i>=0 ; i--) {
                if (i%2!=0){
                    System.out.println(i);
                }
            }
            break;
        }
    }
}
