package day19_DoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse
        // o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        // yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        int sayı=0;
        int toplam=0;
        int sayacPozitif=0;
        int sayacNegatif=0;

        do {
            System.out.println("lütfen pozitif bir tam sayı gırınız\n bitirmek için 0 a basınız");
            sayı=scan.nextInt();
            if (sayı<0){
                System.out.println("negatıf sayı gıremezsınız");
                sayacNegatif++;
            } else if (sayı>0){
                toplam+=sayı;
                sayacPozitif++;
            }


        } while (sayı!=0);
        System.out.println("yanlışlıkla girilen negatif sayı adedi :"+sayacNegatif);
        System.out.println("girilen pozıtıf sayı adedi :"+ sayacPozitif);
        System.out.println("girilen pozitif sayıların toplamı :" +toplam);













    }
}
