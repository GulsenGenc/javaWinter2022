package day28_Constractor;

public class StatıcKeyword {
    static int sayı1;
    int sayı2;

    public static void main(String[] args) {

        System.out.println("sayı1 : "+sayı1);
       // System.out.println("sayı2 : "+sayı2); statik olmadıgı için
        // main methoddan dırek kullanamayız
        StatıcKeyword obj1=new StatıcKeyword();
        System.out.println(obj1.sayı2); //0

        sayı1++;
        obj1.sayı2++;
        System.out.println("sayı1 :"+ sayı1);//1
        System.out.println(obj1.sayı2);//1

        System.out.println(obj1.sayı1);//java ıtıraz etmez. 1 yazar.

        StatıcKeyword obj2=new StatıcKeyword();

        System.out.println(obj2.sayı2);//0..statık olmayan varıable lar objeye bagımlıdır
        System.out.println(obj2.sayı1);//1.. statıc varıable lar objeye baglı degıllerdır .
                                       // en son hangı degerde ıse onu yazar

        obj2.sayı1++;
        obj2.sayı2++;
        obj1.sayı2++;

        System.out.println(sayı1);//2
        System.out.println(obj2.sayı2);//1
        System.out.println(obj1.sayı2);//2





    }
}
