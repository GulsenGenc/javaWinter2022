package day05_matematikselislemler;

import java.util.SortedMap;

public class C05_WrapperClass {
    public static void main(String[] args) {

        short sayı1=20;
        Short sayı2=30;
        sayı1=sayı2;//wrapper class ıle aynı ısımdekı prımıtıve data turu arasında gecıs olabılır

        System.out.println(sayı1);//30

        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.BYTES);//2 byte=16 bit

        System.out.println(sayı2.intValue());
    }
}
