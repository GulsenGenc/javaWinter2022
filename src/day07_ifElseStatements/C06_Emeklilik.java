package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'den kucukse emekli olamazsin yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı gırınız");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }
        else {
            System.out.println("emekli olamazsınız.");
            System.out.println(65-yas + "sene daha çalışmalısın");
        }
        //if else statement larda ıkı durumdan sadece ve sadece bırı çalışır.
        //ikisinin çalışmama ihtimali====YOK
        //ikisinin çalışma ihtimali====YOK





    }
}
