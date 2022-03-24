package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C05_ListiTekrarsızYap {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        sayilar=tekrarsızListYap(sayilar); //atama yaptıgımız için method creat ederken bıze
                                          // return type lı bir method oluşturacak.çünkü method
                                         //bıze kalıcı değişiklik getırsın ıstıyoruz.


        System.out.println(sayilar); //[1, 3, 5, 6, 7]

    }

   public static List<Integer> tekrarsızListYap(List<Integer> sayilar) {
        List<Integer> tekrarsızList=new ArrayList<>();

       for (int i = 0; i <sayilar.size() ; i++) {
           if (!tekrarsızList.contains(sayilar.get(i))){
               tekrarsızList.add(sayilar.get(i));
           }
       }


        return tekrarsızList;

    }
}
