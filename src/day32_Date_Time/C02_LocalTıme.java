package day32_Date_Time;

import java.time.LocalTime;

public class C02_LocalTıme {

    public static void main(String[] args) {
        LocalTime time=LocalTime.now();

        System.out.println(time);//07:49:48.535970500  saat dk sanıye ve salise seklınde zamanı verır.
                                 //obje oluşturulan andakı zamanı verır.

        int sayı=0;
        for (int i = 0; i <10000 ; i++) {
            sayı+=i;
        }

        LocalTime timeLooptanSonra=LocalTime.now();
        System.out.println(timeLooptanSonra);

        double nano1=time.getNano();
        double nano2=timeLooptanSonra.getNano();

        System.out.println("işlemimiz "+(nano2-nano1)+" nanosanıyede gerçekleştirir.");//işlemimiz 1000200.0 nanosanıyede gerçekleştirir.


        //ileriye veya gerıye gıdebılırız

        System.out.println(time.plusMinutes(1000));// 00:43:54.764766500 1000 dakıka sonrakı zamnı verır

       //istersek Zoone ıd kullanarak bulundugumuz bölgenın saatı ıcın de obje olusturabılırız






    }


}
