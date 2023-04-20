package oop_principles.inheritance;

import oop_principles.Singer;
import java.time.LocalDate;
import java.time.Month;

public class PersonTest {
    public static void main(String[] args) {
    Person person1 = new Person();
    Person person2 = new Person("Jehad", 25);
    Person person3 = new Person("Yahya", 20, LocalDate.of(2003, Month.APRIL, 18));
    Person person4 = new Person("Adam", 15, LocalDate.of(2008, Month.MAY, 10), "000-00-0000");


    Programmer programmer1 = new Programmer();
    Programmer programmer2 = new Programmer("Alex", 23, LocalDate.of(2000, Month.SEPTEMBER, 5), "Java");

    Singer singer1 = new Singer();

    // Method overriding
    // eat(), sleep(), walk() and talk() methods

    person1.eat();
    programmer1.eat();
    singer1.eat(); // Singer eats
    singer1.walk(); // Person walks

    programmer1.code();
    singer1.sing();

}
}
