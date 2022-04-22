package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMap(){
        Map<Integer,String> sınıfList=new HashMap<>();
        sınıfList.put(101,"Ali, Can, Dev, 1453");
        sınıfList.put(102,"Veli, Yan, QA, 1990");
        sınıfList.put(103,"Ali, Yan, C#, 2000");
        sınıfList.put(104,"Ayşe, Kan, C#, 2001");
        sınıfList.put(105,"Fatma, Han, Java, 2002");

        return sınıfList;

    }
}
