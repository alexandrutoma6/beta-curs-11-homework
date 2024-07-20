package org.beta.curs11.homework.ex4;

import org.beta.curs11.homework.ex4.enums.DaysOfTheWeek;
import org.beta.curs11.homework.ex4.objects.DaySchedule;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> activities = List.of("Running", "Go to the beach", "Watch a  movie");

        DaySchedule schedule = new DaySchedule(DaysOfTheWeek.THURSDAY,activities);
        DaySchedule schedule2 = new DaySchedule(DaysOfTheWeek.THURSDAY,null);
        DaySchedule schedule3 = new DaySchedule(null,activities);

        System.out.println(schedule);

        schedule.addActivity("Beach volley");
        System.out.println(schedule);
        schedule.removeActivity("Go to the beach");
        System.out.println(schedule);

//        System.out.println(schedule2);
//        System.out.println(schedule3);
    }
}
