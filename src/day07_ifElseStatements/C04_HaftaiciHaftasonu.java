package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaiciHaftasonu {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // 	Ornek:  	gun=Pazar output = “Hafta sonu”
        //		gun=Sali output = “Hafta ici”
        //	*** String icin equals method’unu kullanin

        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        // String case sensitive'dir
        // yani pazar, PAZAR,Pazar, PAzar bunlar hep farkli kelimelerdir
        // bu durumda String methodlarindan yardim aliriz
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismini yazınız :");

        String günIsmi=scan.next().toLowerCase();//kullanıcı nasıl yazarsa yazsın bız kucuk harfe cevırıyruzz

        // String ifadelerde == kullanilmasi tavsiye edilmez
        // cunku bekledigimizden farkli sonuc verebilir

        if (günIsmi.equals("pazar") || günIsmi.equals("cumartesi")){
            System.out.println("girdiğiniz gun haftasonu ");

        }

        if (günIsmi.equals("pazartesi") || günIsmi.equals("salı") || günIsmi.equals("çarşamba") || günIsmi.equals("perşembe")
        || günIsmi.equals("cuma") ){

            System.out.println("gırdıgınız gün haftaiçi..");
    }
    }
}
