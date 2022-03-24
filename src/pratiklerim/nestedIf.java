package pratiklerim;

import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        //Soru
        //11 Nested If kullanarak asagidaki soruyu cozen kodu yaziniz
        //Kullanicidan bir sifre girmesini isteyin
        //Eger ilk harf buyuk harf ise “A" olup olmadigini kontrol edin
        // Ilk harf A ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin
        //Eger ilk harf kucuk harf ise “z" olup olmadigini kontrol edin
        // Ilk harf z ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir şifre giriniz");
     char sifre=scan.next().charAt(0);

        if (sifre>='A' && sifre<='Z'){
            if (sifre=='A'){
                System.out.println("geçerli şifre");
            } else {
                System.out.println("geçersiz şifre");
            }
        } else if (sifre>='a' && sifre<='z'){
            if (sifre=='z'){
                System.out.println("geçerli şifre");
            }else {
                System.out.println("geçersiz şifre ");
            }

        } else {
            System.out.println("lütfen şifreyi kontrol ediniz.");
        }








    }
}
