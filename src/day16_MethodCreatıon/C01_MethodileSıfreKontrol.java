package day16_MethodCreatıon;

public class C01_MethodileSıfreKontrol {
    public static void main(String[] args) {

        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali

        String sifre="Abc123abn";
        boolean ilkHarf=ilkHarfKontrolEt(sifre);
        boolean  sonHarf=sonHarfKontrolEt(sifre);
        boolean bosluk=boslukKontrolEt(sifre);
        boolean uzunluk=uzunlukKontroEt(sifre);

        if (ilkHarf && sonHarf && bosluk && uzunluk) {
            System.out.println("sifrenız basarıyla tanımlandı");

        } else{
            System.out.println("“Islem basarisiz,Lutfen yeni bir sifre girin” ");
        }

    }

   public static boolean ilkHarfKontrolEt(String sifre) {
       boolean ilkHarfKontrolSonuc = false;

       if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
           ilkHarfKontrolSonuc = true;
       } else {
           System.out.println("sifrenin ilk  harfi buyuk olmalı");
       }
       return ilkHarfKontrolSonuc;

    }

    public static boolean sonHarfKontrolEt(String sifre) {
       boolean sonHarfKontrolSonuc = false;

       if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
           sonHarfKontrolSonuc = true;
       } else {
           System.out.println("sifrenin son harfi küçük olmalı");
       }
       return sonHarfKontrolSonuc;
    }

    public static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=false;
        if (!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        }else {
            System.out.println("sifre boşluk içermemeli");
        }
     return boslukKontrolSonuc;

    }

    public static boolean uzunlukKontroEt(String sifre) {
     boolean   uzunlukKontrolSonuc=false;
       if (sifre.length()>=8){
           uzunlukKontrolSonuc=true;
       } else{
           System.out.println("sifre en az 8 karakterli olmalı ");
       }
       return uzunlukKontrolSonuc;
    }
}



