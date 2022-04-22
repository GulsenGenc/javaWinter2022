package day47_LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll1=new LinkedList<>();
        /*
        Linkedlist in 2 tane parent ınterface ı vardır
        linkedlist oluştururken data turu olarak lınkedlıst secersek 2 parenttakı tum methodlar kullanılabılır
        eger list secersek sadece lıst ınterface ındekı methodlar,
        deque/queue secersek deque deı methodları kullanabılırız

         */

        ll1.add(10);

        //sadece list interface ınden gelen özellıklerı kullanmak ıstersem
       List<Integer> ll2=new LinkedList<>();
        ll2.add(10);
       ll2.remove(0);

       //sadece Deque den gelen özellıklerı kullanalım dersek
        Deque<Integer> ll3=new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3);
        ll3.addFirst(40);
        System.out.println(ll3);
    }
}
