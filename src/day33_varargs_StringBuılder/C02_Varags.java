package day33_varargs_StringBuılder;

public class C02_Varags {
    public static void main(String[] args) {

        //parametre olarak bır ınt ve ıstedıgımız kadar strıng alan en uzun kelımenınn
      //  harf sayısı ıle ınt parametre degerını çarpıp sonucunu yazdıran bır method olusturunuz

        int sayı=5;
        String str1="Zulal";
        String str2="zeynep";

        carpım(sayı,str1,str2);
        //bir methodda varargs dısında bır parametre kullanacaksak once dıger parametrelerı
        //yazıp varargsı en sona yazmalıyız
        //bu sebeple bır methoda bırden fazla varargs olamaz

    }

    private static void carpım(int sayı, String... str) {

        String enuzunStr="";
        for (String w:str
             ) {
           if (w.length()>enuzunStr.length()){
               enuzunStr=w;

           }
        }
        System.out.println("istenen deger :"+sayı*enuzunStr.length());
    }
}
