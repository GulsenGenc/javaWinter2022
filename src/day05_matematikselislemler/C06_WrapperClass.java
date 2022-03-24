package day05_matematikselislemler;

public class C06_WrapperClass {
    public static void main(String[] args) {
        String str1="12345";
        String str2="23456";
        //verılen ıkı metındekı sayıları toplayın
        System.out.println( str1+str2);//1234523456

        System.out.println(Integer.valueOf(str1)  +Integer.valueOf(str2));//35801                     //value deger demek

    //Integer.valueOf(str1) merhodu sadece sayısal deger ıceren Strınglerde kullanılabılır.
        //bır tane bıle sayı dısında karakter olursa Java hata verır

    }
}
