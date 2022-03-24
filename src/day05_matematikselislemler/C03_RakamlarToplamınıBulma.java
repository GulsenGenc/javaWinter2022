package day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplamınıBulma {
    public static void main(String[] args) {
        //kullanıcıdan aldıgınız 4 basamaklı bır sayının basamaklar toplamını bulunuz.
Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir sayı gırınız");
        int sayı=scan.nextInt();

        int rakam =0;
        int rakamlarToplamı=0;

        //1. adımda r=0 rt=0 sayı=7532
        rakam=sayı%10; //r=2
        rakamlarToplamı+=rakam;// rt=2
        sayı=sayı/10; //753

        rakam=sayı%10;//3
        rakamlarToplamı+=rakam;//rt=2+3=5
        sayı/=10;//75

        rakam=sayı%10;//r=5
        rakamlarToplamı+=rakam;//rt=5+5=10
        sayı/=10;//7

        rakam =sayı%10;//r=7
        rakamlarToplamı+=rakam;//rt=10+7=17
        sayı/=10;//0

        System.out.println("girdiginiz sayının rakamlar toplamı : " +rakamlarToplamı);





    }
}
