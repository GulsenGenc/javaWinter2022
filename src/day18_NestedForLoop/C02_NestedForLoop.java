package day18_NestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        //kullanıcıdan bır rakam alıp carpım tablosu oluşturalım.

        int input=3;
        // 1 2 3       1*1 1*2 1*3
        //2 4 6        2*2 2*3 2*4
        //3 6 9        3*1 3*2 3*3

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input; j++ ) {
                System.out.print(i+ "*"+j + " ");
            }
            System.out.println("");// alt satıra gecsın dıye prıntln li bir hiçlik yazdırıyoruz.
        }


//outer loop bır deger aldıgında inner loop bastan sona calışır sonra outer loop deger degıstırır.
    }
}
