package day04_dataCasting_increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayı=20;
        System.out.println(sayı+10);// 30
        // bu satirda sayiyi 10 artirmadim
        // sayinin 10 fazlasini yazdirdim
        System.out.println(sayı);
// eger atama yapmazsak sayida yaptigimiz artirma veya azaltma kalici olmaz

        sayı=sayı+10;
        System.out.println(sayı);//30

        System.out.println(sayı=sayı+10);//hem deger atayıp hem işlem yapabılıyoruz
        System.out.println(sayı);//40

        System.out.println(sayı+=10);// 50. bir varıable ın degerını kalıcı olarak arttırmak veya
        // azaltmsak ıstersenız assıgment sarttır

        System.out.println("30.satir : "+ sayı++); // 50
        System.out.println("31.satir : " + sayı); // 51


        System.out.println("34.satir : " + ++sayı); // 52
        System.out.println("35.satir : " + sayı); // 52
    }
}
