package day16_MethodCreatıon;



public class C03_Overloadıng {
    public static void main(String[] args) {
        //verılen ıkı sayıyı toplayıp yazdıran bır metod oluaturalım
        
        int sayı1=10;
        int sayı2=20;
        
        ikiSayiTopla(sayı1,sayı2);

        // iki double sayinin toplamini yazdiran bir method olusturalim

        double sayi3=15.2;
        double sayi4=10.3;
        ikiSayiTopla(sayi3,sayi4);

        // bir integer ile bir double toplamini yazdiran bir method olusturalim

        int sayi5=3;
        double sayi6=3.2;
        ikiSayiTopla(sayi5,sayi6);

        // eger variable olusturmadan direk sayilari yazarak method call yaparsam

        ikiSayiTopla(15,25); // int toplam verir
        ikiSayiTopla(10.1,12.3); // double toplam verir


        
        
    }

    public static void ikiSayiTopla(double sayi3, double sayi4) {
        System.out.println("iki double sayının toplamı :" +(sayi3+sayi4));
    }

    public static void ikiSayiTopla(int sayı1, int sayı2) {
        System.out.println("iki integer sayının toplamı :" +(sayı1+sayı2));
    }


}
