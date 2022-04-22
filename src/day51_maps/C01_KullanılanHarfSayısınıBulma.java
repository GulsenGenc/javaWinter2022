package day51_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanılanHarfSayısınıBulma {
    /*
    verılen bır Strıngtekı harflerı ve harflerın kacar kez kullanıldıgını return eden bır method create edınız

     */
    public static void main(String[] args) {
        String input="Hellooo";
        String harflerArr[]=input.split("");

        Map<String,Integer> kulanımSayıları=new HashMap<>();

        for (String w:harflerArr
             ) {
           if (kulanımSayıları.containsKey(w)){
               kulanımSayıları.put(w, kulanımSayıları.get(w)+1);
           } else {
               kulanımSayıları.put(w,1);
           }
        }
        System.out.println(kulanımSayıları);
    }
}
