package day46_Iterator_Collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {

        //hem list hem de Queue'nın  chıld classıdır

        LinkedList<Integer> list=new LinkedList<>();
        list.add(5); //add methodu listten geldığı için sona ekler
        list.addFirst(4);//addFirst deque den gelır
        list.addLast(5);//addLast deque den gelır
        System.out.println(list);
        list.add(2,25);
        System.out.println(list);
    }
}
