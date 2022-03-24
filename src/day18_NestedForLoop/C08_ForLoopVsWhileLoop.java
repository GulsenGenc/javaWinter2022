package day18_NestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan toplamak istedıgı sayıları alın
        //ve kullanıcı sıfıra basıncaya kadar devam edın
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin



        Scanner scan=new Scanner(System.in);
        int sayı=0;
        int toplam =0;
        for (int i = 0; i <=100000 ; i++) {
            System.out.println("lütfen bir sayı giriniz");
            sayı=scan.nextInt();
            if (sayı==0){
                break;
            } else{
                toplam+=sayı;
            }
        }
        System.out.println(toplam);


        int sayı1=1;
        int toplam1=0;

        while(sayı1!=0){
            System.out.println("lütfen bir sayı gırınız");
            sayı1=scan.nextInt();
            toplam1+=sayı1;

        }
        System.out.println(toplam1);
        // baslangic,bitis ve degisim degerleri net olan durumlarda for loop daha avantajlidir
        // ama adim sayisi belli olmayan durumlarda while loop daha avantajlidir





    }
}
