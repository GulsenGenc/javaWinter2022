package day12_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {
       // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        String mail="mülkiyeayboy@gmail.com";
        String arananMetin= "@gmail.com";


        if (!mail.contains(arananMetin)){
            System.out.println("lütfen mail adresi giriniz");
        } else if (mail.endsWith(arananMetin)){
            System.out.println("mail adresiniz kaydedildi");
        } else{
            System.out.println("lütfen yazımı kontrol edinz");
        }
    }
}
