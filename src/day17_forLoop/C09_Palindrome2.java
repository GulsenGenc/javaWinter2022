package day17_forLoop;

public class C09_Palindrome2 {
    public static void main(String[] args) {

        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden
        // bir method olusturun.

        String input="madam";
        String terstenInput=tersineCevir(input);
        System.out.println("girdiğiniz kelimenin tersten yazılışı :"+ terstenInput);

    }

   public static String tersineCevir(String input) {
        String terstenInput="";
       for (int i =input.length()-1; i >=0; i--) {
           terstenInput+=input.charAt(i);
           
       }
  return terstenInput;
    }

}
