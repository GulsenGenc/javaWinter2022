package day15_methodCreation;

public class C01_methodCreation {
    public static void main(String[] args) {

        String str="Java ogrenmek cok zevkli";

        //str ın ilk 4 harfini almak istesek
        str.substring(0,4);

        //bir program yaparken kodlarımızın daha kısa ve anlaşılır olması için sureklı kullanabılecegımız kod bloklarını
        //hazır olarak bır yere koyar ,ıhtıyacımız oldukca oradan alıp kullanırız.

        //methodlar robotlara benzer .
        //method oluşturmak bazen o methodun yapacagı işi yapmaktan zor olabılır .
        //bir işlemi sadece bir kere yapacaksak method kullanmamıza gerek olmayablır.
        //ancak özellikle çok kullanacagımız işlemler için her seferınde yenıden aynı kodları yazmak yerıne
        //bu işlemi yapan hazır bır method oluşturmak cok daha pratıktır.

        //bazen bır classın içerısınde cok uzun kodlar yazarsak ,tum claassın anlaşılması zorlaşabılır.
        //bunun yerıne kodun belli kısımlarını ayrı methodlar olarak oluşturup
        // main method içerisinden istediğimiz sekılde bu methodları yonetebılırız.
    }
}
