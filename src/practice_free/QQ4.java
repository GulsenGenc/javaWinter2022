package practice_free;

import java.util.Scanner;

public class QQ4 {
    public static void main(String[] args) {
        /*
      cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */

        Scanner scan=new Scanner(System.in);

        System.out.println("metre veya km ye dönüştürmk üzere cm olarak sayı gıınız ");
        double santimetre=scan.nextDouble();
        dönüstürMethodu(santimetre);


    }

  public static void dönüstürMethodu(double santimetre) {

        double metre=santimetre/100;
        double kmetre=santimetre/100.000;

      System.out.println("sizin girdiğiniz  "+santimetre+ "cm değeri" +metre+" metredir"+kmetre+" kilometredir");
    }


}
