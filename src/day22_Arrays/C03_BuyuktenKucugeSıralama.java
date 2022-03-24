package day22_Arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSıralama {
    public static void main(String[] args) {

        //verılen bır arrayı buyukten kucuge sıralayıp yazan bır metod
        int arr[]={3,5,6,78,56,89,23};
        System.out.println(Arrays.toString(arr));


        System.out.println(Arrays.toString(terstenYazdırMethodu(arr)) );
        System.out.println(Arrays.toString(arr));
        arr=terstenYazdırMethodu(arr);
        System.out.println(Arrays.toString(arr));

    }

   public static int[] terstenYazdırMethodu(int[] arr) {
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
      int tersArr[]=new int[arr.length];

       for (int i = 0; i <arr.length; i++) {

           tersArr[i]=arr[arr.length-1-i];
           //System.out.println(Arrays.toString(tersArr));

       }
    // System.out.println(Arrays.toString(tersArr));

     return tersArr;
    }

}
