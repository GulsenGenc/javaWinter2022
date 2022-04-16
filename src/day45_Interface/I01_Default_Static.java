package day45_Interface;

public interface I01_Default_Static {
    /*
    ınterfacelerde sadece abstract methodlar bulunur
    bodysi olan concrete bır method oluşturmak ıstedıgımızde java CTE verır

    ancak Java 8 ve uzerı versıyonlarda ,istisnai olarak static veya default
    olarak tanımlanan methodların bodysı olabılır
    ancak burada kullanılan default keywordu access modıfıer değildir .
    çünkü ınterfacelerde tum methodlar publıc ve abstract tı

    asagıdakı ornekte gorulecegı gıbı default olarak tanımlanmış bır methoda
    access modıfıer olarak publıc yazabılırız.yazmasak da java publıc olarak kabul edecektr

     */

    void method1();

    public default void method2(){
        System.out.println("Inreface dekı default method ");
    }

    static void method3(){
        System.out.println("Interfacedeki static method ");
    }

}
