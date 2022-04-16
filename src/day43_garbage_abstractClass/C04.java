package day43_garbage_abstractClass;

public abstract class  C04 {
    /*
    bır abstract classta abstract veya concrete methodlar bulunabılır.
    chıld classların abstract methodları overrıde etmesı MECBURİ iken
    concrete methodları overrıde edılmesı OPSIYONELDIR

     */

    public abstract void absMethod();

    public void concreteMethod(){

    }

    public static void main(String[] args) {
        /*
        abstract classlar constractor a sahıptır ancak
        abstrack classlardan obje olusturulamaz

        abstrack classlar obje barındırmayan sadece chıld classlar için
        uyulması şart olan veya opsıyonel bırakılan özellıklerı tanımladıgımız bır depo class gıbıdır.

         */

      //  C04 obj=new C04();

        System.out.println("bu bır abstract class");
    }

}
