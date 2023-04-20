package oop_principles;

import oop_principles.inheritance.Person;

public class Singer extends Person {

    // instance variables
    String groupName;

    public void sing(){
        System.out.println("Singer sings");
    }

    @Override
    public void eat() {
        System.out.println("Singer eats");
    }


    // Override the walk() method
    @Override
    public void walk() {
        System.out.println("Singer walks");
    }
}
