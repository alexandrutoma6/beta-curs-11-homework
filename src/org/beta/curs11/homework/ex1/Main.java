package org.beta.curs11.homework.ex1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> studentGrades = new HashMap<>();
        studentGrades.put("Mihai", 8.5);
        studentGrades.put("Dan", 7.2);
        studentGrades.put("Alin", 9.0);
        studentGrades.put("David", 8.8);
        studentGrades.put("Ilinca", 6.5);

        System.out.println(studentGrades);

        getHighestGrade(studentGrades);
    }

    private static void getHighestGrade(Map<String, Double> studentGrades) {
        double highestGrade = Double.MIN_VALUE;
        String topStudent = "";

        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() > highestGrade) {
                highestGrade = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        System.out.println("The student with the highest grade is: " + topStudent + " - " + highestGrade);
    }
}
