package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List <Integer> sayılar=new ArrayList<>();
        sayılar.add(5);//[5]
        sayılar.add(3);//[3]
        sayılar.add(0,7);//[7,5,3]
        sayılar.add(2,7); //[ 7, 5, 7, 3]
        System.out.println(sayılar); //[7, 5, 7, 3]

        sayılar.remove(3);//3. indeksi siler
        sayılar.remove(5);//5. indeks olmadıgından exeption verir.

        //sayılardan oluşan bır listte objeyı vererek elemnt silme metodu çalışmaz .
        //sayı degerı gırdıgımızde java otomatık olarak sayıyı indeks olarak alır.
    }
}
