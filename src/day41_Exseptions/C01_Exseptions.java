package day41_Exseptions;

public class C01_Exseptions{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;
        try {
             c=a/b;
        } catch (Exception e) {
            //burada yazdıgımız e: exsaptıon ı atacagı obje
            //exsaptıon ıse oluşan exsaptıonın data turu
            e.printStackTrace();
            System.out.println(e.getMessage());//   / by zero
        }
        System.out.println(c);
    }


}
