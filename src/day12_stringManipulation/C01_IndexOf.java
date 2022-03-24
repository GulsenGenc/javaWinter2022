package day12_stringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //		- Girilen kelime cumlede kullanilmamis.
        //		- Girilen kelime cumlede 1 kere kullanilmis.
        //		- Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle="Java ogren,yeni program ile yeni bir sayfa ac.";
        String kelime ="Java";

     int ilkKullanım=cumle.indexOf(kelime);
     int ikinciKullanım=cumle.indexOf(kelime,ilkKullanım+1);

     if (ilkKullanım==-1){
         System.out.println("girilen kelime cümlede kullanılmamıştır.");
     }else if (ikinciKullanım==-1){
         System.out.println("girilen kelime cümlede 1 kere kullanılmış");
     } else {
         System.out.println("girilen kelime cümlede birden fazla kullanılmıştır.");
     }

    }
}
