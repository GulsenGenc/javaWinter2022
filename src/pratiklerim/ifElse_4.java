package pratiklerim;

import java.util.Scanner;

public class ifElse_4 {
    public static void main(String[] args) {

        //Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
        //gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
        //ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String günIsmi=scan.next();

        if (günIsmi.equals("cuma")){
            System.out.println("müslümanlar için kutsal gün");
        } else if (günIsmi.equals("cumartesi")){
            System.out.println("yahudiler için kutsal gün");
        }else if (günIsmi.equals("pazar")){
            System.out.println("hristiyanlar için kutsal gün");
        }else if (günIsmi.equals("pazartesi") || günIsmi.equals("salı") || günIsmi.equals("çarşamba")
                ||günIsmi.equals("perşembe")){
            System.out.println("sıradan bir haftaiçi");
        } else{
            System.out.println("lütfen gecerli bir isim giriniz");
        }







    }
}
