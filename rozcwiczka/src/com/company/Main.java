package com.company;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sortowanie1 a = new Sortowanie1();

        Employee emp = new Employee("Abhi");

        try {
            Employee emp2 = (Employee) emp.clone();

            System.out.println("emp1 "+emp.getObowiazki().getOb1()+" "+emp.getObowiazki().getOb2());

            emp.getObowiazki().setOb1("spać");
             System.out.println("emp2 "+emp2.getObowiazki().getOb1()+" "+emp2.getObowiazki().getOb2());
             System.out.println("emp1 "+emp.getObowiazki().getOb1()+" "+emp.getObowiazki().getOb2());


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }



}




