package class_vs_object;

import java.util.ArrayList;

public class House_Exercise {
    public static void main(String[] args) {

        /*
        Create 5 House object with below information

        1 -> Blue, 200000, 2020, Chicago, true
        2 -> Yellow, 250000, 2021, Miami, true
        3 -> Green, 300000, 2022, Chicago, false
        4 -> Brown, 350000, 2023, Miami, false
        5 -> Blue, 400000, 2023, Chicago, true


        Print them all
         */

        House house1 = new House("Blue", 200000, 2020, "Chicago", true);
        House house2 = new House("Yellow", 250000, 2021, "Miami", true);
        House house3 = new House("Green", 300000, 2022, "Chicago", false);
        House house4 = new House("Brown", 350000, 2023, "Miami", false);
        House house5 = new House("Blue", 400000, 2023, "Chicago", true);


        // 5 houses - 5 objects
        // dataType[] varName = {el1, el2, el3, el4, el5};

        House[] arr = {house1, house2, house3, house4, house5};

        ArrayList<House> houseList = new ArrayList<>();
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);
        houseList.add(house4);
        houseList.add(house5);


        System.out.println("\n----------Looping a House array-------\n");
        for (House house : arr) {
            System.out.println(house);
        }

        System.out.println("\n----------Looping a House ArrayList-------\n");
        for (House house : houseList) {
            System.out.println(house);
        }

        System.out.println("\n----------forEach() method with House ArrayList-------\n");
        houseList.forEach(System.out::println);


        System.out.println("\n---------Print color for each house---------\n");
        for (House house : arr) {
            System.out.println(house.color);
        }


        /*
        Count how many houses are in Chicago
        3
         */
        System.out.println("\n---------Count houses that are located in Chicago---------\n");
        int count = 0;

        for(House element : houseList){
            if(element.address.equalsIgnoreCase("Chicago")) count++;
        }

        System.out.println(count);

        System.out.println(houseList.stream().filter(house -> house.address.equalsIgnoreCase("Chicago")).count()); // 3


        /*
        Count how many houses located in Chicago and has Garden
        2
         */
        System.out.println("\n---------Count houses that are located in Chicago and has garden---------\n");

        System.out.println(houseList.stream().filter(element -> element.hasGarden && element.address.equalsIgnoreCase("Chicago")).count());
    }
}
