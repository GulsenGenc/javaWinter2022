package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //ternary ile yapılan tum işlemler if else ile de yapılabılır
        //if else yerıne tercıh edılme sebebı yapının basıt ve anlasılabılır olmasıdır.
        //ternary ıcıne komplex kodlar gırmez
        //sadece sonuc veya bızı sonuca goturen basıt ıslemler olabılır.
        //kullanıcıdan bırtam sayı alıp tek mı cıft mı yazdıran bır kod yazalım.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen pozıtıf bır tam sayı grıınız");

        int sayı=scan.nextInt();


        if (sayı%2==0){
            System.out.println("sayı çift");
        } else{
            System.out.println("sayı tek");
        }

        System.out.println(sayı%2==0 ? "sayı çift" :"sayı tek");
    }
}
