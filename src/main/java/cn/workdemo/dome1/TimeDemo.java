package cn.workdemo.dome1;

import java.time.LocalDate;

public class TimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        System.out.println(month+" "+day);
    }
}
