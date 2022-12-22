package com.bridgelabz;


// Naming convention
// class => Pascal case -> Eg:- EmployeeWage
// variables , methods => Camel Case -> Eg:- employeeCheck, calculateWage()
// constants => Upper case with underscores -> Eg:- WORKING_HOURS_PER_MONTH
public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println(employeeCheck);
        if (employeeCheck == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

    }
}
