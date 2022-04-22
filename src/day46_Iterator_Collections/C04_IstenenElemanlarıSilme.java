package day46_Iterator_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_IstenenElemanlarıSilme {
    public static void main(String[] args) {

        /*
        bir listedekı ıstenen sayı aralığında olmayan elemanları sılen bır program yazınız
        Örn; [2,13,56,23,45,14,40] istenen aralık 20 ile 40 arası(sınırlar dahıl)
        output [23,40]
         */
        List<Integer> liste=new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        System.out.println(liste);

        ListIterator itr= liste.listIterator();

        while (itr.hasNext()){
            Object sayı=itr.next();
            if ((Integer)sayı<20 || (Integer)sayı>40){
                itr.remove();
            }
        }
        System.out.println(liste);

    }
}
