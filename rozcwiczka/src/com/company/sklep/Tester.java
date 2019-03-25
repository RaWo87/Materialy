package com.company.sklep;

public class Tester {
    public static void main(String[] args) {
        Shop sklep =new Shop();
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Abhi");
        try {
            Employee emp2 = (Employee) emp.clone();
            System.out.println(emp2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}