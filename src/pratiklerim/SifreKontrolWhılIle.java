package pratiklerim;

import java.util.Scanner;

public class SifreKontrolWhılIle {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String sifre="";
        int sonuc=0;
        do {
            System.out.println("Lutfen sifrenizi giriniz");
            sifre=scan.nextLine();

            sonuc= kucukHarfVarMi(sifre)+ buyukHarfVarMi(sifre)+ ozelKarVarMi(sifre)+uzunlukUygunMu(sifre);


        } while(sonuc != 4);

        System.out.println("Sifreniz basari ile kaydedildi");

    }

    public static int uzunlukUygunMu(String sifre) {

        int sonucUzunluk=0;
        if (sifre.length()<8) {
            System.out.println("sifre en az 8 karakter olmalidir");
        } else {
            sonucUzunluk=1;
        }

        return sonucUzunluk;
    }

    public static int ozelKarVarMi(String sifre) {
        int flagOzel=0;
        int index=0;

        while(index<sifre.length()) {
            if (sifre.charAt(index)>=' ' && sifre.charAt(index)<='/') {
                flagOzel=1;
            }
            index++;
        }

        if (flagOzel==0) {
            System.out.println("sifre ozel karakter icermelidir");
        }

        return flagOzel;
    }

    public static int buyukHarfVarMi(String sifre) {
        int flagBuyuk=0;
        int index=0;

        while(index<sifre.length()) {
            if (sifre.charAt(index)>='A' && sifre.charAt(index)<='Z') {
                flagBuyuk=1;
            }
            index++;
        }

        if (flagBuyuk==0) {
            System.out.println("sifre buyuk harf icermelidir");
        }

        return flagBuyuk;
    }

    public static int kucukHarfVarMi(String sifre) { // sifre= MehmetJava123
        int flagKucuk=0;
        int index=0;

        while(index<sifre.length()) {
            if (sifre.charAt(index)>='a' && sifre.charAt(index)<='z') {
                flagKucuk=1;
            }
            index++;
        }

        if (flagKucuk==0) {
            System.out.println("sifre kucuk harf icermelidir");
        }

        return flagKucuk;

    }




}



