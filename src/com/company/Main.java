package com.company;

import com.company.utilities.Employee;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("John Doe","815-654-3211", 1);
        Employee employee2 = new Employee("Jane Smith","123-452-1352", 3);
        Employee employee3 = new Employee("Joe Average","645-735-4326", 3);


        employee1.DisplayInfo();
        employee2.DisplayInfo();
        employee3.DisplayInfo();
    }
}
