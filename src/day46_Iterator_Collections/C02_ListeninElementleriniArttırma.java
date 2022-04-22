package day46_Iterator_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementleriniArttırma {
    public static void main(String[] args) {
        /*
        verılen lıstedekı her elemntı 3 arttırma
         */
        List<Integer> liste=new ArrayList<>();
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(4);
        liste.add(9);
        System.out.println(liste);

        /*listenın tum elementlerını bıze getırmesı ıcın
        ıterator ın hasnext() ve next() methodlarını kullanacagız
         */
        ListIterator itr=liste.listIterator();

        while (itr.hasNext()){//yanında element oldugu mudddetce çalışacak

        Object sayı=itr.next();
        itr.set((Integer)sayı+3);

        }
        System.out.println(liste);

    }
}
