package day25_lists;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("D");
        harfler.add("T");
        harfler.add("B");
        harfler.add("T");
        System.out.println(harfler); //[A, D, T, B, T]

        //contains methodu bıze true veya false döner .bu nedenle yazmamız veya bır varıable a
        //boolean data type ile atamamız gerek
    //   boolean sonuc =harfler.contains("B") ; GİBİİ VEYA

        System.out.println(harfler.contains("B")); //TRUE
        System.out.println(harfler.contains("C")); //FALSE

        List <String> karakterler= new ArrayList<>();
        karakterler.add("B");
        karakterler.add("A");

        //containsAll methodu bıze bır lıstenın ıcınde baska lıste varmı dıye kontrol eder
        // true false doner.
        System.out.println(harfler.containsAll(karakterler));//TRUE

        karakterler.add("C");
        System.out.println(karakterler); //[B, A, C]
        System.out.println(harfler.containsAll(karakterler)); // false



    }
}
