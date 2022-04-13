package day40_Overrıdıng_Pollymorphisym;

import java.util.Scanner;

public class C03_Exsaption {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı alıp bölerek sonucu yazdıran bır program yazınız

        Scanner scan=new Scanner(System.in);

        int kontrol=0;
        while (kontrol!=2){
            System.out.println("bölmek istediğiniz sayıyı gırınız");
            int sayı1=scan.nextInt();

            System.out.println("kaça bölmek ıstediğinizi yazınız");
            int sayı2=scan.nextInt();

            try {
                System.out.println("sonuç ="+(sayı1/sayı2));
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("girdiğiniz sayılarda sorun var ");
            }

            System.out.println("devam etmek için 1 \nbitirmek için 2 ye basınız");
            kontrol= scan.nextInt();

        }

        /*
        sayı2 0 oldugunda sayı1/0 tanımsız oldugundan java bu durumla karsılasınca
        exseption fırlatır .
        javanın yazıdıgı msjda exsaptıonın ne tur bır sorun oldugu ,neden kaynaklandıgı ve
        hangı satırdan oluştugu yazar.bunu çözmek ıçin sayı2 yı if ile kontrol edebılırız.
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day40_Overrıdıng_Pollymorphisym.C03_Exsaption.main(C03_Exsaption.java:17)


        if (sayı2==0){
            System.out.println("sayı/0 tanımsızdır");
        }else {
            System.out.println("sonuç ="+(sayı1/sayı2));
        }

        ama bu yontem her sornda çalışmaz


        */

    }
}
