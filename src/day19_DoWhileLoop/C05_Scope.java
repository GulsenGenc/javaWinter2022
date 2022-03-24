package day19_DoWhileLoop;

public class C05_Scope {

    // 1- Bir method icerisinde olusturulan variable'lar sadece olusturulduklari
    //    method'da kullanilabilirler, baska method'larda kullanilamazlar
    // 2- Tum method'larin kullanabilmesini istedigimiz variable'lari
    //    Class level'da olustururuz
    //    Class level'da olusturdugumuz variable'i
    //    -- static yaporsak tum methodlar kullanabilir
    //    -- static olmazsa(instance) o zaman sadece static olmayan method'lar kullanabilir
    // 3- Loop icinde olusturulan variable'lar loop icerisinde kullanilabilir
    //    ama loop'un disinda kullanilamaz

    static String kurs="Java";
    int level=10;
    static int sayi4;



    public static void main(String[] args) {
        int sayı=10;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            int loopSayı;
        }
       // System.out.println(i); i for loop içinde tanımlı oldugu için dışarıda yazdırmamam ıtıraz eder
       // loopSayı; loop içinde tanımlı sayıyı dışarıda yazmama itiraz eder.

        int sayi4; // class seviyesinde olusturup deger atamadigim sayi4'u artirmamama java itiraz etmiyor
        // sayi2++; // ama main method icinde olusturup deger atamadigim sayiyi artirmama java izin vermiyor

    }
    public  static void method1(){

    }

    public static void method2(){


    }
}
