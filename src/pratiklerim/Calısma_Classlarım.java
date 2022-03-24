package pratiklerim;

import java.util.Scanner;

public class Calısma_Classlarım {
    public static void main(String[] args) {


        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz.");
        int sayı =scan.nextInt();

        if (sayı%2==0){
            System.out.println("sayı çift sayıdır");
        } else {
            System.out.println("sayı tek sayıdır");
        }


    }
}
