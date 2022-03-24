package day03_scanner;
 public class C03_SwapVariables {

     public static void main(String[] args) {

       int sayı1= 10;
       int sayı2=20;

       System.out.println("Swaptan önce sayı1 : " + sayı1 +" " +"sayı2 : " + sayı2);

       sayı1= sayı1+sayı2;//sayı1=30
       sayı2=sayı1-sayı2;//sayı2=10
       sayı1=sayı1-sayı2;//sayı1=20

         System.out.println("Swaptan sonra sayı1 : " +sayı1 +" " + "sayı2 " +sayı2);







     }
}