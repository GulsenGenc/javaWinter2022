package day14_StringMnipulatıon;

public class C01_trim {
    //Istedigimiz
    //String’in basinda veya sonunda var olan bosluk //“ leri temizler
    public static void main(String[] args) {
        String str="  Siz ne derseniz deyin Java bildigini okur.  ";

        System.out.println(str.length());//46
        str=str.trim();
        System.out.println(str);
        System.out.println(str.length());//42


    }
}
