package day32_Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_dateTımeFormater {
    public static void main(String[] args) {
        LocalDateTime tarıhSaat=LocalDateTime.now();

        System.out.println(tarıhSaat);

        DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd/MM/YY");
        System.out.println(formater.format(tarıhSaat));//01/04/22

        DateTimeFormatter formaterSaat=DateTimeFormatter.ofPattern("HH : mm");

        System.out.println(formaterSaat.format(tarıhSaat));//08 : 18

        DateTimeFormatter formaterSaat2=DateTimeFormatter.ofPattern("hh : mm a");// küçük h yazarsak 12 saat dılımıne gore yazdıır.
                                                                                 //sonuna a yazarsak am yazıdır
        System.out.println(formaterSaat2.format(tarıhSaat));//08 : 21 ÖÖ




    }
}
