package day18_NestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayıBulmaca {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Scanner scan =new Scanner(System.in);
        int tahmin=0;
        int sayac=1;
        System.out.println(sayi);

        while (sayi!=tahmin){
            System.out.println("lütfen bir tahmin giriniz.");
            tahmin=scan.nextInt();
            if (tahmin>sayi){
                System.out.println("dah küçük bir sayı söylemelisin");
                sayac++;
            } else if (tahmin<sayi){
                System.out.println("daha büyük bir sayı söylemelisin");
                sayac++;
            }

        }
        System.out.println("tuttugun sayıyı " +sayac+ "tahminde buldunuz");

    }
}
