package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarınYeriniDeğiştirme {
    public static void main(String[] args) {

        //verilen bir listede ,istenen iki indeksdeki elementlerin yerini
        //kalıcı olarak degıstıren bır method oluşturun

        List<Integer> sayılar = new ArrayList<>();
        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(6);
        sayılar.add(1);
        sayılar.add(7);

        int ilkIndeks=0;
        int ikinciIndeks=7;
        System.out.println(sayılar);

        sayılar=swapElements(sayılar,ilkIndeks,ikinciIndeks);
        System.out.println(sayılar);

    }

   public static List<Integer> swapElements(List<Integer> sayılar, int ilkIndeks, int ikinciIndeks) {
        //bir temp sayı oluşturun
       //verılen ındekslerdekı sayıları yer degıstırın
       //indeksleri kontrol edip sınırın otesınde indeks verıldıyse uyarı mesajı yazdrırın.


       int temp=0;
       if (ilkIndeks> sayılar.size()-1 || ikinciIndeks> sayılar.size()-1 || ilkIndeks<0 || ikinciIndeks<0){
           System.out.println("lütfen indeksi kontrol ediniz.");
       } else{
               temp=sayılar.get(ilkIndeks);
               sayılar.set(ilkIndeks,ikinciIndeks);
               sayılar.set(ikinciIndeks,temp);

       }
        return sayılar;
    }
}
