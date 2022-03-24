package day10_switch_StringManipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {

        //String de herhangı bır karakterı almak ıstedıgımızde o harfın indexini kullanarak
        //str.charAt(istenen index)yazabiliriz.
    String str="Java Cok Güzel";
    // J yazdırAlım
        System.out.println(str.charAt(0));

     // va yazdıralım
        System.out.println(""+str.charAt(2)+str.charAt(3));
     //cOK şeklınde yazdıralım
        System.out.println("" +str.toLowerCase().charAt(5)+str.toUpperCase().charAt(6)+
                str.toUpperCase().charAt(7));

        // son karakteri yazdir
        // String'de 14 harf var, son harfin indexi 14-1
        System.out.println(str.charAt(14-1)); // uzunluk -1

        // eger uzunlugu index olarak girersek
        // java calistiktan sonra hata verir






    }
}
