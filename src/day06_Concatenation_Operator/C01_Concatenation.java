package day06_Concatenation_Operator;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Güzel";
        int sayı1=5;
        int sayı2=3;
        //variable ların degerlerını degıstırmeden asagıdakı ıfadelerı bu varıable ları kullanaraak yazdırın

        //Java5Güzel

        System.out.println(str1+sayı1+str2);

        //2Güzel15
        System.out.println((sayı1-sayı2) +str2+sayı1*sayı2 );

        //Java22

        System.out.println(str1+(sayı1-sayı2) + (sayı1-sayı2) );// java soldan yazdırmaya baslar .bu nedenle;
        //str1ve 2 yı(sayı1-sayı2) önce toplar ve bunun sonucu artık strıng bır ıfade olur .daha sonra tekrar
        //2 ıle toplayınca concatenatıon yapar.

        //53Java

        System.out.println(sayı1+(sayı2+str1));//1.yontem.önce parantez içini yapınca o ıfade strıng olur
        // o nedenle sonra concatenatıon yapar.
        System.out.println(""+sayı1+sayı2+str1);//2.yontem. başına bi hiçlik atadık mı hepsını strıng gıbı yan yana yazdırır.


          /*
        Eger tamamen sayilardan olusan bir String varsa ve biz bunu int'a cevirmek istersek
        Integer.valueOf(str)


        bir sayiyi String'e cevirmek istersem
        ""+sayi
         */


        String tc="34";

        System.out.println(Integer.valueOf(tc));


    }
}
