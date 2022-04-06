package day37_Inheritance;

import day36_Inheritance.Parent;

public class Child extends Parent {
    //bir classı chıld class yaptıgımızda parent classtakı cons. a ulaşması gerekır
    //bu durumda parent classdakı cons. ın access modıfıer ı uygun bır modıfıer olmalıdır


    Child(){
        super();
        System.out.println("chıld class parametresiz cons");
    }

    Child(int s){
        //Chıld class da tum constractorların ılk satırına
        //java nın yerleştırdıgı constractor parametresızdır yani superdır.

        System.out.println("Child class parametrelı constractor");
    }

    Child(int sayı1,int sayı2){
        //eger parent classda parametresız cons ı degıl de ıkı parametrelı cons ı
        //calıştırmak ıstersek bunu Chıld classdakı constractorun ilk satırına belırtmemız gerekır.

        super(1,2);
        System.out.println("Chıld class iki parametreli cons");
    }

    public static void main(String[] args) {
        Child child =new Child(5,8);
    }
}
