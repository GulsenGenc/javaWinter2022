package pratiklerim;

public class WhileLoop4 {
    public static void main(String[] args) {

        // Soru 3 ) Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
        //dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.

        int baslangıc=10;
        int bitis=35;
        int toplam =0;

        while (baslangıc<=bitis){
            if (baslangıc%2==0){
                toplam+=baslangıc;
                System.out.print(baslangıc+",");
            }
            baslangıc++;

        }
        System.out.println("");
        System.out.println("baslangıc ve bıtış değerleri arasındaki sayıların toplamı :"+toplam);






    }
}
