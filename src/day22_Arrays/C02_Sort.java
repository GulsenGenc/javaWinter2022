package day22_Arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        //verılen bır array de en küçük ve en buyuk değerleri yazdırın

        int arr[]={3,5,6,4,9,45,0,7,8,12,13};
        //sort metodu ile yapalım
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println( "en küçük sayı " +arr[0]);
        System.out.println("en buyuk sayı"+arr[arr.length-1]);





    }

}
