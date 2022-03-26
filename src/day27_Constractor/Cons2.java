package day27_Constractor;

public class Cons2 {
    public static void main(String[] args) {

        Cons01 obj1=new Cons01();//default constractor devrede
    /*Cons01 clasında hıc constractor oluşturmazsak java default
    constractorı kullandıgından obj1 i uretebılırız.

    ancak bız parametrelı veya parametresız  bır constractor  oluşturdugumuzda
    java default degerı siler

    Dolayisiyla biz herhangi bir constructor olusturdugumuzda
           daha once baska claslar veya kullanicilarin
           olusturmus olabilecegi objeleri kullanabilmeleri icin
           default constructor'in islevini gerceklestirecek
           parametresiz bir constructor olusturmakta fayda var


 */
        Cons01 obj2=new Cons01("Java");


    }
}
