package day41_Exseptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args){
        /*
        bir kod yazılırken olası exsaptıonlar öngörülüp exsaptıon oluştugunda javanın ne yapmasını
        ıstedığımız belırtılmelıdır

        1-eger exsaptıon oluştugunda kodun çalısmaya devam etmesını ıstemıyorsak
        method ısmının yanına oluşabılecek exsaptıonı declare edebılırız

        2-eger exsaptıon oluşsada calısmaya devam etmesını ıstıyorsak sorun oluşturabılecek kodu
        try catch blogunun ıcıne alır ve try bloguna sorun cıkabılecek kodu ve
        catch bloguna oluşabılecek exsaptıon ı ve olası exsaptıon durumunda javanın ne yapmasını ıstedıgımızı
        yazabılırız.
         */
        String dosyaYolu="src/day41_Exseptions/dosya";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
