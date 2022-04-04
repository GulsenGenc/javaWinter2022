package day34_accessModifier_encapsulatıon;

public class C04_Encapsulatıon {

    public static void main(String[] args) {

        /*
        bır varıable ı encapsule etmek için
        1-Access modıfıer ı private yaparız.main method dısında
        2-Okuma ve yazma özellıklerının kullanılmasını ıstedıgımız gıbı sınırlayabılırız.
          -Eger sadece okunmasını ıstıyorsak getter
          -Sadece deger gırlebılsın ıstersenız setter
          methodlarını oluştururuz.

          bir variable için hem getter hem setter oluşturursanız o varıable
          publıc olmuş gıbı hem okunup hem yazılmasını saglayabılırsınız.

          Piyasada developerlar arasında genel uygulama böyledır.objeyı publıc yapmak yerıne getter ve setter kullanırlar

         */
        C03 obj =new C03();

        System.out.println(obj.getSayı());//sayıyı getırdı sadece .değer ataması olmadıgından 0 yazdırdı.

        obj.setStr("Java java java");
        System.out.println(obj.getStr());//Java java java

        System.out.println(obj);//sayı=0, str=Java java java  toString methodu olunca böyle dırek yazdırabılıyoruz.objeye bağlı herşeyı getırır

    }
}
