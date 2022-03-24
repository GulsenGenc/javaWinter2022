package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="bugun ne cok sey ögrendik";
        //bu cümlede boşluk dısındakı karakter sayısını bulunuz

        System.out.println(str.replace(" ", "").length());

        //atama yapılmadıgı surece orjınal strıng kalıcı olarak degısmez .sadece o satır ıcın degısıklık
        //yapılıp sonuc yazdırılmıs olur.
        System.out.println(str);


        str=str.replace("bugun","yarın");
        str=str.replace("ögrendik","ogrenecegiz");

        System.out.println(str);
        str=str.replace("cok","az");
        System.out.println(str);

        str=str.replace(" ","");
        System.out.println(str);






    }
}
