package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        //bir listede ortalamanın ustunde olan elemanları blunuz.

        List<Double> sayılar = new ArrayList<>();
        sayılar.add(1.0);
        sayılar.add(3.0);
        sayılar.add(5.0);
        sayılar.add(3.0);
        sayılar.add(5.0);
        sayılar.add(6.0);
        sayılar.add(1.0);
        sayılar.add(7.0);

        //ortalamayı bul

        Double ortalama=0.0;
        Double toplam=0.0;

        for (int i = 0; i <sayılar.size() ; i++) {
            toplam+=sayılar.get(i);
        }

        ortalama=toplam/sayılar.size(); //3.875

        //ortalamanın ustunde olanları bır listte toplayalım

        List<Double> ortalamanınUstundekiler=new ArrayList<>();

        int sayac=0;
        for (int i = 0; i < sayılar.size() ; i++) {
            if (sayılar.get(i)>ortalama){
                ortalamanınUstundekiler.add(sayılar.get(i));
                sayac++;
            }
        }
        System.out.println("ortalamanın üstündeki sayılar "+ sayac+ "tane olup şunlardır :"+ ortalamanınUstundekiler);


    }
}
