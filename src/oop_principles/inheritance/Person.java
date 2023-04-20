package oop_principles.inheritance;
import java.time.LocalDate;

public class Person {// default constructor
    public Person(){}

    // Create 2 args constructor with name and age
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Create 3 args constructor with name, age and DOB
    public Person(String name, int age, LocalDate DOB){
        this(name, age);
        this.DOB = DOB;
    }

    // Create 4 args constructor with name, age, DOB and SSN
    public Person(String name, int age, LocalDate DOB, String SSN) {
        this(name, age, DOB);
        this.SSN = SSN;
    }

    // instance variables
    public String name;
    protected int age;
    LocalDate DOB;
    private String SSN;


    // functions
    public void walk(){
        System.out.println("Person walks");
    }

    public void eat(){
        System.out.println("Person eats");
    }

    public void talk(){
        System.out.println("Person talks");
    }

    public void sleep(){
        System.out.println("Person sleeps");
    }

}
