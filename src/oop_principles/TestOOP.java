package oop_principles;

import oop_principles.encapsulation.Clock;

public class TestOOP {
    public static void main(String[] args) {
        Clock clock1 = new Clock();

        //DIRECT ACCESS TO INSTANCE VARIABLES TO SET AND GET
        //clock1.color = "Yellow"; // How we set information for the instance variable
        //System.out.println(clock1.color); //  How we get information of the instance variable


        //HOW TO SET AND GET INSTANCE VARIABLE THAT IS PRIVATE
        clock1.setColor("Yellow", "1234");


        System.out.println(clock1.getColor()); // Yellow
    }
}
