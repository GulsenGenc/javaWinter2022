package day19_DoWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        int input=123456;
        int rakam=0;
        int rakamlarToplam─▒=0;

        while (input>0){
            rakam=input%10;
           rakamlarToplam─▒+=rakam;
           input/=10;

        }
        System.out.println(rakamlarToplam─▒);

    }
}
