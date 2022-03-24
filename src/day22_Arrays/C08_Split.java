package day22_Arrays;

public class C08_Split {
    public static void main(String[] args) {

        //verilen bir cümlede istenen harfin kac defa kullanıldıgını yazdıran bır method oluşturun

        String cümle="Nerede o hello world yazdıramayan ögrenciler?";
        String harf=" ";

        harfKacKereKullanılmısMethodu(cümle,harf);
    }

    public static void harfKacKereKullanılmısMethodu(String cümle, String harf) {
        int sayac=0;
        String karakterler[]=cümle.split("");

        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(harf)) {
                sayac++;

            }
        }
        System.out.println(harf+" "+ sayac+ " defa kullanılmıştır");




    }
}
