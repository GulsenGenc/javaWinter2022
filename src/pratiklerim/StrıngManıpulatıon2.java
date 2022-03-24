package pratiklerim;

import java.util.Scanner;

public class StrıngManıpulatıon2 {
    public static void main(String[] args) {

        //Soru-Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz.");
        System.out.println("lütfen  soyisminizi giriniz");
        String isim=scan.nextLine().toUpperCase();
        String soyIsim=scan.nextLine().toUpperCase();

        if (isim.length()>soyIsim.length()){
            System.out.println("isminiz soyisminizden daha uzun");
        } else if (isim.length()==soyIsim.length()){
            System.out.println("isminizin uzunlugu soyisminizin uzunluguna esıttır");
        } else {
            System.out.println("isminiz soyisminizden kısa");
        }

    }
}

