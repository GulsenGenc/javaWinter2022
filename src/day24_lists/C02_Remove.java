package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List <String> isimler=new ArrayList<>();

        isimler.add("gülşen");
        isimler.add("ömer faruk");
        isimler.add("feyza");
        isimler.add("emin ehsan");
        System.out.println(isimler);//[gülşen, ömer faruk, feyza, emin ehsan]

       isimler.remove("feyza"); //objeyi yazarsak true döner ama ture yu
                                 // gormek için bunu bır varıable a atamamız veya
                                 //sout ıcınde yazdırmamız gerekır.
       // System.out.println(isimler.remove("feyza")); remove işlemını yapıp sonra yazarsak false verır
        //hem remove yapıp aynı anda yazdırmak veya bır varıable a atamak gerek .

        System.out.println(isimler);//[gülşen, ömer faruk, emin ehsan]
        boolean sonuc=isimler.remove("gülşen");//sonuc true olur.sonucu yazdırırsak bunu goruruz.

        if (sonuc==true ){
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediğiniz isim olmadıgından silinemedi");
        }
        System.out.println(isimler);//[ömer faruk, emin ehsan]

        //remove ındeks yazdıgımızda sildim silmedim ihtimali kalmaz
        //eğer olmayan bır ındex yazarsak java exeption verır.
        //remove indeks bıze remove edılen elementı döner


        isimler.remove(1);// String olarak sildiği ismi döndürüryor.
        System.out.println(isimler);
        System.out.println(isimler.remove(0));//ömer faruk

        //yazdırsak da yazdırmasak da liste değişir.istenen indekstekı elemet sılınır.

    }
}
