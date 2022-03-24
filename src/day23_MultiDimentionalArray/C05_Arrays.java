package day23_MultiDimentionalArray;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //verılen bır arraye yenı bır element ekleyen bır method olusturun.

        int arr[]={3,4,5};
       // arr[3]=8;
       // System.out.println(Arrays.toString(arr));// ekleme yapamayız.ıtıraz etmez ama run tıme error verır.

       // arr={4,7,8};//varolan bır array e aynı boyutta bıle olsa dırek yenı degerler atayamayız.

        arr=new int[4];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]

        int arrYeni[]=new int[5];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0]
        arrYeni[3]=5;
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 5, 0]

      //  bır array e içinde hazır elementlerın oldugu yenı bır array atamak ıstersenız bunu
        //{1,2,3} seklınde yazarak degıl
        //new ınt[3] dıyerek oluşturup bır arrayı assign ederek yapabılırız.
         int arrEnYeni[]={1,2,3,4,5};
         arr=arrEnYeni;
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]

    }
}
