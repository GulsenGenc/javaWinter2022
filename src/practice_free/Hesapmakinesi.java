package practice_free;

import java.util.Scanner;

public class Hesapmakinesi {
    public static void main(String[] args) {
        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yapmak istediğiniz işlemi + - / x seçiniz");
        char islem =scan.next().charAt(0);
        System.out.println("işlem için birinci sayıyı gırınız");
        double sayı1=scan.nextDouble();
        System.out.println("işlem için ikinci sayıyı gırınız");
        double sayı2=scan.nextDouble();
        switch (islem) {

            case '+':
                System.out.println(sayı1+" + " +sayı2 +" = "+(sayı1+sayı2));
                break;
            case '-':
                System.out.println(sayı1+" - " +sayı2 +" = "+(sayı1*sayı2));
                break;
            case '/':
                System.out.println(sayı1+" / " +sayı2 +" = "+(sayı1/sayı2));
                break;
            case 'x':
                System.out.println(sayı1+" * " +sayı2 +" = "+(sayı1*sayı2));
                break;
                default:
                System.out.println("dört işlem dışında bır işlem sectınız.");



        }



    }
}
