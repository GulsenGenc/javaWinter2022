package Pratiklerim2;

import java.util.Scanner;

public class DoWhile_loop {
    public static void main(String[] args) {

        /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		*** kullanıcı tek sayıda karakterli kelime gırerse kelimenın orta harfını yazdırım
		 çift sayıda karakterlı kelıme gırerse yanlış gırdınız deyın.
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen  tek sayıda karaktere sahip bir kelime giriniz");
        String str=scan.next();
        boolean breakKomut=true;

        do {
            if ((str.length())%2!=0){
                System.out.println(str.charAt( (str.length()) /2));
                breakKomut=false;
            } else{
                System.out.println("yanlış girdiniz.");
                breakKomut=false;
            }

        }while(breakKomut);





    }
}
