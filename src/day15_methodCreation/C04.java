package day15_methodCreation;

public class C04 {

    //main method olmadan da bı class olusturulabılır ancak bu class dırek çalışmaz.
    //sadece depo gorevı gorur.
    // baska classlardan kullanılabılcek method ve varıable ları barındırır.

    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime="";
        tersKelime = kelime.substring(4) +
                kelime.substring(3, 4) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("gırdıgınız kelımedekı harf sayısı : 5");
        System.out.println("kelimenin tersten yazılışı :" +tersKelime);
    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime="";
        tersKelime = kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("gırdıgınız kelımedekı harf sayısı : 4");
        System.out.println("kelimenin tersten yazılışı :" +tersKelime);
    }

   public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime="";
        tersKelime = kelime.substring(2) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("gırdıgınız kelımedekı harf sayısı : 3");
        System.out.println("kelimenin tersten yazılışı :" +tersKelime);

    }
}
