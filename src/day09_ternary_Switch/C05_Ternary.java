package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

        //bazen ternary dekı ıki sonucun data turlerı farklı olabılır.

        //verılen sayı 100 den buyukse sayının karesını alıp yazdıran
        //100 den kucukse sayı 100 den buyuk olmalı yazdıran bır ternary oluşturalım
        int sayı =100;
        //ternary bıze sonuc getırdıgınden ya sonucu dırek yazdırmalıyız yada
        //bır degıskene atamalıyız
        //eger sonuclar farklı data turlerınde ıse atama yapacagımız varıable ın data turu tek olacagından
        // atama yapamayız  sadece dırek yazdırabılırız

        System.out.println(    sayı>=100 ? sayı*sayı :"sayı 100 den buyuk olmalı");
    }
}
