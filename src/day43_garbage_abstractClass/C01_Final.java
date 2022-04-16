package day43_garbage_abstractClass;

public class C01_Final  {
    final static double piSayısı=3.14;
    final static  String okulIsmi="Yıldız Kolejı";//fınal olarak işaretlendıgı ıcın degıstırılemez
    public static void main(String[] args) {
        final int sayı=10;
       // sayı=20; //fınal olunca java baska deger atanmasına ve değiştirilmesine izin vermez



    }
    public static  final void method1(){
        System.out.println("parent class fınal method1");
    }
}
