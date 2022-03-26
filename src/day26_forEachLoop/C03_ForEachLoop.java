package day26_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        //iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
        
        String array1[]={"Ali","Ayse","Can","Fatma"};
        String array2[]={"Can","Evren", "Emsal","Fatma","Emre"};

        List<String> ortakElemanlar=new ArrayList<>();

        for (String each: array1
             ) {
            for (String each2: array2
                 ) {
                if (each.equals(each2)){
                    ortakElemanlar.add(each);
                }
            }

        }
        if (ortakElemanlar.isEmpty()){
            System.out.println("ortak eleman yoktur");
        } else{
            System.out.println("iki array için ortak elemanlar şunlardır :"+ortakElemanlar);
        }


    }
}
