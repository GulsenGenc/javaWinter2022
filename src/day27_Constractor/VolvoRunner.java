package day27_Constractor;

public class VolvoRunner {
    public static void main(String[] args) {
        Volvo arb1=new Volvo();
        System.out.println(arb1.marka);//Volvo

        arb1.yakıt="Dizel";
        arb1.elektrikliMi=false;
        System.out.println(arb1.maxHız);//240

        System.out.println( arb1.toString());//Model :nullYakıt :Dizelyıl :0

        Volvo arb2=new Volvo();

        arb2.yakıt="elektrikli ";
        arb2.elektrikliMi=true;
        arb2.model="XC90";
        System.out.println(arb2.toString());


    }
}
