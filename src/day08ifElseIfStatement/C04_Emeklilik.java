package day08ifElseIfStatement;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz" +
                "\nKdın için K \nerkek icin E harfini giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("lütfen yaşınızı giriniz.");
        double yas =scan.nextDouble();

        if (cinsiyet=='K'){

            if (yas<0 || yas>120){
                System.out.println("geçerli bir yaş giriniz");
            } else if (yas<60){
                System.out.println("emekli olamazsınız "+ (60-yas) +"yıl kadar çalışmanzı gerek");
            } else {
                System.out.println("emekli olabilirsin");
            }
        }else if (cinsiyet=='E'){
            if (yas<0 || yas>120){
                System.out.println("lütfen geçerli bir yaş giriniz");
            } else if (yas>65){
                System.out.println("emekli olabilirsin");
            } else {
                System.out.println("emekli olamazsın  "+ (65-yas) + "daha çalışman gerek.");
            }
        }
    }
}
