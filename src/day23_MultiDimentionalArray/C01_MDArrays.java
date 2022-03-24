package day23_MultiDimentionalArray;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);//7
        System.out.println(arr[1][1]);//10

        //ilk inner arrayin tüm elementlerını yazdırın

        System.out.println(arr[0]); //aarr[0] bir array oldugundan dırek yazdırılamaz.
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr));//[[I@5b464ce8, [I@57829d67]

        //MD arrayde tum elementlerı bır array olarak yazdrımak ıstersek ,

        System.out.println(Arrays.deepToString(arr));
    }
}
