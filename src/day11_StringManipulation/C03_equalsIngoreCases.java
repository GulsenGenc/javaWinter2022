package day11_StringManipulation;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class C03_equalsIngoreCases {
    public static void main(String[] args) {

        // kullaniciya derse katili katilmak istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz ? \nEvet veya Hayir yaziniz");//n\ işareti alt satıra geçsin dıye
        String cevap=scan.next();
        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabınız : " + cevap + "derse katılımız onaylanmıştır .");
        } else if (cevap.equalsIgnoreCase("hayır")) {
            System.out.println("cevabınız : " + cevap + "sonraki derslerimize bekleriz");
        } else {
            System.out.println("lütfen evet veya hayır yazınız ");
        }

    }
}
