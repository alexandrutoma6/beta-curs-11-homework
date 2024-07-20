package org.beta.curs11.homework.ex2;

import org.beta.curs11.homework.ex2.managers.PersonManager;
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

        PersonManager personManager = new PersonManager();

        System.out.println(personManager.getNameList(persons));
        System.out.println(personManager.getNameToAge(persons));
        System.out.println(personManager.getPersonsOlderThan(30, persons));
        System.out.println(personManager.getHairColorToName(persons));
        System.out.println(personManager.getAgeToName(persons));
    }
}
