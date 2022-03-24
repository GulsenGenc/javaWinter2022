package pratiklerim;

import java.util.Scanner;

public class StringManıpulatıon3 {
    public static void main(String[] args) {

        //Kullanicidan isim isteyin Eger
        //isim “a" harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
        //isim “z" harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
        //ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String isim=scan.nextLine().toLowerCase();

    if (isim.contains("a") || isim.contains("z")){
        if (isim.contains("a")){
            System.out.println("girdiğiniz isim a harfi içeriyor");
        } else if (isim.contains("z")){
            System.out.println("girdiğiniz isim z harfi içeriyor");
        }
    } else {
        System.out.println("girdiğiniz isim a veya z içermiyor");
    }

    }
}
