package pratiklerim;

public class WhileLoop2 {
    public static void main(String[] args) {

        //Soru 2 )For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
        //bolunebilen sayilari yazdirin.

        //önce for loop ile yapalım

      /*  String bölünenler15="";
        String bölünenler20="";
        String bölünenler90="";
        String bölünenlerHepsi="";

        for (int i = 100; i <1000 ; i++) {
            if (i % 15 == 0) {
                bölünenler15 += i + ",";
            }
            if (i % 20 == 0) {
                bölünenler20 += i + ",";
            }
            if (i % 90 == 0) {
                bölünenler90 += i + ",";
            }
            if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
                bölünenlerHepsi += i + ",";
            }
        }
        System.out.println("15 bölünen sayılar :"+bölünenler15);
        System.out.println("20 bölünen sayılar :"+bölünenler20);
        System.out.println("90 bölünen sayılar :"+bölünenler90);
        System.out.println("hepsine bölünen sayılar :"+bölünenlerHepsi);

       */

        //while loop ile yapsak;

        String bölünenler15="";
        String bölünenler20="";
        String bölünenler90="";
        String bölünenlerHepsi="";

        int sayı=100;

        while (sayı<1000){

            if (sayı % 15 == 0) {
                bölünenler15 += sayı + ",";

            }
            if (sayı % 20 == 0) {
                bölünenler20 += sayı + ",";
            }
            if (sayı % 90 == 0) {
                bölünenler90 += sayı + ",";
            }
            if (sayı % 15 == 0 && sayı % 20 == 0 && sayı % 90 == 0) {
                bölünenlerHepsi += sayı + ",";
            }

         sayı++;
        }
        System.out.println("15 bölünen sayılar :"+bölünenler15);
        System.out.println("20 bölünen sayılar :"+bölünenler20);
        System.out.println("90 bölünen sayılar :"+bölünenler90);
        System.out.println("hepsine bölünen sayılar :"+bölünenlerHepsi);




















    }
}
