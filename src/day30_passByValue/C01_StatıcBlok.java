package day30_passByValue;

public class C01_StatıcBlok {

    static {

        System.out.println("statıc blok çalıştı");

    }

    static {
        System.out.println("static2 de çalıştı");
    }

    public C01_StatıcBlok() {
        System.out.println("constractor çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("***main method baslangıcı***");

        C01_StatıcBlok obj1;
        new C01_StatıcBlok();


    }
}
