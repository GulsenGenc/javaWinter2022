package day22_Arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {


        int arr[]={3,4,5,5,76,89,6,78,65};
        int istenenSayı=7;
        // Eger Javadan hazir BinarySearch ile yapmak isterseniz
        // once sort methodunu kullanip, sonra binarySearch yapmaliyiz
        // binarySearch() bize istenen sayinin oldugu indexi verir

        Arrays.sort(arr);
        System.out.println(  Arrays.binarySearch(arr,istenenSayı));//istedıgımız elemtın indeksını verır.
        // eger olmayan bir elemnti aratirsak
        // Java bulamadigini gostermek icin - isareti koyar
        // sonrada o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir




    }
}
