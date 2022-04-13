package day39_Overriding;

public class Toyota extends Araba{

    String hız="Toyota araclar  max 220 km hız yapar";
    String marka="toyota";
    String sırketMerkezi="Japonya";

    public  void motor(){
        System.out.println("Toyota araclar toyota marka motor kullanır");
    }

    public void garanti(){
        System.out.println("Toyota araclar 10 yıl garantılıdır");
    }

}
