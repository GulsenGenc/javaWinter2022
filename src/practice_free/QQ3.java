package practice_free;

public class QQ3 {
    public static void main(String[] args) {
        /*   Interview Question
     0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
*/
        System.out.println("******* for ile ********");
        for (int i = 0; i <255 ; i++) {
            char karakter=(char) i;
            System.out.println(i+"->" +karakter);

        }


        System.out.println("****** while ile **********");

        int i=0;
        while(i<=255){
        char c=(char) i;
            System.out.println(i+" ->" +c);
            i++;
        }




    }
}
