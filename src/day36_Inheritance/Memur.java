package day36_Inheritance;

public class Memur extends Muhasebe {

    public static void main(String[] args) {



        Memur memur1=new Memur();
        //memur1 objesı memur classının objesı olmasına ragmen inherit ettiği muhasebe ve onunda parentı olan
        //personell classlarındakı tum dataları alabılır


        //personel classından
        memur1.personelNo=1001;
        memur1.isim="Ömer Faruk";
        memur1.soyisim="Genç";
        memur1.adres="Ankara";
        memur1.telefon="0542317383";

        //muhasebe clasından

        memur1.saatUcretı=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statü="Memur";

        System.out.println(memur1);

        Memur memur2=new Memur();
        memur2.personelNo=1002;
        memur2.saatUcretı=10;
        memur2.maas= memur2.maasHesapla();

        System.out.println(memur2);

    }

}
