package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdırma {

    public static void main(String[] args) {
        //sınıf listesini duzenlı yazdırmak

      Map<Integer,String> sınıf=  MapOlustur.myMap();
        System.out.println(sınıf);//{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}

        sınıfListYazdır(sınıf);


    }

    private static void sınıfListYazdır(Map<Integer, String> sınıf) {
        System.out.println("Numara isim Soyisim Brans");
        System.out.println("=========================");
        //map yapısından yazdırdıgımızda kullanıcılar bırsey anlamayabılır
        //bunun ıcın map yapısını kodlarla manıpüle edıp mapdekı dataları,
        // ıstedıgımız formata sokmamız gerekır
        //1.adımda key ve value ları mapden alıp
        //iki farklı collectıon uyesıne atadık

        Set<Integer> keySet=sınıf.keySet();
        Collection<String> valueSet=sınıf.values();

        System.out.println(keySet);
        System.out.println(valueSet);
        System.out.println(valueSet.size());//3 yazdırır.her bır value bır element

        for (String w:valueSet
             ) {
            System.out.println(w);
        }




    }
}
