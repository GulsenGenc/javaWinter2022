package pratiklerim;

import java.util.Scanner;

public class ifElse_3 {
    public static void main(String[] args) {

       // Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin kenar uzunluklarını giriniz.");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();
        int kenar4=scan.nextInt();


        if (kenar1==kenar2 && kenar2==kenar3 && kenar3==kenar4){
            System.out.println("dikdörtgen bir karedir");
        } else {
            System.out.println("kare değildir");
        }
    }

}
