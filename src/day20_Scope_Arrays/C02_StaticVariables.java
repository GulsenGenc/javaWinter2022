package day20_Scope_Arrays;

public class C02_StaticVariables {
    /*instance variable 'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
ogrenci notlari veya ogretmen branslari diyebiliriz
bir objeye ait bir variable'nin son degerini bulmak icin sadece o objeyi dikkate aliriz
static variable'ler ise class variable olarak tanimlanir
ve tum class uyeleri icin aynidir. okul ismi okul mudurunun dai gibi
eger static variable'nin degeri degistirilirse herkes icin degisir
 */

    static String okulIsmi="Yıldız Kolejı";
    static int okulNo;
    static boolean okulAcıkMı;

    public static void main(String[] args) {
        System.out.println(okulIsmi);//main method statıc ve varıable da statıc ıse ıtıraz etmez.,,
        System.out.println(okulNo);//0 YAZDIRACAK
        okulNo=102;
        System.out.println(okulNo);//102
        System.out.println(okulAcıkMı);//false
        okulAcıkMı=true;
        System.out.println(okulAcıkMı);//true

        staticMethod();
        System.out.println(okulNo);

    }

    public static void staticMethod(){

        okulNo=200;
        System.out.println(okulNo);//200. methodu yukarıda maın ıcınde cagırırsak çaılışacak
    }
}
