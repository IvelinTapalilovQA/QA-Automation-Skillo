package oopExerciseTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee employeeOne = new Employee(99999, "Dragan", "Draganov");

        System.out.println(employeeOne);

        employeeOne.setSalary(2000);
        employeeOne.raiseSalary(10);

        System.out.println(employeeOne.getAnnualSalary(employeeOne.salary));
        System.out.println(employeeOne.getFullName());
        System.out.println(employeeOne.getSalary());
    }
}
