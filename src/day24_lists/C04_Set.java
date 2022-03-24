package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List <String> isimler=new ArrayList<>();

        isimler.add("gülşen");
        isimler.add("ömer faruk");
        isimler.add("feyza");
        isimler.add("emin ehsan");
        System.out.println(isimler);//[gülşen, ömer faruk, feyza, emin ehsan]

        isimler.set(0,"figen");//strıng olarak çıkarılan elementi verir.
        System.out.println(isimler);//[figen, ömer faruk, feyza, emin ehsan]

        //daha önceden listede var olanları da arşiv gibi tutmak istıyorsak
        List <String> logListesi=new ArrayList<>();
      logListesi.add(isimler.set(2,"cosmos")) ;//2. indekstekini silip cosmos yaptı ve
                                            // sildiği elementi logListesine ekledi.
        System.out.println(isimler); //[figen, ömer faruk, cosmos, emin ehsan]
        System.out.println(logListesi); //[feyza]

    }
}
