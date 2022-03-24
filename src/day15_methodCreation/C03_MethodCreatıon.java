package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreatıon {
    public static void main(String[] args) {
        //kullanıcıdan bır kelıme ısteyın.
        //eger kelıme 3 harften kısa ıse "kelıme çok kısa " yazdırın.
        //eger kelıme 3 4 vaya 5 harfli ıse harf sayısını ve kelımenın tersten yazılısını yazdırın
        //eger 5 harften uzun ıse "kelıme cok uzun " yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime = scan.next();
        int harfSayısı = kelime.length();

        if (harfSayısı < 3) {
            System.out.println("kelime çok kısa");
        } else if (harfSayısı == 3) {
            ucHarfiTersineCevir(kelime);
        } else if (harfSayısı == 4) {
            dortHarfiTersineCevir(kelime);
        } else if (harfSayısı == 5) {
            besHarfiTersineCevir(kelime);
        } else {
            System.out.println("kelime cok uzun ");
        }

    }

    private static void besHarfiTersineCevir(String kelime) {
        String tersKelime="";
        tersKelime = kelime.substring(4) +
                kelime.substring(3, 4) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("gırdıgınız kelımedekı harf sayısı : 5");
        System.out.println("kelimenin tersten yazılışı :" +tersKelime);
    }

    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime="";
        tersKelime = kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("gırdıgınız kelımedekı harf sayısı : 4");
        System.out.println("kelimenin tersten yazılışı :" +tersKelime);
    }

    private static void ucHarfiTersineCevir(String kelime) {
        String tersKelime="";
        tersKelime = kelime.substring(2) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("gırdıgınız kelımedekı harf sayısı : 3");
        System.out.println("kelimenin tersten yazılışı :" +tersKelime);

    }
    //1-method oluşturmak için methodun adını yazarız .
    //2-methoda gıderken goturmem gereken varıable varsa bunu methoda eklemelıyım

}