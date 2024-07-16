package org.beta.curs11.homework.ex2;

import org.beta.curs11.homework.ex2.models.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Robert", 30, "Blonde"),
                new Person("Samuel", 25, "Brown"),
                new Person("Tim", 35, "Black"),
                new Person("Sebastian", 40, "Blonde"),
                new Person("Eva", 35, "Red"));

        System.out.println(getNameList(persons));
        System.out.println(getNameToAge(persons));
        System.out.println(getPersonsOlderThan(30, persons));
        System.out.println(getHairColorToName(persons));
        System.out.println(getAgeToName(persons));
    }

    private static List<String> getNameList(List<Person> persons) {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.name());
        }
        return result;
    }

    private static Map<String, Integer> getNameToAge(List<Person> persons) {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.name(), person.age());
        }
        return result;
    }

    private static List<Person> getPersonsOlderThan(Integer givenAge, List<Person> persons) {
        List<Person> olderThanGivenAge = new ArrayList<>();
        for (Person person : persons) {
            if (person.age() > givenAge) {
                olderThanGivenAge.add(person);
            }
        }
        return olderThanGivenAge;
    }

    private static Map<String, List<String>> getHairColorToName(List<Person> persons) {
        Map<String, List<String>> result = new HashMap<>();

        for (Person person : persons) {
            String hairColour = person.hairColour();
            String name = person.name();

            if (!result.containsKey(hairColour)) {
                result.put(hairColour, new ArrayList<>());
            }
            result.get(hairColour).add(name);
        }
        return result;
    }

    private static Map<Integer, List<Person>> getAgeToName(List<Person> persons) {
        Map<Integer, List<Person>> result = new HashMap<>();

        for (Person person : persons) {
            int age = person.age();

            if (!result.containsKey(age)) {
                result.put(age, new ArrayList<>());
            }
            result.get(age).add(person);
        }
        return result;
    }
}
