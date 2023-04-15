package garbage_collection;

import class_vs_object.Animal;

public class UnderstandingGC {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();


        System.out.println(animal1); // class_vs_object.Animal@29453f44
        System.out.println(animal2); // class_vs_object.Animal@5cad8086


        animal1 = animal2; // Line that garbage collection happens
        System.gc();
        Runtime.getRuntime().gc();

        System.out.println(animal1); // class_vs_object.Animal@5cad8086
        System.out.println(animal2); // class_vs_object.Animal@5cad8086

    }
}
