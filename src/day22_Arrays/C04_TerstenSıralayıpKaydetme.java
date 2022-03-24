package day22_Arrays;

import java.util.Arrays;

public class C04_TerstenSıralayıpKaydetme {
    public static void main(String[] args) {
        //verılen bır arrayı buyukten küçüğe sıralayıp bıze dondurup kaydeden bır method yazalım
        int arr[]={3,4,5,76,89,6,78,65};

       arr=terstenSırala(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] terstenSırala(int[] arr) {

         int tersArr[]=new int[arr.length];
         Arrays.sort(arr);//küçükten buyuge sırsaladı

        for (int i = 0; i <arr.length ; i++) {
            tersArr[i]=arr[arr.length-1-i];

        }
       // System.out.println(Arrays.toString(tersArr));

      return tersArr;

    }
    }






