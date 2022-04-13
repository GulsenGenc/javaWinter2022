package day39_Overriding;

public class Overıdıng_Child extends Overrıdıng_Parent{
    public  void method1(){
        System.out.println("Chıld class method1");
    }

    public static void main(String[] args) {
        /*
        bir obje oluşturulurken data turu ve constroctor aynı classtan
        secılmiş ise java dırek o classa gıder hem varıable  hemde methodiçin
        o classta varsa kullanır .yoksa o classın parentlarına bakar.
         */



        Overıdıng_Child obj1=new Overıdıng_Child();

       obj1.method1();//Chıld class method1
        obj1.method2();//parent class method2

        Overrıdıng_Parent obj2=new Overıdıng_Child();

        obj2.method1();//Chıld class method1
        obj1.method2();//Parent class method2

        Overrıdıng_Parent obj3=new Overrıdıng_Parent();
        /*
        eğer data turu parent constroctor chıld classtan secıldı ıse
        varıable larda yukarıdakı sekılde çalışma devam eder
        ancak
        methodlar için data turunun oldugu classtakı method chıld class tarafından
        overrıde edılmıs mı dıye kontrol etmemız gerekır .
        eger chıld classlarda bu method overrıde edılmemısse overrıde eden method çalışır

         */

        obj3.method1();//Parent class method1
        obj3.method2();//Parent class method2


    }
}
