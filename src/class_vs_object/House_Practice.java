package class_vs_object;

public class House_Practice {
    public static void main(String[] args) {

        // Create a House object
        House house1 = new House();

        System.out.println(house1); // House{color='null', price=0.0, year=0, address='null', hasGarden=false}
        house1.price = 300000;

        System.out.println(house1);

        //Make color = Blue and year = 2020 and print the object once again
        house1.color = "Yellow";
        house1.year = 2000;

        house1.color = "Blue";
        house1.year = 2020;

        System.out.println(house1);


        System.out.println("\n---------more objects--------\n");
        House house2 = new House();
        House house3 = new House();
        House house4 = new House();
        House house5 = new House();

        house2.color = "Green";

        System.out.println(house2);
        System.out.println(house3);
        System.out.println(house4);
        System.out.println(house5);


        House house6 = new House(200000, 2020);
        System.out.println(house6);
    }
}
