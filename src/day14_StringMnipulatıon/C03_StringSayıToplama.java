package day14_StringMnipulatıon;

public class C03_StringSayıToplama {
    public static void main(String[] args) {
        //Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        //ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D","");//strıng olarak sayı
        str2=str2.replaceAll("\\D","");//strıng olarak sayı

        double str1Sayı=Double.parseDouble(str1);//double olarak sayı
        double str2Sayı=Double.parseDouble(str2);//double olarak sayı

        double sonuc=(str1Sayı+str2Sayı)/100;
        System.out.println("iki sayının toplamı : $"+sonuc);

    }
}
