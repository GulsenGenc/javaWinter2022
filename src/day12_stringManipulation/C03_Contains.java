package day12_stringManipulation;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ , @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

       String mail="mulkiyeayboy@hotmail.com";
       String arananMetin="@gmail.com";

       if (!mail.contains(arananMetin)){
           System.out.println("lütfen gmail adresi giriniz");
       } else if (mail.lastIndexOf(arananMetin)==mail.length()-10){
           System.out.println("mail adresiniz kaydedildi.");
       } else{
           System.out.println("lütfen yazımı kontrol edınız");
       }
    }
}
