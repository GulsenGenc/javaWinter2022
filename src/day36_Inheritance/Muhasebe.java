package day36_Inheritance;

public class Muhasebe extends Personell{

    protected int saatUcretı;
    protected String statü;
    protected  int maas;

    @Override
    public String toString() {
        return "Muhasebe{" +
                "saatUcretı=" + saatUcretı +
                ", statü='" + statü + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                "} " ;
    }

    protected int maasHesapla(){
        int maas=saatUcretı*8*30;

        return maas;
    }

}
