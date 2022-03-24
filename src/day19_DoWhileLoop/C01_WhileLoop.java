package day19_DoWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin

        int input=20;
        // for loop ile de yapabılırız. ama whıle loop ile yapıcaz.
        int bölen=1;
        int sayac=0;
        while (bölen<=input){
            if (input%bölen==0){
                System.out.print(bölen +" ");
                sayac++;
            }
            bölen++;
        }
        System.out.println("");
        System.out.println(input+" sayısını bölen "+sayac+ "adet sayı vardır.");
    }
}
