package Pratiklerim2;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
       /* Soru 4)
        Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
        birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana
        yazdiran bir program yaziniz { { 1,2,3}, { 4,5}, {6,7} }
            Ornek
         { { 1,2,3}, { 4,5}, {6,7}} ==> 1 +2+ +3= 6 4+ 5= 9 6+7= 13 output {6 9 13}

        */
        int arr[][]={{1,2,3},{4,5},{6,7}};

        int yeniArray[]=new int[arr.length];

        arrayOluşturMethodu(arr,yeniArray);

    }

   public static void arrayOluşturMethodu(int[][] arr, int[] yeniArray) {

       yeniArray[0]=arr[0][0]+arr[0][1]+arr[0][2];
       yeniArray[1]=arr[1][0]+arr[1][1];
       yeniArray[2]=arr[2][0]+arr[2][1];
       System.out.println(Arrays.toString(yeniArray));

   }
    }

