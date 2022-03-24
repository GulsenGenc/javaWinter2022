package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C07_HaftanınGünleriIfElseIf {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // eger kullanici gun ismini yanlis girerse "Yanlis giris" yazdirin
        // 	Ornek:  	gun=Pazar output = “Hafta sonu”
        //		gun=Sali output = “Hafta ici”
        //	*** String icin equals method’unu kullanin


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismini giriniz");
        String günIsmi=scan.next().toLowerCase();

        // hatali girisleri de yazdirmak icin
        // olasiliklari 3'e cikardim
        // hafta sonu - hafta ici - yanlis giris

        if (günIsmi.equals("pazar") || günIsmi.equals("cumartesi")){

            System.out.println("girdiginiz gun hafta sonu");

        } else if (günIsmi.equals("pazartesi") || günIsmi.equals("salı") || günIsmi.equals("çarşamba") ||
                günIsmi.equals("perşembe") || günIsmi.equals("cuma")){
            System.out.println("girdiğiniz gün haftaiçi");
        } else {
            System.out.println("lütfen geçerli bir gün ismi giriniz");
        }

    }
}
