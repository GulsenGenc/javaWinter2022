package day04_dataCasting_increment;

public class C03_Casting {
    public static void main(String[] args) {

        int sayı1=8;
        int sayı2=4;
        System.out.println(sayı1/sayı2);//2
        sayı1=22;
        System.out.println(sayı1/sayı2);//5
        // java iki integer sayiyi birbirine bolerse sonucu da integer olarak verir
        // eger virgulden sonra kusurat varsa siler


        sayı1=4895;
        double sayı3=10;
        System.out.println(sayı1/sayı3);// iki farkli sayi data turunu isleme koydugumuzda
        // Java kucuk olan data turu icin autoWidening yapar
        // bu islemi dusunursek sayi1/sayi3 => islemin sonucunu double kabul eder

    }
}
