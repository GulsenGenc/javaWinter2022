package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_maps {
    public static void main(String[] args) {
        //sınıftakı ögrencı lıstesını duzenlı olarak yazdıralım

        Map<Integer, String> sınıfListMap = MapOlustur.myMap();
        System.out.println(sınıfListMap);//{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}
              //eger key'lere tek tek ulaşmak istersek .
             // indeks yapısına ıhtıyacımız var.ancak map ındeks yapısını desteklemez.
            // bunun ıcın keylerı once bır set e sonra setı ındeksı destekleyen list yapısına dönuşturduk
        Set<Integer> sınıfKeySet = sınıfListMap.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sınıfKeySet);
        System.out.println(keyList);//[101, 102, 103, 104, 105]-->atık key'ler ındeks yapısı ıle elımızde.

        //şimdi valuelerı ındeksle ulaşabılecegımız şekle sokalım

        Collection<String> sınıfValueCollectıon=sınıfListMap.values();
        System.out.println(sınıfValueCollectıon);//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
        System.out.println(sınıfValueCollectıon.size());//4

        List<String> sınıfValueList=new ArrayList<>();
        sınıfValueList.addAll(sınıfValueCollectıon);
        System.out.println(sınıfValueList);//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]

        /*
        her bır value bırden fazla bılgıyı ıcerıyor
        onun ıcın valuelerı multıdımensınal arraya atmak mantıklı duruyor
        ancak MDA oluşturmak için boyutları bılmek gerekıyor
         */

        int outerArrayBoyut=sınıfValueList.size();
        System.out.println(outerArrayBoyut);//3

        //inner arraylerın boyutunu bulmak bıraz daha komplex

        String ilkValue=sınıfValueList.get(0);
        String ilkValueArray[]=ilkValue.split(", ");


        int innerArrayBoyut=ilkValueArray.length;
        System.out.println(innerArrayBoyut);

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=sınıfValueList.get(i).split(", ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
               valueMDArr[i][j]=temp[j];

            }
        }


        System.out.println(Arrays.deepToString(valueMDArr));//[[Ali, Can, Dev], [Veli, Yan, QA], [Ali, Yan, C#]]
        /*
        bu satıra kadar -->
        1-> keylerı ındeks ıle ulaşabılecegım keyLıste atadım
        2->valuelerı valueMDArr e atadım
        3->simdi bu key ve valuelerı ıstedıgım gıbı manıpule edebılırım
         */

        System.out.println("Numara isim Soyisim Brans");
        System.out.println("=========================");
        for (int i = 0; i <keyList.size() ; i++) {
            System.out.print(keyList.get(i)+"  ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
