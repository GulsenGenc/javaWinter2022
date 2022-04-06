package day36_Inheritance;

public class SureklıIscıler extends Iscı {


    public static void main(String[] args) {

        SureklıIscıler surIc1=new SureklıIscıler();

        surIc1.personelNo=5001;
        surIc1.isim="Cem";
        surIc1.soyisim="Akay";
        surIc1.statü="İşçi";
        surIc1.saatUcretı=11;
        surIc1.maas=surIc1.maasHesapla();
        System.out.println(surIc1);



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
