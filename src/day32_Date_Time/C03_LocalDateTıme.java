package day32_Date_Time;

import java.time.LocalDateTime;

public class C03_LocalDateTıme {
    public static void main(String[] args) {

        LocalDateTime tarhSaat=LocalDateTime.now();

        System.out.println(tarhSaat);//2022-04-01T08:07:59.798423100
        //ileri geri gidebılırız.

        System.out.println(tarhSaat.plusYears(3).plusMonths(3).plusDays(2));//3 yıl 3 ay 2 gun sonrayı verır.
    }
}
