package day07_ifElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {

                int a=2;
                int b=3;

                if (a==b){

                    System.out.println("verilen sayılar eşit");


                }

                if (a<100){

                    System.out.println("a 100den buyuk");// ıf cumlesı sadece true ıse body sı çalışır.
                }

        // bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler
        // bir sart ve o sarta bagli sonuca odaklidir
        // birden fazla bagimsiz if cumlesi oldugunda hepsinin body calisabilecegi gibi
        //  hicbirisinin body'si calismayada bilir


    }
}
