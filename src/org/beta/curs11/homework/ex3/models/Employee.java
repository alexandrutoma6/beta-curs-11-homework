package org.beta.curs11.homework.ex3.models;

import org.beta.curs11.homework.ex2.models.Person;

public class Employee extends Person {

    private final String company;
    private final Double salary;

    public Employee(String name, Integer age, String hairColour, String company, Double salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

    public Double salary() {
        return salary;
    }

    public String company() {
        return company;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || obj != null && obj.getClass() == this.getClass();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name() + '\'' +
                ", age=" + age() +
                ", hairColour='" + hairColour() + '\'' +
                ", position='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
