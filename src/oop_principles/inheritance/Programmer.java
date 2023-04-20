package oop_principles.inheritance;
import java.time.LocalDate;

public class Programmer extends Person{

    public Programmer(){}


    // Create 4 args constructor with name, age, DOB, mainProgrammingLanguage
    public Programmer(String name, int age, LocalDate DOB, String mainProgrammingLanguage){
        super(name, age, DOB);
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }

    // instance variables
    String mainProgrammingLanguage;

    public void code(){
        System.out.println("Programmer codes");
    }

}
