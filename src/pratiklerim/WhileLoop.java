package pratiklerim;

public class WhileLoop {
    public static void main(String[] args) {

        //Soru 1 ) While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.

        int sayı=1;

        while (sayı<=11){
            sayı+=2;
            System.out.print(sayı + " ");
        }
        System.out.println("");

        //veya söyle yaptım..

        int sayı1=3;




        while (sayı1<=13){
            if (sayı1%2!=0){
                System.out.print( sayı1+" ");
            }
            sayı1++;


        }
    }
}
