package day16_MethodCreatıon;

public class C04_Forloop {
    public static void main(String[] args) {
        //verılen strıngı tersten yazdıran bır kod yuaznız

        String str="Valla bu Java cok zevkli";

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));// prıntln yapmıyoruz yoksa alt alta harflerı yazar.

        }
    }
}
