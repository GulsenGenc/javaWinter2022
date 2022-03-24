package day12_stringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //		- Girilen kelime cumlede kullanilmamis.
        //		- Girilen kelime cumlede 1 kere kullanilmis.
        //		- Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle = "Java ogren,yeni program ile yeni bir sayfa ac";
        String kelime= "yeni";

        int ilkKullanım=cumle.indexOf(kelime);
        int sonKullanım=cumle.lastIndexOf(kelime);

        if (ilkKullanım==-1){
            System.out.println("girilen kelime cümlede kullanılmamıştır");
        } else if (ilkKullanım==sonKullanım){
            System.out.println("girilen kelime cümlede bir defa kullanılmıştır ");
        }else{
            System.out.println("girilen kelime cümlede birden faazla kullanılmıştır");
        }
       String str="eclipse";
        System.out.println(str.lastIndexOf("p",4));// 4 dahil

        System.out.println(str.lastIndexOf("e"));// son kullanıldıgı index i verıyor ..6
        System.out.println(str.indexOf("e"));// ilk kullanıldıgı indexi verıyor ..0





    }
}
