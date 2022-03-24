package pratiklerim;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {

    //Soru:Kullanicidan bir tamsayi alin ve sayi 10 ’dan kucukse “Rakam",
        // 100 ’den kucukse “iki basamakli sayi”degilse “uc basamakli veya daha buyuk sayi” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tam sayı gırınız.");
        int sayı=scan.nextInt();

        System.out.println(sayı<10 ? "rakam": (sayı<100 ?"iki basamaklı sayı" : "üç basamaklı veya daha buyuk sayı"));


        //Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” buyuk harfse
        //consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin

        System.out.println("lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        System.out.println(harf>='a' && harf<='z' ? "küçük harf" : (harf>='A'&& harf<'Z'? "büyük harf" :
                "girdiğiniz karakter harf değildir."));



    }
}
