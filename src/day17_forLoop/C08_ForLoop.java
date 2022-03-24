package day17_forLoop;

public class C08_ForLoop {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir method yazin.

        String input="Madam";
        palindromeKontrolEt(input);
    }

    public static void palindromeKontrolEt(String input) {
        String terstenInput="";
        for (int i = input.length()-1; i >=0; i--) {
            terstenInput+=input.charAt(i);
        }

        System.out.println("girdiğiniz kelimenin tersten yazılısı :"+terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("girdiğiniz kelime palindrome");
        } else {
            System.out.println("girdiğiniz kelime palindrome değil");
        }
    }
}
