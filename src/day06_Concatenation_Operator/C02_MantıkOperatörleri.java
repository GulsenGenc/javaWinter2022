package day06_Concatenation_Operator;

public class C02_MantıkOperatörleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);//false

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc1);//true

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;

        System.out.println(sonuc2);

        boolean sonuc3=5>4 & 7>9 & 6+3==9 & 5+2!=8;

        int sayı3=15;//sayı3 un 10 ıle 20 arasında olup olmadıgını true false olarak yazdırın
    }
}
