package pratiklerim;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        //Soru :Kullanicidan bir sayi girmesini isteyin
        // Girilen sayi 10 ise “Iki basamakli en kucuk sayi
        // 100 ise “uc basamakli en kucuk sayi”
        //1000 ise “dort basamakli en kucuk sayi”
        //diger durumlarda “Girdigin sayiyi degistir” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lüyfen bir sayı giriniz");
        int sayı=scan.nextInt();

        switch (sayı){
            case 10:
                System.out.println("iki basamaklı en küçük sayı");
                break;
            case 100:
                System.out.println("üç bsamaklı en küçük sayı");
                break;
            case 1000:
                System.out.println("dört basamaklı en küçük sayı");
                break;
            default:
                System.out.println("girdiğin sayıyı değiştir.");

        }









    }

}
