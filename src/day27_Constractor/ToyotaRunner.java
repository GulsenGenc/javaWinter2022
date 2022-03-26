package day27_Constractor;

public class ToyotaRunner {
    public static void main(String[] args) {
        Toyota t1=new Toyota();
        System.out.println(t1.marka);//Toyota
        System.out.println(t1.teker);//4
        System.out.println(t1.model);//ben değer atamadıgım için java default deger atar.null
        t1.model="Corolla";
        t1.yakıt="benzin";
        t1.yıl=2022;

        t1.maxHız();

        System.out.println("T1 model : "+t1.model+ ","+"yakıtı :"+ t1.yakıt+", "+"yıl :"+t1.yıl);

        Toyota t2=new Toyota();

        System.out.println(t2.model);//null
        t2.model="Yaris";
        t2.yakıt="benzin";
        t2.yıl=2021;

        t2.renkScenekleri();


        System.out.println("T2 model : "+t2.model+ ","+"yakıtı :"+ t2.yakıt+", "+"yıl :"+t2.yıl);




    }
}
