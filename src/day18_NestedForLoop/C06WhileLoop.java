package day18_NestedForLoop;

public class C06WhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan ıkı tam sayı alıp,bu sayıları ve aralarındakı tum tam sayıları yazdıran bır kod olusturun

        int baslangıc=40;
        int bitis=60;

        for (int i = baslangıc; i <=bitis ; i++) {
          if (i%2==0){
              System.out.print(i+" ");

          }
        }
        System.out.println("");
        //aynı while loop ile yapalım
        while (baslangıc<=bitis){
            if (baslangıc%2==0){
                System.out.print(baslangıc+ " ");
            }


        }


    }
}
