package day33_varargs_StringBuılder;

public class C01_Varargs {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";

        //yazılan argument sayısı sabıtse her zamankı gıbı method oluşturabılırız.
        //ancak argument sayısı degısken olacak ıse o zaman varargs tercıh edılır

        enUzunKelıme(str1,str2,str3);
    }

    public static void enUzunKelıme(String...str) {

        String enuzunStr="";
        for (String w:str
             ) {
            if (w.length()>enuzunStr.length()){
                enuzunStr=w;
            }

        }
        System.out.println("en uzun kelıme :"+enuzunStr);
    }
}
