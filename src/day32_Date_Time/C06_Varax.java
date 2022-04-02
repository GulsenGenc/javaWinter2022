package day32_Date_Time;

public class C06_Varax {
    public static void main(String[] args) {
        //verılen ıkı sayıyı toplayan method olusturun

        int sayı1 = 10;
        int sayı2 = 20;
        int sayı3 = 20;
        int sayı4 = 20;
        int sayı5 = 20;

        toplaGel(sayı1, sayı2);

        //3 sayı toplayan method olusturalım


        toplaGel(sayı1, sayı2, sayı3);
        toplaGel(sayı1, sayı2, sayı3, sayı4);
        toplaGel(sayı1, sayı2, sayı3, sayı4, sayı5);// varax oluşturunca java ıtıraz etmıyor.
    }

    private static void toplaGel(int... sayı) {
        int toplam = 0;

        for (int each : sayı
        ) {
            toplam+=each;

        }
        System.out.println(toplam);
    }


}
