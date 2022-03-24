package day19_DoWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi alip
        // while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        int input = 3;
        int sayı = 1;

        while (sayı < input) {
            System.out.print(sayı);

            sayı++;
        }
        System.out.println("");
        //aynı soruyu do whıle loop ile yapalım

        sayı=1;

        do {
            System.out.println(sayı);
            sayı++;
        } while (sayı < input) ;


    }


}



