package day47_LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
       Deque<Integer> ll1=new LinkedList<>();

        ll1.peek();
     //   System.out.println(ll1.element());//boşken kullanırsak exaptıon fırlatır
        System.out.println(ll1.peek());// boşken kullanırsak null döndururyor

        System.out.println(ll1.poll());//null döndurdu
       // ll1.pop();//ilk elementi silip bize döndrur.bulamazsa exaptıon verır
        ll1.push(4);//en başa aldığı elementı ekler
        ll1.push(23);
        System.out.println(ll1); //[23, 4]
    }
}
