package day39_Overriding;

public class Corolla extends Toyota {

    String hız="Corolla araclar max 200 km hız yaparlar";
    String yakıt="Corolla benzilli ve elenktriklidir";
    String model="Corolla";
    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanır");
    }

    public  void yakıtTuketımı(){
        System.out.println("Corolla 5.6 litre yakıt tuketır");
    }
    public void vıtesSayısı(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        /*
        data turu ve constractor farklı oldugunda constroctor çalıştıgıiçin
        obje constroctorın oldugu class ozellıklerını tasır.
        ancak data turu parent class secıldıgı için varıablelar
        data turunun secıldıgı class ve onun parent classlarından deger alabılır

        Methodlar ıcın ıse yıne data turunun oldugu classa gıderız ancak dırek mthodu
        çalıştırmadan once method Overrıde edılmıs mı dıye kontrol ederız
         */
        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket);//araba classından alır
        System.out.println(arb1.yakıt);//corolla classından alır
        System.out.println(arb1.marka);//toyota classından alır
        System.out.println(arb1.hız);//corolla classından alır
        System.out.println(arb1.sırketMerkezi);//toyota classından alır
        System.out.println(arb1.model);//corolla classından alır
        arb1.motor();//corolla classından alır

        Toyota arb2=new Corolla();//varıable lardan bahsederken önce data turunden(Toyota) başlayarak arar
        System.out.println(arb2.hareket);//araba classından alır
        System.out.println(arb2.yakıt);//araba classından alır
        System.out.println(arb2.marka);//toyota classından alır
        System.out.println(arb2.hız);//toyota classından alır
        System.out.println(arb2.sırketMerkezi);//toyota classından alır
       // System.out.println(arb2.model);//CTE verır
        arb2.motor();//Corolla araclar cevreci motor kullanır
        arb2.garanti();//toyota classındakı çalışır.overrıde edılmemış
        arb2.yakıtTuketımı();//corolla classından çalışır
        //arb2.vıtesSayısı();//data turu olan toyotadan başlar aramaya bulamadıgından CTE verır

        Araba arb3=new Corolla();
        System.out.println(arb3.hareket);//araba classından alır
        System.out.println(arb3.yakıt);//araba classından alır
        System.out.println(arb3.marka);//araba classından alır
        System.out.println(arb3.hız);//araba classından alır
       //System.out.println(arb3.sırketMerkezi);//CTE verir
       //System.out.println(arb3.model);//CTE verır
        arb3.yakıtTuketımı();//corolla classından
        arb3.motor();//corolla.. en son overrıde eden classtakı çalışır
        //arb3.garanti(); Aramaya araba classından başladı ve methodu bulamadı CTE verır
        //arb3.vitesSayısı(); CTE verır




    }

}
