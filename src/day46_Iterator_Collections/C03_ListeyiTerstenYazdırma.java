package day46_Iterator_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListeyiTerstenYazdırma {
    public static void main(String[] args) {
        //verılen bır lısteyı ,iterator ıle sondan basa dogru yazdıralım

        List<Integer> liste=new ArrayList<>();
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(4);
        liste.add(9);
        System.out.println(liste);

        //önce ıteratorı oluşturup,sona yollayalım

        ListIterator itr=liste.listIterator();

        while (itr.hasNext()){
            itr.next();
        }

        while (itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
    }
}
