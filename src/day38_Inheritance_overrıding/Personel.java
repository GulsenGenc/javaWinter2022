package day38_Inheritance_overrıding;

public class Personel {
    String statü="Personel";
    String haklar="Tum personel eşit haklara sahiptir" ;
    String izin="tum personel yılda 4 hafta ızın kullanabılır";



    public  void mesai(){
        System.out.println("Tum personel 5 gun, 8 saat calısır");
    }

    public void maasHesapla(){
        System.out.println("Tüm personel 30 gun * 8 saat * 10 euro = "+(30*8*10)+"Euro maas alır");
    }
}
