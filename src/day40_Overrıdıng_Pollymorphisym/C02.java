package day40_Overrıdıng_Pollymorphisym;

public class C02 extends C01{


    private void method4(){
        System.out.println("child method4");
        //parent classtakı prıvate method4 e chıld classtan ulaşmamız
        //mumkun olmadıgından java bu ıkı methodu
        // TAMAMEN FARKLI METHOD OLRAK KABUL EDER
        //@Overrıde yazarsak java ıtıraz eder CTE verır.
    }
    @Override
    public void method2() {
        System.out.println("chıld method2");
    }
    @Override
    protected String method3(){
        //covariant için yazıldı
        return "Java";
    }
/*
 @Override notasyonu overrıden method ıle overrıden methodu bırbırıne baglar,
 farkında olmadan overrıden method sılınırse ve ya sıgnature değiştirilirse
 bu ilişki bozulacağı için java CTE verır

 notasyon kullanılmazsa java bunların ilişkisini bılır ama overrıden methdod sılınırse sesını cıkarmaz
 */
    public static void main(String[] args) {

        C02 obj=new C02();

        obj.method1();//parent method1
        obj.method2();//child method2

        C01 obj2=new C02();
        obj2.method1();//parent method1
        obj2.method2();//chıld method2

        C01 obj3=new C01();

        obj3.method1();//parent method1
        obj3.method2();//parent method1
    }
}
