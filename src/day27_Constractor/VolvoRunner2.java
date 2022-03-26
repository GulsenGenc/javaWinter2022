package day27_Constractor;

public class VolvoRunner2 {
    public static void main(String[] args) {
        //her obje oluşturdugumuzda model,yakıt gıbı degerlerı
        //her defasında tek tek atama yapmak ıstemıyoruz

        Volvo arb1=new Volvo("Xc60",false,2023,"benzin");

        System.out.println(arb1.torString());//Model :Xc60 Yakıt :benzin max hız :240

        arb1.model="edkshjd";
        System.out.println(arb1.torString());

    }
}
