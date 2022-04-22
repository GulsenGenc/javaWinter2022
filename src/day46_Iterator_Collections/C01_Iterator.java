package day46_Iterator_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(4);
        liste.add(9);
        System.out.println(liste);

        Iterator itr= liste.iterator();//iterator methodunu olusturdugumuz liste objesı
        //uzerınden Arraylist classından çalıştırıyoruz

        /*
        iterator nasıl çalışır
        bir iterator objesi oluşturmak için collectıon uyesı bır obje kullanmalıyız
        yanı bız bu iterator objesını bızım ornegımızde lıste objesı uzerınde  çalışmak için oluşturmuş
olduk  biz ıterator objesını oluşturdugumuzda ,iterator collectıon ın ılk elementının oncesıne gıdıp bekler
[(itr) 5, 7, 8, 4, 9]         */

        System.out.println( itr.hasNext());//true döndü.
        // hasnext methodu ıterator a yanında eleman var mı dıye sorar bıze true false dondurur
        //next() methodu ise-->ıterator bır sonrakı elementın yanına gecer.üzerınden gectıgı elementı bıze dondurur

        System.out.println(itr.next());//5
        System.out.println(itr.next());//6
        System.out.println(itr.next());//7
        itr.remove();//5,6,7
        System.out.println(liste);//[5, 6, 8, 4, 9]

       // itr.remove(); iterator in elınde tuttugu elementı sıldı. dolayısıyla ust uste ıkı kere ıtr.remove yapamayız
        //önce itr.next() methodunu çalıştrıp ıteratorın bır element almasını sağlamalıyız



    }
}
