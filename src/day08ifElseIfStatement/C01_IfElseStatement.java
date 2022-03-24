package day08ifElseIfStatement;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {

        //girilen bir karakterin, harf olup olmadıgını bulalım.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char karakter = scan.next().charAt(0);

        if ((karakter >= 'A' && karakter <= 'Z') || (karakter >= 'a' && karakter <= 'z')) {
            System.out.println("girdiğiniz karakter bir harftir.");
        } else {
            System.out.println("girdiğiniz karakter harf değildir.");
        }
    }
}
