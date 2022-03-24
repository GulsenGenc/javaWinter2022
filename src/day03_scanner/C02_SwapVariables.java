package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {

        int sayı1=10;
        int sayı2=20;
        System.out.println("Swaptan öncesayı1: "+ sayı1 + "sayı2 :"+ sayı2);


        int temp=sayı1;
        sayı1=sayı2;
        sayı2=temp;
        System.out.println("Swaptan sonra sayı1 :"+sayı1 +"sayı2 :" +sayı2);



    }
}
