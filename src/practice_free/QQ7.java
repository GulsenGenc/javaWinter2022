package practice_free;

import java.util.Scanner;

public class QQ7 {
    public static void main(String[] args) {
        /*
		Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called reverseString
		  */


        Scanner scan =new Scanner(System.in);
        System.out.println("bır strıng gırın");

        String str=scan.nextLine();

        reverseString(str);
        System.out.println("girdiğiniz ifadenin tersi :"+reverseString(str));
    }

    public static String reverseString(String str) {

        String reversed="";

        for (int i =str.length()-1; i <=0 ; i--) { // son karakterden baslayip geriye giderek, butun karakterleri yazdirdik..
            reversed+=str.charAt(i);
        }

        return reversed; //String ifadenin tersini dondurur..
    }
}
