package day05_matematikselislemler;

public class C04_WrapperClass {
    public static void main(String[] args) {
        //prımıtıve data turu ıle non prımıtıve data turu arasındakı farklar neler

        String str="java";
        int sayı=10;

        System.out.println(str.toUpperCase());//JAVA
        System.out.println(str);//java


        //non prımıtıve  data turlerı data depolamak yanında bır cok faydalı metoda sahıptır .
        //ancak prımıtıve data turlerının boyle bır ozellıgı yoktur
        //prımıtıve data turlerı sadece degerlerı saklanır.(container)


        //prımıtıve data tulerı ıcın de bazı metotlar lazım oldugunda java bazı ara cozumler uretmıştır
        //java her bır prımıtıve data turunu non prımıtıve olarak kullanabılmek için özelclasslar oluşturmuş
        //bunlara Wrapper class demıştır

        double sayı2=20.5;

        //sayı2 prımıtıve oldugundan sayı2. dedıgımızde hıcbır metot gelmez

        Double sayı3=15.3;
        //sayı3 wrapper class olan Double classını kullandıgından sayı3. dedıgımızde bıçok metod gelır .








    }
}
