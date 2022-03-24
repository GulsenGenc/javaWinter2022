package day04_dataCasting_increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayı1=879;
        double sayı2=10;

        double sayı3=sayı1/sayı2;
        System.out.println(sayı3);

        int sayı4= (sayı1/ (int) sayı2); //87.9
        // deger double, variable int
        // yani variable daha dar dolayisiyla java bunu otomatik olarak yapmaz
        // sorumlulugu ustlenmemizi ister
        // sag tarafa yazdigimiz (int) sorumluluk bende demek

        System.out.println(sayı4);//87

        int sayi5=140;
        byte sayi6=(byte)sayi5;  // sag taraftaki deger int > sol taraftaki variable byte
                                 //oldugundan dolayı (byte) yazarak sorumlulugu ustlenıyorz.

        System.out.println(sayi6);






    }
}
