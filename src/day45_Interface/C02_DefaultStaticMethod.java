package day45_Interface;

public class C02_DefaultStaticMethod implements I01_Default_Static{
   /*
   bır ınterfacede default veya statıc olarak tanımlanan ve bodysı olan
   methodların overrıde edılmesı mecburı degıldır
   statıc olarak tanımlanamışsa zaten overrıde edemeyız
    */

    @Override
    public void method1() {
        System.out.println("chıld class method1");
    }

    @Override
    public void method2() {
        I01_Default_Static.super.method2();
    }

    public static void main(String[] args) {
        /*
        ınterfacede statıc olarak tanımlanan methodlara statıc yontemlerle
        ulaşılabılır. InterfaceIsmı.methodIsmı
         */

        I01_Default_Static.method3();
        C02_DefaultStaticMethod obj=new C02_DefaultStaticMethod();

        obj.method1();//chıld classtan gelecek
        obj.method2();//parent ınterfaceden gelecek
       // obj.method3();//CTE verır..eskı classlarda statıc bır uyeye statıc olmayan yollarla da ulaşaılırdık
                      // ancak ınterface ıcerısınde statıc olarak tanımlanan methoda statıc olmayan yolllarla ulaşılamaz

    }
}
