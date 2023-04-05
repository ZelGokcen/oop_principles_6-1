package class_vs_object;

public class House {

    // default constructor - programmer can create an object with no info
    public House(){

    }


    // 2-args constructor
    public House(double price, int year) {
        this.price = price;
        this.year = year;
    }


    //5-args constructor - overloaded constructor - programmer can create an object with 5 info
    public House(String color, double price, int year, String address, boolean hasGarden) {
        this.color = color;
        this.price = price;
        this.year = year;
        this.address = address;
        this.hasGarden = hasGarden;
    }


    //instance variables - features that defines a House object (instance)
    public String color = "White";
    public double price;
    public int year;
    public String address;
    public boolean hasGarden = true;


    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", address='" + address + '\'' +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
