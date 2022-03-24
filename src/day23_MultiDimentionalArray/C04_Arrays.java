package day23_MultiDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        //kullancıya kaç elementlık bır array oluşturacagını sorun
        //arrayı oluşturup ,elemetlerı kullanıcıdan alıp array a atayın .
        Scanner scan=new Scanner(System.in);
        System.out.println();
        System.out.println("lütfen kaç elemntli bır array ıstedıgınızı yazınız");

        int uzunluk=scan.nextInt();

        int arr[]=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("array icin "+(i+1)+".elemanı giriniz");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}
