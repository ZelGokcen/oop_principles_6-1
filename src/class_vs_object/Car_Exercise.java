package class_vs_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Car_Exercise {
    public static void main(String[] args) {
        /*
        This is our Inventory -> budget 30000 - year > 2010
        car 1 -> Honda Civic 2015 10000
        car 2 -> BMW X5 2023 60000
        car 3 -> Tesla S 2023 100000
        car 4 -> Toyota Camry 2008 8000


        Remove all the cars that are expensive than 30k or year is less than 2010
        And print the cars left
         */

        Car car1 = new Car("Honda", "Civic", 2015, 10000);
        Car car2 = new Car("BMW","X5", 2023,60000);
        Car car3 = new Car("Tesla", "S", 2023,100000);
        Car car4 = new Car("Toyota", "Camry", 2008, 8000);

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4));

        System.out.println("\n-----------Before removing---------\n");
        System.out.println(cars);
        System.out.println(cars.size());


        System.out.println("\n-----------After removing---------\n");
        //cars.removeIf(car -> car.price > 30000 || car.year < 2010);

        Iterator<Car> iterator = cars.iterator();

        while(iterator.hasNext()){
            Car current = iterator.next();
            if(current.year < 2010 || current.price > 30000) iterator.remove();
        }

        System.out.println(cars); // Only Honda
        System.out.println(cars.size()); // 1



    }
}
