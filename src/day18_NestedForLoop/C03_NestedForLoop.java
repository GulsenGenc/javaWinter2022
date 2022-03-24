package day18_NestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        int input=5;
        int input2=8;
        //nested for loop ya dıkdortgen formatında olabılır veya ücgen formatında olabılır
        //dıkdortgen ıstedıgımızde ıkı loop ıcınde bagımsız end point belirleriz
        //üçgen seklı vermek için inner loopun end pointi olarak outer degıskene baglı yaparız.

        for (int i = 1; i <= input ; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }

}
