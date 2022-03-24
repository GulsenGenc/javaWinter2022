package day15_methodCreation;

public class C09_MethodCreatıon {
    public static void main(String[] args) {
        String isim="yasemin yalcin";
        String soyisim="sari";
        String kKNo="1234567890123456";

        //eger bır methoddan bır işlem yapmasını ve yaptıgı işlemı bıze getırmesını ıstersenız
        //return type void degil, bıze getırecegı sonucun data turunde olmalıdır

        isimSoyisimGizle(isim,soyisim);
        //bana ısım soyısım gızlenmıs halını getırmesını ıstıyorum
        //bekledıgım donuş Strıng olur.


        String gizlenmisİsimSoyisim=isimSoyisimGizle(isim,soyisim);
        System.out.println(gizlenmisİsimSoyisim);
        System.out.println();

String gizlenmisKKKNo=krediKartıGizle(kKNo);
        System.out.println(gizlenmisKKKNo);

    }

    public static String krediKartıGizle(String kKNo) {
        String yeniKKNo="**** **** **** ****"+kKNo.substring(12);
           return yeniKKNo;
    }

   public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        //METHOD OLUŞTURMADA 3.ADIM
        //METHOD CALISINCA SADECE BIRSEY MI YAZDIRACAK
        //YOKSA BIZE BIR DATA MI DONDURECEK BUNA KARAR VERMEKTIR.
        //BU SORUDA GIZLENMIŞ İSİM SOYISIM DONDURMESI ISTENDIGINDEN
        //return type i void degıl Strıng sectık
        //ve methodun sonuna return edılecek datayı  yazdık
        return yeniIsim+" "+yeniSoyisim;
    }

}
