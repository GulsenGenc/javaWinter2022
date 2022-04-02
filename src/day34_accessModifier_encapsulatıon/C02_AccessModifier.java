package day34_accessModifier_encapsulatıon;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01 obj=new C01();
        obj.acıkstrıng="hello";
        C01.acıksayı=50;

       // C01.sayı=15; private access modıfıer ı oldugundan baska classlardan ulaşılama

    }
}
