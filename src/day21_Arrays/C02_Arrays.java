package day21_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String arr1[]={"ali","veli","ayşe"};
        //arrAY içindeki elementlere ulaşabılmek için index kullanırız.

        System.out.println(arr1[0]);//ali
        arr1[1]="esila";
        System.out.println(arr1[1]);//esila

        // arrayin icindeki indexi kullanarak elementlere ulasabilir ve update edebiliriz
     int arr2[]=new int[4];
        System.out.println(arr2);// [I@58ceff1
        // array'ler non-primitive olduklarindan direk yazdirmak
        // istersek java referans bilgisini yazdirir

        System.out.println(arr2[1]);//0..default deger verır.
        System.out.println(arr2[3]);//0..default deger verır cunku henuz deger atamadık.
       // System.out.println(arr2[5]);// ArrayIndexOutOfBoundsException hatasını verır .

        for (int i = 0; i <=arr2.length-1 ; i++) {
            System.out.print(arr2[i] + " ");

        }
        System.out.println("");
        // array i yazdirmak icin Javadaki Arrays class'indan toString() kullanilir

        System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0] bu sekılde tek satırda ulaşmak mumkun.for yapmadan
        arr2[2]=12;
        arr2[0]=11;
        System.out.println(Arrays.toString(arr2));//[11, 0, 12, 0]


    }
}
