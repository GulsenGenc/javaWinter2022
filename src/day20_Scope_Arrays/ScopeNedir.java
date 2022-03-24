package day20_Scope_Arrays;

public class ScopeNedir {
           static  int sayı=10;
           String ders="Java";


    public static void main(String[] args) {
          sayı=15;
        System.out.println(sayı);
       ScopeNedir str=new ScopeNedir();
        System.out.println(str.ders);
        str.ders="yenı deger";
        System.out.println(str.ders);
        ScopeNedir.staticMethod();
        System.out.println(str.ders);
        System.out.println(str.ders);



    }

    public  static void staticMethod(){
         sayı =20;
        System.out.println(sayı);
        ScopeNedir str =new ScopeNedir();
        str.ders="statıc metoddakı degerı";
        System.out.println(str.ders);


    }


    public void staticOlmayanMethod(){
     sayı=25;
        System.out.println(sayı);
       ders="gülşen";
        System.out.println(ders);
    }
























}
