package day23_MultiDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {
       // Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle gırınız");
        String cümle=scan.nextLine();

        String arr[]=cümle.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println("giriğiniz cümlenın kelime sayısı :"+ arr.length);

    }
}
