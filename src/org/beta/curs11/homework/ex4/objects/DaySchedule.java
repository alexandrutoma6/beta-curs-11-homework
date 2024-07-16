package org.beta.curs11.homework.ex4.objects;

import org.beta.curs11.homework.ex4.enums.DaysOfTheWeek;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaySchedule {

    private final DaysOfTheWeek day;
    private final List<String> activities = new ArrayList<>();

    public DaySchedule(DaysOfTheWeek day, List<String> activities) {
        this.day = Objects.requireNonNullElse(day, DaysOfTheWeek.MONDAY);

        if (activities != null) {
            this.activities.addAll(activities);
        }
    }

    public DaysOfTheWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return day == that.day && Objects.equals(activities, that.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, activities);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }
}
