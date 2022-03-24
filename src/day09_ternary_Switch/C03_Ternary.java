package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayı=20;
        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary olusturun
        System.out.println(sayı>99 ? "sayı 3 basamaklı veya daha büyük" : "sayı negatif veya 3 basamakdan küçük");

        // Ternary bize sonuc dondurdugu icin
        //ya bu sonucu direk yazdirmaliyiz
        //ya da sonucun data turune uygun bir variable'a  atama yapabiliriz
     String sonuc =sayı>100 ? "sayı 3 basamaklı veya daha büyük" : "sayı negatif veya 3 basamakdan küçük";

        System.out.println("sonuç analizi :"+sonuc);

    }
}
