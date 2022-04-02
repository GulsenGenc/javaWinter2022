package day33_varargs_StringBuılder;

public class C04_StringBuılder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Yasasın Java");

        System.out.println(sb1.indexOf("Java"));//8
        System.out.println(sb1.lastIndexOf("s"));//4

        System.out.println(sb1.replace(0,7,"Ne guzel"));//Ne guzel Java

        System.out.println(sb1);//Ne guzel Java ..muttible oldugu ıcın degıstırdı.

        System.out.println(sb1.toString().toUpperCase());//NE GUZEL JAVA
        System.out.println(sb1);//Ne guzel Java toStrıng methodu ıle sb1 ı strınge cevırdıgımız ıcın strıng gıbı
                                //ımmuttable davranır

        System.out.println(sb1.delete(1,3));//Nguzel Java 1 dahıl 3 harıc sıler

        System.out.println(sb1.deleteCharAt(5));//Nguze Java 5. ındekstekı harfı sıler


    }
}
