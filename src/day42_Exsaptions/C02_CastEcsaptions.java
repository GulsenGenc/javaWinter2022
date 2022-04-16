package day42_Exsaptions;

public class C02_CastEcsaptions {
    public static void main(String[] args) {


        int sayı = 10;
        //String str=str; CTE

        Object str3 = "Java cok guzel";
        String str4 = (String) str3;
        System.out.println(str4);//Java cok guzel. sorunsuz yazdırır cunku Strıng Objectın alt classı


        Object sayı2 = 20;
        String str2 = (String) sayı2;//Ecplicit Narrowing
        //ClassCastException


    }
}
