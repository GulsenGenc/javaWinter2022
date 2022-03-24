package day13_StringManipulation;

public class C02_subString {
    public static void main(String[] args) {

        // 1-48 of 104 results for "nutella"
        // bu arama sonucundaki bulunan sonuc sayisi 100'den cok ise super
        // az ise "az sonuc bulundu"


        String str="1-48 of 104 results for \"nutella\"";
      int ilkSpace=str.indexOf(" ");
      int ikinciSpace=str.indexOf(" ",ilkSpace+1);
      int ücüncüSpace=str.indexOf(" ",ikinciSpace+1);

      String aramaSonucSayısıStr=str.substring(ikinciSpace+1,ücüncüSpace);

      int aramaSonucSayısıInt=Integer.valueOf(aramaSonucSayısıStr);

     if (aramaSonucSayısıInt>100){
         System.out.println("super");
     } else {
         System.out.println("az sonuc bulundu");
     }

    }
}
