package Pratiklerim2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        //1)Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
        //indexsiz add ( ) methodunu kullanarak, B’yi ekleyiniz.
        //index’li
        //add ( ) methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
        List <String> list =new java.util.ArrayList<>();

        list.add("A");
        list.add("C");
        list.add("E");
        list.add("F");
        list.add("B");
        System.out.println(list);//[A, C, E, F, B]

        list.add(1,"L");
        System.out.println(list);//[ A, L, C, E, F, B]

        //2-) set ( ) methodu kullanarak, E’yi D yapiniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.

        list.set(3,"D");
        System.out.println(list); //[A, L, C, D, F, B]

        //4)remove ( ) methodu kullanarak, F’yi siliniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.

        list.remove("F");
        System.out.println(list);//[A, L, C, D, B]
        //5- sort ( ) methodu kullanarak, elemanlari alfabetik siraya diziniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.

       //6) contains ( ) methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var
        //olmadigini dogrulayiniz.



        if (list.contains("L")){
            System.out.println("L harfi listede mevcut.");
        } else{
            System.out.println("L harfi listede mevcut değil.");
        }
        if (list.contains("M")){
            System.out.println("M harfi listede mevcuttur.");
        } else {
            System.out.println("M harfi listede mevcut değil.");
        }

        //7) size ( ) methodu kullanarak, list’in kaç eleman oldugunu ekrana yazdiriniz.

        System.out.println(list.size());// 5 elemanı var.
        //8)clear ( ) methodu kullanarak, list’deki tum elemanlari siliniz.

        list.clear();

        System.out.println(list.isEmpty());// size ile tum elemanları sildik.
                             // isEmpty methodu ile boş olup olmaıdını kontrol ettık.bıze true dondu .yani boş.















    }
}
