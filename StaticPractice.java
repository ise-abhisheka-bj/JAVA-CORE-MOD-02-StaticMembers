package com.jsp.Mod2.Static;

/**
 * Topic: Static Members
 * Real-World Example: Employee ID Generation
 */
public class StaticPractice {

    // 1. Static Variable (Shared by all employees)
    static String companyName = "Global Tech Solutions";
    static int employeeCount = 0;

    // 2. Non-Static Variables (Unique to each employee)
    String empName;
    int empId;

    public StaticPractice(String name) {
        employeeCount++; // Increment total employees every time an object is made
        this.empName = name;
        this.empId = employeeCount;
    }

    // 3. Static Method (Can be called without an object)
    public static void displayCompany() {
        System.out.println("Company: " + companyName);
        // System.out.println(empName); // ERROR: Static cannot see non-static directly!
    }

    public void displayEmployee() {
        System.out.println("ID: " + empId + " | Name: " + empName);
    }

    public static void main(String[] args) {
        // Accessing static method using Class Name
        StaticPractice.displayCompany();

        StaticPractice e1 = new StaticPractice("Abhisheka");
        StaticPractice e2 = new StaticPractice("John");

        e1.displayEmployee();
        e2.displayEmployee();

        System.out.println("Total Employees: " + StaticPractice.employeeCount);
    }
}
