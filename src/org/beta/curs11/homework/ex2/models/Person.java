package org.beta.curs11.homework.ex2.models;

import java.util.Objects;

public class Person {
    private final String name;
    private final Integer age;
    private final String hairColour;

    public Person(
            String name,
            Integer age,
            String hairColour
    ) {
        if (isEmptyOrNull(name)) {
            this.name = "unknown";
        } else {
            this.name = name;
        }
        if(isPositiveNumber(age)){
            this.age = age;
        }else{
            this.age = 0;
        }
        if (isEmptyOrNull(hairColour)){
            this.hairColour="unknown";
        }else{
            this.hairColour = hairColour;
        }
    }

    protected boolean isEmptyOrNull(String string) {
        return string == null || string.isBlank();
    }

    protected boolean isPositiveNumber(Number number) {
        if (number instanceof Integer) {
            return (Integer) number > 0;
        } else if (number instanceof Double) {
            return (Double) number > 0.0;
        }
        return false;
    }

    public String name() {
        return name;
    }

    public Integer age() {
        return age;
    }

    public String hairColour() {
        return hairColour;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.age, that.age) &&
                Objects.equals(this.hairColour, that.hairColour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hairColour);
    }

    @Override
    public String toString() {
        return "Person[" +
                "name=" + name + ", " +
                "age=" + age + ", " +
                "hairColour=" + hairColour + ']';
    }

}
