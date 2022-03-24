package Pratiklerim2;

public class Array3 {
    public static void main(String[] args) {

        //Soru 3)
        //Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
        //elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { { 1,2},{3,4,5}, {6} } ve arr2 = { { 7,8,9}, { 10,11}, {12}}

        int[][] arr1 ={ { 1,2},{3,4,5}, {6},{8,9} };
        int[][] arr2={ { 7,8,9}, { 10,11}, {12}};

        aynıIndekstekileriTopla(arr1,arr2);

    }

    public static void aynıIndekstekileriTopla(int[][] arr1, int[][] arr2) {

        int toplam=0;

        int i=0;

       while(i<arr1.length && i<arr2.length){


           for (int k = 0; k < arr1.length ; k++) {
               if (k<arr1[i].length && k<arr2[i].length){
                   toplam+=arr1[i][k]+arr2[i][k];
               }
           }

           i++;

       }
        System.out.println(toplam);

       }

        }

