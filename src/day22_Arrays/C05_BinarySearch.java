package day22_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        //verilen array de istenen bır elementın var olup olmadıgını true false yazdırarak gosteren bır method olustrun
        int arr[]={3,4,3,5,3,76,89,6,78,65};
        int istenenSayı=3;

        istenenElemanVarMı(arr,istenenSayı);

        //eger javadan hazır binary search yapmak ıstersenız ,once sort methodu kullanıp sonra binary search yaparız
       // Arrays.sort(arr);
       // Arrays.binarySearch(arr,istenenSayı);

    }

  public static void istenenElemanVarMı(int[] arr, int istenenSayı) {
        boolean sonuc=false;


      for (int i = 0; i <arr.length ; i++) {
          if (arr[i]==istenenSayı){
              sonuc=true;
              break;
          }
      }
      System.out.println(sonuc);

    }
}
