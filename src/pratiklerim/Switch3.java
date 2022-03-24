package pratiklerim;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
       //Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
        //Kullanici
        //S girerse “ software
        //D girerse “developer
        //E girerse “engineer
        //T girerse “In Testing” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen SDET kısaltmasındaki harflerden birini giriniz.");
        char harf=scan.next().toUpperCase().charAt(0);

        switch (harf){
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;

            default:
                System.out.println("lütfen geçerli bir harf giriniz");
        }












    }
}
