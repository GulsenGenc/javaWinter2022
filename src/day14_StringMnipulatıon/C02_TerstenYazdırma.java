package day14_StringMnipulatıon;

import java.util.Locale;

public class C02_TerstenYazdırma {
    public static void main(String[] args) {

        //soru 5: kullanıcıdan 4 harfli bir kelime isteyın ve gırılen kelimeyı il harfi büyük
        // diğerlei kücük olarak tersten yazdırın

        String input ="Mavi";
        String tersStr=input.substring(3).toUpperCase()+
                       input.substring(2,3).toLowerCase()+
                       input.substring(1,2).toLowerCase()+
                       input.substring(0,1).toLowerCase();

        System.out.println(tersStr);
    }
}
