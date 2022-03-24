package day11_StringManipulation;

import java.util.Locale;

public class C01_toLowercase_toUpperCase {
    public static void main(String[] args) {

        String str ="Java Güzeldir";


        //biz String methodlarını arka arkaya kullanabılırız.
        //mesela ıkıncı kelımenın ilk harfini küçük olarak yazdıralım.

        //str.charAt(5); böyle yazdıgımızda sonuç artık Strıng olmaktan cıkar char olur.
        //dolayısıyla Strıng de yapmak ıstedıgımız tum degisiklikleri
        //once yapip sonra charAt() method'unu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));//JAVA GÜZELDİR
        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));//JAVA GÜZELDIR
    }
}
