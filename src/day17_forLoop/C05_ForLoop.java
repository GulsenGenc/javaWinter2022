package day17_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        // Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.

        int sayı=124;

        for (int i = 1; i <sayı ; i++) {
            if (i%3==0){
                System.out.print(i + ",");
            } else {
                System.out.print("");
            }
  //veya söyle de yazdırabılırız

            for (int j = 1; j <sayı ; j++) {
                if (j%3==0){
                    System.out.print(j+",");
                }

            }
        }

    }
}
