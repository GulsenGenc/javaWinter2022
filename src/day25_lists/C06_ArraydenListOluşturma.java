package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOluşturma {
    public static void main(String[] args) {

        //verilen bir arrayı listeye cevırn

        String arr[]={"A","B","C"};

        List<String> arraydenList=Arrays.asList(arr);

        //arrayden liste cevırdıgımız zaman yenı listin uzunluğunu degıstıremeyız
        //dolayısıyla yenı lıst ıle add,remove,clear gıbı metotlar çalıştırmak
        // ıstedıgımızde java exeption oluşur.,

        // arraydenList.add("J"); // UnsupportedOperationException
        System.out.println("19.satirda list :" + arraydenList);
        // arrayde yapılan değişiklik otomotıkmen listı de degıstırır.degisir.
        // Listteki bir elemani degistirirseniz array de otomatik olarak degisir.


        arr[1]="F";

        System.out.println("23.satirda Array : " + Arrays.toString(arr));
        System.out.println("24.satirda list :" + arraydenList);

        arraydenList.set(0,"Y");

        System.out.println("28.satirda Array : " + Arrays.toString(arr));
        System.out.println("29.satirda list :" + arraydenList);



    }
}
