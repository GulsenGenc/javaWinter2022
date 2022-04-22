package day47_LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        //listten gelen özellıklerı bılıyoruz.o nedenle deque den gelen özellıklere bakalım

        Deque<Integer> ll1=new LinkedList<>();

        ll1.addFirst(10);//en baştakı ındekse eleman ekler add() methoduna gore daha hızlıdır
        ll1.addLast(20);
        System.out.println(ll1);
        System.out.println(ll1.element());//ilk elementi silmeden bıze döndurur.yoksa exaptıon verır
        System.out.println(ll1);
        System.out.println(ll1.getFirst());//İLK ELEMENTİ GETIRIR
        System.out.println(ll1.getLast());//SON ELEMENTI GETIRIR


        ll1.peek();//ilk elementi silmeden bize döndürür.yoksa null döndurur



    }
}
