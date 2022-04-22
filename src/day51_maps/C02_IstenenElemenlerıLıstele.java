package day51_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C02_IstenenElemenlerıLıstele {
    public static void main(String[] args) {
 /*
    Soru 2 ) Verilen map’te istenen programlama dilini bilen kisileri
    list olarak donduren bir method yaziniz.
    map {    101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
    Istenen dil  java
    Sonuc  [Ali, Veli]
     */
        Map<Integer, String> sınıfMap = MapOlustur.myMap();
        String istenenDil = "Java";
        List<String> istenenDiliBilenler = istenenDiliBılenListeOlustur(sınıfMap, istenenDil);
        System.out.println(istenenDiliBilenler);
    }

    public static List<String> istenenDiliBılenListeOlustur(Map<Integer, String> sınıfMap, String istenenDil) {
        List<String> idbl = new ArrayList<>();
        Collection<String> sınıfValueCollectıon = sınıfMap.values();
        List<String> sınıfValueList=new ArrayList<>(sınıfValueCollectıon);//map valuelerımız bır lıst halınde.

        int outerArrayBoyut=sınıfValueList.size();

        String ilkValue=sınıfValueList.get(0);
        String ilkValueArray[]=ilkValue.split(", ");


        int innerArrayBoyut=ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=sınıfValueList.get(i).split(", ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                valueMDArr[i][j]=temp[j];

            }
        }

        for (int i = 0; i <outerArrayBoyut ; i++) {
                if (valueMDArr[i][2].equals(istenenDil)){
                    idbl.add(valueMDArr[i][0]);
                }
        }


        return idbl;
    }
}
