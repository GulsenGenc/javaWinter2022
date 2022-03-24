package pratiklerim;

import java.util.Scanner;

public class ifElse_2 {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //Ornek:
        //gun=Pazar output = “Hafta sonu”
        //gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen gün ismi giriniz");
         String günIsmi=scan.next().toLowerCase();

         if (günIsmi.equals("cumartesi") || günIsmi.equals("pazar")){
             System.out.println("haftasonu");
         } else if (günIsmi.equals("pazartesi") || günIsmi.equals("salı") || günIsmi.equals("çarşamba") ||
         günIsmi.equals("perşembe") || günIsmi.equals("cuma") ){
             System.out.println("haftaiçi");
         } else {
             System.out.println("lütfen ismi kontrol ediniz");
         }









    }
}
