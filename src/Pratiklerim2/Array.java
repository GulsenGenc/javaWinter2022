package Pratiklerim2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        //Soru 6)Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
        //Array olarak yazdiran bir method yaziniz

        int arr[]={1,4,2,4,3,4,5,4,9};
        int istenenDeger=4;
        istenenDegeriCıkar(arr,istenenDeger);

    }
    public static void istenenDegeriCıkar(int[] arr, int istenenDeger) {
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == istenenDeger) {
                sayac++;
            }
        }
        int yeniArray[] = new int[arr.length - sayac];

        int k=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=istenenDeger){
                yeniArray[k]=arr[i];
                k++;
            }
        }


        System.out.println(Arrays.toString(yeniArray));

    }}
