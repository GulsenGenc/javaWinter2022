package day36_Inheritance;

public class UstaBası extends Iscı{
    public static void main(String[] args) {

        UstaBası ustabası1=new UstaBası();
        ustabası1.saatUcretı=15;
        ustabası1.isim="Mehmet";
        ustabası1.soyisim="Demir";
        ustabası1.maas=ustabası1.maasHesapla();
        System.out.println(ustabası1);


    }
    @Override
    public String toString() {
        return "SureklıIscıler{" +
                "iscıStatü='" + iscıStatü + '\'' +
                "\n, saatUcretı=" + saatUcretı +
                "\n, statü='" + statü + '\'' +
                "\n, maas=" + maas +
                "\n, personelNo=" + personelNo +
                "\n, isim='" + isim + '\'' +
                "\n, soyisim='" + soyisim + '\'' +
                "\n, adres='" + adres + '\'' +
                "\n, telefon='" + telefon + '\'' +
                "} " ;
    }
}
