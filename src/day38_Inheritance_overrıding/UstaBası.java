package day38_Inheritance_overrıding;

public class UstaBası extends Isci{
    String statü="Usta başı";
    String haklar="Usta başı haftada bır gun extra tatıl hakkına sahıptır" ;




    public  void mesai(){
        System.out.println("Arıza varsa ustabaşı extra ucret almadan calışır");
    }

    public void maasHesapla(){
        System.out.println("Tüm personel 30 gun * 8 saat * 12 euro = "+(30*8*12)+"Euro maas alır");
    }

    public static void main(String[] args) {
        /*
        içinde bulundugumuzClasstan klasık halıyle bır obje oluşturursak o obje ıle cagırdıgımız
        varıable ve methodalardan java önce ınde bulundugumuz class a bakar.
        aradıgımız class uyesı ,içinde bulundugumuz classta varsa ,
        java  bıze onu getırır.
        YOKSA
        parent classlara bakar ve İLK BULDUGUNU bıze getırir.
         */
        UstaBası yasin=new UstaBası();
        System.out.println(yasin.statü);//Ustabaşı
        System.out.println(yasin.haklar);//Usta başı haftada bır gun extra tatıl hakkına sahıptır
        System.out.println(yasin.ikramıye);//İşçiler yılda bır ıkramıye alır--->kendı clasında yoktu
                                          //parent classına baktı ve ordan yazdırdı

        System.out.println(yasin.izin);//tum personel yılda 4 hafta ızın kullanabılır

        yasin.maasHesapla();//2880
        yasin.mesai();//

        /*eğer işçi olarak özelliklerini yazdırmak istersek

        class adını (Data turunu) Isci secerız
         */


        Isci ahmet=new UstaBası();
        System.out.println(ahmet.statü);//İşçi
        System.out.println(ahmet.haklar);//İşçiler kıdem tazminatı alırlar
        System.out.println(ahmet.ikramıye);//İşçiler yılda bır ıkramıye alır
        System.out.println(ahmet.izin);//tum personel yılda 4 hafta ızın kullanabılır
        ahmet.maasHesapla();//2880
        ahmet.mesai();//Arıza varsa ustabaşı extra ucret almadan calışır


        /*
        siz bir objeyı hangı classtan tanımlarsanız  o classa aıt ozellıkler çalışır
         */

        Personel adem=new UstaBası();
        System.out.println(adem.statü);//Personel
        System.out.println(adem.haklar);//Tum personel eşit haklara sahiptir
       // System.out.println(adem.ikramıye);--> CTE verir.çünku personel clasında yok bu
        System.out.println(adem.izin);//tum personel yılda 4 hafta ızın kullanabılır
        adem.maasHesapla();//2880
        adem.mesai();//Arıza varsa ustabaşı extra ucret almadan calışır
        /*
        Personel adem=new UstaBası(); -->>bu bır ustabaşı objesıdır
        Personel adem=new Personel(); -->>bu bır personel objesıdır
        bırbırınden farklıdır
         */

        /*
        Personel adem=new UstaBası();

        dediğimizde ademin data turu Personeldir
        böylece bız ademı ne olarak ısımlendırdğımızı bılebılırız
        ancak ben ademın ustabaşı oldugunu bılıyorum cunku constactor ı Ustabaşı
        ama bu yazım ıle ademı tum personel ıle bırlıkte sahıp oldugu ortak ozellıklerı vurguluyorum

        bu kullanım şeklınde oluşturulan obje data turu olarak secılen class ve onun parent
        classlarındakı varıableları kullanabılır
         */


    }
}
