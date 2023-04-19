package oop_principles.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeTest {
    public static void main(String[] args) {
        /*
        Create 3 companies object as c1, c2, c3
        name, address, phone
        Tesla, California, 123
        USBank, Minnesota, 000
        Verizon, Texas, 111


         */

        Company c1 = new Company("Tesla", "California", "123");
        Company c2 = new Company("USBank", "Minnesota", "000");
        Company c3 = new Company("Verizon", "Texas", "111");

        /*
        Create 10 employees
        fullname, title, age, company

        Alex, Developer, 25, Tesla
        Jenn, System Architect, 23, USBank
        Mike, Developer, 30, Verizon
        Matt, Manager, 35, Verizon
        Jane, Tester, 20, USBank
        Joe, Designer, 30, Tesla
        John, Designer, 27, Tesla
        Paul, Scrum Master, 21, USBank
        Michael, Tester, 29, Verizon
        Adam, Tester, 23, Tesla
         */

        ArrayList<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee("Alex", "Developer", 25, c1),
                new Employee("Jenn", "System Architect", 23, c2),
                new Employee("Mike", "Developer", 30, c3),
                new Employee("Matt", "Manager", 35, c3),
                new Employee("Jane", "Tester", 20, c2),
                new Employee("Joe", "Designer", 30, c1),
                new Employee("John", "Designer", 27, c1),
                new Employee("Paul", "Scrum Master", 21, c2),
                new Employee("Michael", "Tester", 29, c3),
                new Employee("Adam", "Tester", 23, c1)
        ));

        /*
        Write a program to find and report below information

        Employee numbers for each company:
        Tesla = 4
        USBank = 3
        Verizon = 3

        Employee numbers for each title:
        Tester = 3
        Developer = 2
        Manager = 1
        Designer = 2
        System Architect = 1
        Scrum Master = 1

        Find youngest:
        Youngest tester = Jane with the age of 20
        Youngest developer = Alex with the age of 25
        Youngest designer = John with the age of 27
         */

        int teslaEmployee = 0, usbankEmployee = 0, verizonEmployee = 0;
        int totalTesters = 0, totalDevs = 0, totalSM = 0, totalManagers = 0, totalDesigners = 0, totalSA = 0;

        Employee youngestTester = new Employee(); // age = 0
        Employee youngestDev= new Employee(); // age = 0
        Employee youngestDesigner = new Employee(); // age = 0

        youngestTester.setAge(Integer.MAX_VALUE);
        youngestDev.setAge(Integer.MAX_VALUE);
        youngestDesigner.setAge(Integer.MAX_VALUE);


        for(Employee e: employeeList){
            if(e.getCompany().getName().equals("Tesla")) teslaEmployee++;
            else if(e.getCompany().getName().equals("USBank")) usbankEmployee++;
            else verizonEmployee++;

            if(e.getTitle().equals("Tester")) {
                totalTesters++;
                if(e.getAge() < youngestTester.getAge()) youngestTester = e;
            }
            else if(e.getTitle().equals("Developer")) {
                totalDevs++;
                if(e.getAge() < youngestDev.getAge()) youngestDev = e;
            }
            else if(e.getTitle().equals("Manager")) totalManagers++;
            else if(e.getTitle().equals("Designer")) {
                totalDesigners++;
                if(e.getAge() < youngestDesigner.getAge()) youngestDesigner = e;
            }
            else if(e.getTitle().equals("System Architect")) totalSA++;
            else totalSM++;
        }

        System.out.println("Employee numbers for each company:");
        System.out.println("Tesla = " + teslaEmployee);
        System.out.println("USBank = " + usbankEmployee);
        System.out.println("Verizon = " + verizonEmployee);
        System.out.println();

        System.out.println("Employee numbers for each title:");
        System.out.println("Tester = " + totalTesters);
        System.out.println("Developer = " + totalDevs);
        System.out.println("Manager = " + totalManagers);
        System.out.println("Designer = " + totalDesigners);
        System.out.println("System Architect = " + totalSA);
        System.out.println("Scrum Master = " + totalSM);
        System.out.println();

        System.out.println("Youngest tester = " + youngestTester.getFullName() + " with the age of " + youngestTester.getAge());
        System.out.println("Youngest developer = " + youngestDev.getFullName() + " with the age of " + youngestDev.getAge());
        System.out.println("Youngest designer = " + youngestDesigner.getFullName() + " with the age of " + youngestDesigner.getAge());
    }
}
