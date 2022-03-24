package day23_MultiDimentionalArray;

public class C03_MDArrays {
    public static void main(String[] args) {
        //boyutları belırlı bır arrayı elementlerı gırmeden oluşturalım

        //bır okulda içinde 24 ögrenci olan 8 sınıf olusturalım..

        int arr[][]=new int[8][24];
        //bir ilçede 24 öğrencilik ,8 sınıf bulunan 5 okul vardır.

        int ilce[][][]=new int[5][8][24];

        //bir okulda 3 tane 24 kişilik 2 tane de 22 kişik sınıf vardır..
        int sınıf24[][]=new int[3][24];
        int sınıf22[][]=new int[2][22];

        // olustururken elementleri atama yaparsak farkli uzunlukta inner array'ler tanimlayabliriz
        int arr1[][]= {{3,1,7,5},{6,10}};
    }
}
