package day33_varargs_StringBuılder;

public class C05_StrıngBuılder {
    public static void main(String[] args) {

        /*
        compare iki sb i eşit mi dıye kontrol etmek ıcın
        ilk harften baslayarak tum karakterleri karşılastırır.
        aynı olan karakterler için birşey yazdırmaz
        farklı olan ilk nkarakter için ascii tablosuna gore kaç deger gerıde veya ılerıde oldugunu yazdırır
        tmamen aynı ıse 0 yazdırır
        bir sb ıle bır strıngı compare etmek ıstersek java CTE VERIR
         */

        StringBuilder sb1 = new StringBuilder("Ali Can");
        StringBuilder sb2 = new StringBuilder("ali can");

        String str = "Ali Can";

        System.out.println(sb1.compareTo(sb2));//karsılastırma yapar.
     //Strıng buılder da equals methodu strıng dekı == gıbı çalışır
        System.out.println(sb1.equals(sb2));//false.



    }
}
