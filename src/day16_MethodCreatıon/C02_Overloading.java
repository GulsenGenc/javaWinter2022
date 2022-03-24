package day16_MethodCreatıon;

public class C02_Overloading {
    public static void main(String[] args) {
        String str="Bu da gecer ya Huu";

        System.out.println(str.indexOf("d"));//3

        System.out.println(str.indexOf("a",5));//13


        //bir clasda aynı ısımde bırden fazla method olmasına overloadıng denır.
        //ya parametre sayısı farklı olmalı
        //veya parametre sayısı aynı ıse argumentlerın data turlerı farklı olmalı

    }
}
