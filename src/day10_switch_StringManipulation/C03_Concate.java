package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {
        // Concatenation yapmak icin iki ihtimalimiz var
        // istersek daha once yaptigimiz gibi + operatorunu kullanabiliriz
        // veya String class'indan gelen concat method'unu kullanabiliriz


        String str1="Java";
        String str2="Candır";
     //Java Candır yazdıralım
        System.out.println(str1+" "+ str2);

        String cumle =str1.concat(str2);   //JavaCandır yazdıracak
        cumle=str1.concat(" ").concat(str2); //Java Candır yazdıracak

        System.out.println(cumle);

        // concat icine String degil de sayi veya boolean deger yazsak ?
        // concat method'u icine String parametre ister
        // String disinda bir data turu yazdiginizda onu String haline getirmelisiniz.başına veya sonuna bir hiçlik
        //""koymamız gerekir.


        cumle=str1.concat(true+"");
        cumle=str1.concat(" "+""+5);


        System.out.println(cumle);

    }
}
