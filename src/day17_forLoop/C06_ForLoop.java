package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {
        // verilen iki harf ve aralarindaki harfleri yazdiran
        // bir kod yaziniz


        char ilkHarf='m';
        char sonHarf='t';

        for (char i =ilkHarf; i <=sonHarf; i++) {
            System.out.print(i+ " ");
        }
         double baslangıc=10;
        double bitis =20;
        double artıs=0.2;
        //baslangıc ve bıtıs sayıları arasında artıs mıktarı ıle olusacak tum sayıları yazdırın

        for (double i = baslangıc; i <= bitis; i+=artıs) {
            System.out.print(i+ " ");

        }
        }

    }


