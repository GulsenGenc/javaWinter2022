package day15_methodCreation;

public class C07_MethodCreatıon {
    public static void main(String[] args) {

        String str="Ali";
        //strıngı yazdıran metot oluşturalım
        stringYazdır(str);

        //hosgeldınız dıyen method oluştur
        hosgeldınYazdır();

        //kapanma mesajı yazan bır method oluşturun.
        kapanmaMethodu();


    }
    public static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiğiniz için teşekkür ederiz");
    }
    public static void hosgeldınYazdır() {
        System.out.println("hoş geldin");
        stringYazdır("boyle de olur");//method ıcıne method yazabılırız.böylece bır mthod ile iki üç method çagrılabılır
    }
   public static void stringYazdır(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }


}
