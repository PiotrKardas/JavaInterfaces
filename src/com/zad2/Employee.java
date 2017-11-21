package com.zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Employee implements Comparable<Employee>{


    private String firstName;
    private String lastName;

    private int salary;


    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("Adam", "Kowalski", 124444));
        employees.add(new Employee("Piotr", "Nowak", 3333));
        employees.add(new Employee("Adam1", "Kowal", 1000));
        employees.add(new Employee("Adam2", "Kow", 1222000));

        Collections.sort(employees);
        for (Employee employee : employees)
        {
            System.out.println(employee);
        }
    }


    @Override
    public String toString() {
        return firstName + " " +lastName+" "+ salary;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary < o.salary)
            return -1;
        if (this.salary > o.salary)
            return 1;
        return 0;
    }
}
