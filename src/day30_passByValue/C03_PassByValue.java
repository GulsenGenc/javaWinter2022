package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {

       double etiketFıyatı=100;
        yuzdeOnIndırımYap(etiketFıyatı);
        yuzdeOnIndırımYap(etiketFıyatı);
    }

    private static void yuzdeOnIndırımYap(double etiketFıyatı) {
        etiketFıyatı=etiketFıyatı*0.9;

        System.out.println("sizin için %10 indirimli fıyatımız :"+etiketFıyatı);


    }
}
