package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        if (a<b && b<100){

            System.out.println("istegınız gerçekleşecektir.");
        }

        if (a<0) System.out.println("suslu parantez olmazsa sadece bır satır çalışır");//bu ıf ; e kadar çaılışır.

        //bır ıf statementının daha anlaşılır olmasını ıstıyorsanız ıf body sını suslu parantez ıcıne yazmalısınız.
        //body yı suslu parantez ıcıne yazmazsak da ıf cumlesı çalışır ancak
        // ilk noktalı vırgul gordugunde ıf cumlesı bıtmış olur.

        //20. satırdakı kod, 13. satırdakı ıf yanlış olsada yazdırır
        System.out.println("2.satırda çalıştı");



    }
}
