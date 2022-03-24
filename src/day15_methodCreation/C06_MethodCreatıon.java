package day15_methodCreation;

public class C06_MethodCreatıon {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //iki varıable ın degerlerını toplayan bır method oluşturalım.

        //1. adım -method adını yazalım
        //2.adım-methoda gondermem gereken arguman varmı


        ikiSayıTopla(a,b);
        //bir methodu oluşturmak çalışması ıcın yeterlı degıldır.method ancak çagırılırsa calısır.

        ikiSayıTopla(25,50);//75 yazdırdı

        C04.dortHarfiTersineCevir("sema");

        //aynı class veya farklı class olmasının bır onemı yoktur.
        //java maın methodda yukarıdan asagıya calışır.
        //ve geldıgı satırı çalıştırır.


    }//main methodun sonu burası.kod buraya gelınce durur.

    private static void ikiSayıTopla(int a, int b) {
        System.out.println("verilen iki sayının toplamı :" +(a+b));

    }
}
