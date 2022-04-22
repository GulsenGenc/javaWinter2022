package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_maps {
    public static void main(String[] args) {
        /*
        javada collectıon uyesı bır yapıda
        data turu Object secılırse ,her data turunden deger ekleyebılırız
        ancak bu durumda sureklı castıng problemı ıle karşılaşırız
         */
        Map<Integer,String> sınıfList=new HashMap<>();//map bır ınterface dır.data turu olarak secılebılır
                                                     //hashmap daha hızlıdır

        //bir sınıfta ögrencı no ve isim,soyisim,brans olarak map oluşturmak ıstıyoruz
        //key tek bır unique degerdır . ama value bırden fazla bılgının bırlesımınden oluşabılır.
        //bu durumda daha sonra ıstedıgımız bılgılere dogru sekılde ulaşabılmek ıcın
        // tum elementler için value aynı bıcımde oluşturulmalıdır.
        //VERİ SIRALAMASI VE ŞEKILSEL AÇISINDAN.YANI MESELA VIRGUL SONRA BOŞUK VARSA HEPSINDE OLMALIDIR

        sınıfList.put(101,"Ali, Can, Dev");
        sınıfList.put(102,"Veli, Yan, QA");
        sınıfList.put(103,"Ali, Yan, C#");

        System.out.println(sınıfList);  //{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}

        System.out.println(sınıfList.keySet());//[101, 102, 103]

        System.out.println(sınıfList.values());//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]



    }
}
