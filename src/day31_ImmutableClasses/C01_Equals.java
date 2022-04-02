package day31_ImmutableClasses;

public class C01_Equals {
    public static void main(String[] args) {

        String str1="eren";//basit oluşumlu strıng.
        String str2="eren";//basıt oluşumlu strıng
        // yenı obje veya işlem yoksa aynı referansla str1 ve str2 yı oluşturur

        String str3=new String ("eren");//obje oluşturarak strıng
        String str4=str1+"";//işlem yapılarak strıng


        System.out.println(str1.equals(str2));//true  equals methodu sadece degere bakar.
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true
        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false

        //== hem degere hem referansa bakar .

        //

    }
}
