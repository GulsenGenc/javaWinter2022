package day39_Overriding;

public class Araba {
    String hareket="Arabalar tekerlek ile hareket eder";
    String hız="Arabalar motor gücüne göre hız yaparlar";
    String yakıt="Arabalar farklı yakıtlar kullanmaktadır";
    String marka="Arabalar üretildikleri markaya sahiptir";

    public  void motor(){
        System.out.println("Arabalar farklı markalarda motor kullanırlar");
    }
    public void yakıtTuketımı(){
        System.out.println("arabalar motor gücü ve yakıt turune gore yakıt tuketırler");
    }
}
