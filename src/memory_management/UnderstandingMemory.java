package memory_management;

import class_vs_object.Animal;
import class_vs_object.House;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class UnderstandingMemory {
    public static void main(String[] args) {
        /*
        Data Types
        1. Primitives (8 of them: byte, short, int, long, float, double, char, boolean)
        2. Reference Types (5000+)

        In Java, we always use new keyword and constructor to create an object

        String is a special object


         */

        int age = 45;
        System.out.println(age); // 45

        String name = "John";
        System.out.println(name); // John

        String address = new String("Chicago");
        System.out.println(address); // Chicago

        Animal a = new Animal(); // does not  have toString() method
        House h = new House(); // has toString() method

        System.out.println(a); // class_vs_object.Animal@6f94fa3e
        System.out.println(h); // House{color='White', price=0.0, year=0, address='null', hasGarden=true}
    }
}
