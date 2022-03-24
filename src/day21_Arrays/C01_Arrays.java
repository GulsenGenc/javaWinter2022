package day21_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        //array i nasıl declere ederız.?
        //data turu,arrayın ısmı ve köşeli parantez yazarak array  deklare edılır
        int arr1[]={1,3,5};
        int[] arr2={1,2,3};
        int [] arr3={1,4,6};  // 3 farklı araya oluşturma şekli bunlar .

        double arr4[]={10.2,23.45};

        //assign mecburi midir.
        int sayı[];// değilmiş.

        //kullanmadan önce mutlaka deger ataması yapmamız gerekır.
        //hem declere edıp,hem de atama yapacaksan nasıl yapabılırım.?
        //1- declera edıp esıtlıgın sagına süslü parantez içerisinde değerleri yazabılırım .
        String arr5[]={"ali","veli","selami"};
        //2-içine değer atamadan oluşturmak isterseniz,boyutunu belrlememiz gerekır.

       int arr7[]=new int[5]; //java içinde beş tane default deger olan bır array oluşturur.
                              //[0,0,0,0,0]
        arr7[0]=1;
        arr7[1]=3;
        System.out.println(Arrays.toString(arr7));
        System.out.println(arr7[3]);





    }
}
