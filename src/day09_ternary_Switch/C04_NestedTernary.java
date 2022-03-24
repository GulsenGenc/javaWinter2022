package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {
        //verilen sayının pozıtıf mı negatıf mı oldugunu kontrol edıp ,
        //negatıf  ıse -100 den buyuk veya kucuk
        //0 veya pozıtıf sayı ıse tek veya çift oldugunu belırleyen bır ternary yazınız
        int sayı = 78;

        if (sayı >= 0) {

            if (sayı%2==0){
                System.out.println("sayı pozitif çift sayı");
            } else{
                System.out.println("sayı pozıtıf tek sayı");
            }

        } else {
            if (sayı<=-100){
                System.out.println("sayı -100 den küçük negatif sayı");
            } else {
                System.out.println("sayı -100 den büyük negatif sayı");
            }

        }

        String sonuc=sayı>=0 ?
                (sayı%2==0 ? "pozitif çift sayı" : ("sayıpozitif tek sayı")) :
                (sayı<-100 ? "-100 den küçük negatif" : "-100 den büyük negatif sayı");
        System.out.println(sonuc);
    }
}
