package day14_StringMnipulatıon;

public class C04_isimgizleme {
    public static void main(String[] args) {

        //Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //        isim-soyisim : M***** B*******
        //        kart no : **** **** **** 1234

        String isim="gülşen";
        String soyisim ="tuncer";
        String kKNo="1234567890123456";

        String gizlenmisİsim=isim.substring(0,1).toUpperCase()+
                             isim.substring(1).replaceAll("\\S","*");

        String gizlenmisSoyisim=soyisim.substring(0,1).toUpperCase()+
                               soyisim.substring(1).replaceAll("\\S","*");
        System.out.println("isim soyisim :" +gizlenmisİsim+ " " + gizlenmisSoyisim);

        String gizlenmisKKNo="**** **** ****"+ kKNo.substring(12);
        System.out.println("kkno :"+ gizlenmisKKNo);








    }
}
