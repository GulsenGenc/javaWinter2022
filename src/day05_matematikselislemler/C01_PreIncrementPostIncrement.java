package day05_matematikselislemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayı=10;
        //bu sayıyı bır arttırmak ıstersek
        sayı++;
        System.out.println(sayı);//11
        sayı++;

        System.out.println("Pre ıncrementten once :  " + sayı);//12

        // eger 11. ve 12. satirda yaptigim 2 islemi tek satirda yaparsam
        // java iki islemden once hangisini yapacagini bilmek ister
        //  once artirir sonra yazdirirsak java yeni degeri yazdirir
        // ama once yazdirir sonra artirirsak, bu durumda eski deger yazdirilir

        System.out.println("Pre ıncrement satırında : " + ++sayı);//13 önce arttır sonra yazdır demek oluyor ..
        System.out.println("Pre ıncrement ten sonra : " + sayı);//13


        System.out.println("Post ıncrement satırında : " +sayı++);//13 önce yazdır sonra arttır

        int sayı1 =sayı;  //alıştırma yaptım bıraz

        System.out.println(sayı1);//14
        System.out.println(sayı);//14
        System.out.println(sayı1+sayı);//28
        System.out.println(sayı1/sayı);//1
        sayı1++;//15
        System.out.println(sayı1++); // 15 önce yazdırıp sonra işlem yapacaktır
        System.out.println(sayı1);//16
        int sayı2=++sayı1;
        System.out.println(sayı1);//17
        System.out.println(sayı2);//17

     int sayı3=sayı2*3-sayı1;
        System.out.println(sayı3);//34
        sayı3+= sayı2;//34+17=51 yapacak
        System.out.println(sayı3);//34+17=51 yazdırdı


















    }
}
