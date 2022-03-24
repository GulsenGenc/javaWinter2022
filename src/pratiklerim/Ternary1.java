package pratiklerim;

import java.util.Scanner;

public class Ternary1 {
    public static void main(String[] args) {
        //Soru :Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz.");
        double sayı1=scan.nextDouble();
        double sayı2=scan.nextDouble();

     if (sayı1>sayı2){
         System.out.println(sayı2);
     } else {
         System.out.println(sayı1);
     }

        System.out.println(sayı1>sayı2 ? sayı2: sayı1);
    }
}
