package day26_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        //10 elementlı bır list oluşturalım
        int arr[]={2,3,4,5,6,7,8,9,1,10};

        List<Integer> sayılar= new ArrayList<>();
        for (int each: arr
             ) {
            sayılar.add(each);
        }
        System.out.println(sayılar);


        for (int each: arr
             ) {
            if (each%3!=0){
                System.out.println("3 e bölünemeyen sayılar :"+each);
            }

        }
    }
}
