package day47_LinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_ArraydenTekrarlarıSilme {
    public static void main(String[] args) {

        //verılen bır arrayden tekrar eden elementlerı sılıp
        //uniqe elemenler oluşan bır array halıne dönduren bır method oluşturun

        Integer arr[]={3,5,2,5,7,8,4,6,3,7};
        arr=benzersizYap(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static Integer[] benzersizYap(Integer[] arr) {
        Set<Integer> benzersizSet=new HashSet<>();
        for (Integer each:arr
             ) {
            benzersizSet.add(each);
        }
      //Set de ındeks yapısı yoktur .dolayısıyla for loop yapısı kullanamayız
        int ındeks=0;
        Integer arrBenzersiz []=new Integer[benzersizSet.size()];
        for (Integer each:benzersizSet
             ) {
            arrBenzersiz[ındeks]=each;
            ındeks++;
        }
        return arrBenzersiz;
    }
}
