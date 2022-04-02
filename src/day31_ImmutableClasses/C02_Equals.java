package day31_ImmutableClasses;

public class C02_Equals {
    public static void main(String[] args) {

        String a="";
        a+=2;
        a+='c';
        a+=false;
        if (a=="2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");//burayı yazar.

        String b="2cfalse";
        if (b=="2cfalse") System.out.println("==");//burayı yazar.çunku b basıt sekılde oluşturuldu.rferansları aynı
        if (b.equals("2cfalse")) System.out.println("equals");

    }

}
