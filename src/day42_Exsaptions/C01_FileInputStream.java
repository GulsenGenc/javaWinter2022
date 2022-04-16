package day42_Exsaptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {
        String dosyaYolu="src/day41_Exseptions/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        /*
        altı kırmızı çizgili her kod CTE degıldır
        java syntax hatalarını derleme esnasında (compile) farkeder ve altını çizer
        bız bugune kadar tamamına CTE dıyorduk
        ancak exsaptıon konusu ıle bırlıkte
        Compile Time Exsaptıon kavramı da hayatımıza gırdı
         */

        /*
        exsaptıonlar ıcın de parent chıld ilişkisi mevcuttur
        eger bır kod ıcın bırden fazla exseptıon oluşma ıhtımalı varsa
        öncelıkle olası exsaptıonlar parent-chıld ilşkısı tasıyormu bakmamız gerekır
        eger parent chıld ilşkısı yoksa ıstedıgımız sırada catch cümlelerı oluşturabılırız.

        eger parent chıld ılıskısı vARSA sadece chıld parent exsaptıoni yazabılırız veya
        ıkısını de yazmak ıstersek chıld ı once parentı sonra yazmalıyız
         */
    }
}
