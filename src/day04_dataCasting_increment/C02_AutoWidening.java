package day04_dataCasting_increment;

public class C02_AutoWidening {
    public static void main(String[] args) {
      boolean dogruMu= true;
//String str=dogruMu; // sol String sag boolean olunca kabul etmiyor


        byte sayı1= 44;
        System.out.println(sayı1);//44

        short sayı2 = sayı1;       // esitligin solu short, sagi ise byte olmasina ragmen java itiraz etmiyor
                                   // deger olarak atanan data turu variable data turunden kucuk oldugu icin java sorun yapmaz
                                   // Auto Widening
        System.out.println(sayı2);//44

        double sayı3=sayı2;
        System.out.println(sayı3);//44.0



    }
}
