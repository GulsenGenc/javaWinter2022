package day23_MultiDimentionalArray;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        //verılen bır arraye yenı bır element ekleyen bır method olusturun.

        int arr[]={3,4,5,6,9,0};

        int eklenecekElement=7;
        arr = arrayeElemanEkle(arr,eklenecekElement);
        System.out.println(Arrays.toString(arr));



    }

   public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {
        int yeniArray []=new int[arr.length+1];//[0,0,0,0]

       for (int i = 0; i <arr.length ; i++) {
           yeniArray[i]=arr[i];
       }
       yeniArray[yeniArray.length-1]=eklenecekElement;


       return yeniArray;
    }


}
