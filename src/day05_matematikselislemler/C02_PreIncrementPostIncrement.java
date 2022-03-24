package day05_matematikselislemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayı1=10;
        int sayı2=20;
        int sayı3=30;

        sayı2=sayı1++;//iki işlem var.bırıncısı sayı2 ye deger atanacak ,ıkıncısı sayı1 1 arttırılacak
                      //sayı2 ye degerı sayı1 ı arttırmadan önce atadı yanı 10.
                       //sayı1 bır arttırdı sonrakı satırda yazdırdı.
        System.out.println(sayı1 + ", " + sayı2 + ", " + sayı3);//sayı1=11  sayı2=10 sayı3=30 yazdırıcak


        sayı3=++sayı1; //iki işlem var. bırıncısı sayı3 e deger atanacak .ıkıncısı sayı1 1 arttırılacak
                        //ama burda pre ıncrement oldugu ıcın önce sayı1 ı  1 arttırıcak sonra sayı3 edeger atıcak .
                         //yanı sayı1 12 olucak sonra sayı3 12ye esıt olacak .


        System.out.println(sayı1 + ", " + sayı2 + ", " + sayı3);

        System.out.println(sayı3++);//önce yazdıracak sonra arttıracak
                                    //önce 12 yazdıracak, sonra sayı3=13
        System.out.println(sayı3);

        System.out.println(--sayı2);//önce azalt sonra yazdır
                                     //önce sayı2=9 sonra sayı2 nın yenı degerı 9 yazdırır



    }
}
