package day20_Scope_Arrays;

public class C01_InstanceVariables {

    int sayı;
    String bransİsmi="Java";
    boolean okuldaMı;


    public static void main(String[] args) {
        //sayı=10; sayı variable ı static olmadıgı için main method dan dırek kullanılamaz
        //instance varıable lara static methodlardan ulaşabılmek ıcınobje oluşturmamız gerk

        C01_InstanceVariables obj1=new C01_InstanceVariables();
        System.out.println(obj1.sayı);//değer atanmadıgı için 0 yazdırdı.
        obj1.sayı=10;
        System.out.println(obj1.sayı);//10 degerını verır.
        obj1.bransİsmi="SQL";
        System.out.println(obj1.okuldaMı);//atama olmadıgında false yazdırır.

        C01_InstanceVariables obj2=new C01_InstanceVariables();
        System.out.println(obj2.sayı); //0 yazdırır.
        System.out.println(obj2.bransİsmi);//Java yazdırır.



        obj1.okuldaMı=true;
        System.out.println(obj2.okuldaMı);//false
    }
}
