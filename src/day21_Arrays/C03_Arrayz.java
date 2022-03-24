package day21_Arrays;

import java.util.Arrays;

public class C03_Arrayz {
    public static void main(String[] args) {

        int arr[];//deger ataması yapmadık,java kabul ettı ancak kullanmamıza ızın vermez
        //  System.out.println(arr);

        arr = new int[6];
        System.out.println(Arrays.toString(arr)); //[6, 0, 8, 0, 0, 0]

        System.out.println(arr.length);//6...Stringdeki lenght() burda yok .yanı parantezı yok

        //// arraydeki her bir elemani index degeri kadar artiralim
        for (int i = 0; i <arr.length; i++) {
            arr[i] =arr[i]+i;
            System.out.print(arr[i] + " ");//0 1 2 3 4 5
        }
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5]

        //arraydeki her bir elemani index degeri kadar artiralim
        for (int i = 0; i < arr.length; i++) {
            arr[i] += i;
            System.out.print(arr[i] + " ");


        }
    }}
