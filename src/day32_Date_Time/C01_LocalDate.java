package day32_Date_Time;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();//objenin oluşturuldugu tarıhı tarih varıable ına atar.
        LocalDate baskaTraıh=LocalDate.of(1993,03,15);
        //istediğimiz yıl,ay, gun değerlerıne gore bıze obje oluşturur.

        System.out.println(tarih);//2022-04-01
        System.out.println(baskaTraıh);//1993-03-15

        System.out.println(tarih.getDayOfMonth());//1      ayın kacıncı gunu oldugunu yazdırır
        System.out.println(tarih.getDayOfWeek());// FRIDAY haftanın hangı gunu oldugunu yazdırır
        System.out.println(tarih.getDayOfYear());// 91     yılın kacıncı gunu oldugunu yazdırır.

        System.out.println(tarih.getMonthValue());//4      kacıncı ay oldugunu yazdırır.

        System.out.println(tarih.getYear());//2022         yılını verır.

        //get methodu.bıze tarıh objesı ıle ılgılı ayrıntılı bılgıyı verır.

        System.out.println(tarih.minusWeeks(20));// 2021-11-12  20 hafta önce hNGI TARIH oldugunu yazdırır.
        System.out.println(tarih.minusDays(10));// 2022-03-22   10 gun önce hangı tarıh oldugunu yazdırır.

        System.out.println(tarih.plusMonths(1));// 2022-05-01     bir ay sonra hangı tarıh oldugunu yazdırır.
        System.out.println(tarih.plusDays(10));// 2022-04-11      10 gun sonra hangi tarıh oldugunu yazdırır.

        System.out.println(LocalDate.now().isLeapYear());// FALSE  bu yılın leap year olup olmaıdıgını boolean doner. subatın 29 cekmesı ..

        System.out.println(LocalDate.now(ZoneId.of("Japan")));//2022-04-01 japonya da şuankı tarıh ne
        System.out.println(tarih.isAfter(baskaTraıh));// tarıh baska tarıhten sonra öı gelır dıye boolean döndurur

    }
}
