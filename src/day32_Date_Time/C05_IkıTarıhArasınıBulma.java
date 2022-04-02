package day32_Date_Time;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkıTarıhArasınıBulma {
    public static void main(String[] args) {
        LocalDate tarıh1=LocalDate.now();
        LocalDate tarıh2=LocalDate.of(1993,03,15);

        System.out.println(Period.between(tarıh2,tarıh1));// P29Y17D
        System.out.println(Period.between(tarıh2,tarıh1).getYears());//29

        //FIXME 04.01.2022 --> YORUM OLARAK TARIH YAZABILIRIZ. FIXME BU SEKILDE YAZIM SAGLIYOR :D


    }
}
