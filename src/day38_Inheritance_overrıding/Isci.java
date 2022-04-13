package day38_Inheritance_overrıding;

public class Isci extends Personel {
    String statü="İşçi";
    String haklar="İşçiler kıdem tazminatı alırlar" ;
    String ikramıye="İşçiler yılda bır ıkramıye alır";



    public  void mesai(){
        System.out.println("Tum işçiler haftalık 40 saat çalışırlar");
    }

    public void maasHesapla(){
        System.out.println("Tüm personel 30 gun * 8 saat * 11 euro = "+(30*8*11)+"Euro maas alır");
    }

}
