package day10_switch_StringManipulation;

import java.util.Scanner;

public class C02_Switch_Mevsimler {
    public static void main(String[] args) {

        //kullanıcıdan kaçıncı ay oldugunu alıp ,hangı mevsım oldugunu yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kaçıncı ay oldugunu gırınız.");
        int ayNo=scan.nextInt();


        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;

            default:
                System.out.println("lütfen geçerli bir ay numarası gırınız");
        }
    }
}
