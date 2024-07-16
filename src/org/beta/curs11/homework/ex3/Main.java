package org.beta.curs11.homework.ex3;

import org.beta.curs11.homework.ex3.models.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 30, "Blonde", "Google", 75000d),
                new Employee("Bob", 25, "Brown", "Amazon", 80000d),
                new Employee("Charlie", 35, "Black", "Microsoft", 90000d),
                new Employee("David", 28, "Red", "Apple", 85000d),
                new Employee("Eve", 22, "Blonde", "Facebook", 70000d),
                new Employee("Frank", 40, "Grey", "IBM", 95000d),
                new Employee("Grace", 27, "Brown", "Google", 78000d)
        );

//        System.out.println(getEmployeeSalaryGreater(employees, 1000d));
//        System.out.println(getCompanyToEmployee(employees));
//        System.out.println(getSalaryPerCompanies(getCompanyToEmployee(employees)));
        Map<String,List<Employee>> companyToEmployee = getCompanyToEmployee(employees);
        Map<Double, String> salaryPerCompanies = getSalaryPerCompanies(companyToEmployee);

        biggestSalaryFromCompanies(salaryPerCompanies);

    }

    private static List<Employee> getEmployeeSalaryGreater(List<Employee> employees, Double amount) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.salary() >= amount) {
                result.add(employee);
            }
        }
        return result;
    }

    private static Map<String, List<Employee>> getCompanyToEmployee(List<Employee> employees) {
        Map<String, List<Employee>> result = new HashMap<>();

        for (Employee employee : employees) {
            String company = employee.company();
            if (!result.containsKey(company)) {
                result.put(company, new ArrayList<>());
            }
            result.get(company).add(employee);
        }
        return result;
    }

    private static Double getSumOfSalaries(List<Employee> employees) {
        Double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.salary();
        }
        return totalSalary;
    }

    private static Map<Double, String> getSalaryPerCompanies(Map<String, List<Employee>> companyToEmployeesMap) {
        Map<Double, String> result = new HashMap<>();

        for (Map.Entry<String, List<Employee>> employeesInCompany : companyToEmployeesMap.entrySet()) {
            result.put(getSumOfSalaries(employeesInCompany.getValue()), employeesInCompany.getKey());
        }
        return result;
    }

    private static void biggestSalaryFromCompanies(Map<Double, String> salariesToCompany) {
        double maxSalary = Double.MIN_VALUE;
        String companyWithMaxSalary = "";

        for (Map.Entry<Double, String> entry : salariesToCompany.entrySet()) {
            double salary = entry.getKey();
            String company = entry.getValue();

            if (salary > maxSalary) {
                maxSalary = salary;
                companyWithMaxSalary = company;
            }
        }

        System.out.println("Company with the highest salary: " + companyWithMaxSalary + " (Salary: " + maxSalary + ")");
    }
}
