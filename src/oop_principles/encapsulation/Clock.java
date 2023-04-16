package oop_principles.encapsulation;

public class Clock {

    /*
    Implement encapsulation for the color instance variables
    -Encapsulation is only about the privacy-security of the instance variables
    -It cuts the direct access to instance variables by making them private
    -It provides access indirectly using public getters and setters

    WHY:
    -It provides flexibility to give read and write features
    -We can request authentication for read or write features
        -Assume there is admin password = 1234
     */

    private String color;
    private double price;

    // public setter
    public void setColor(String color, String pass){
        if(pass.equals("1234")) this.color = color;
        else throw new IllegalStateException("Password does not match!!!");
    }


    // public getter
    public String getColor(){
        return this.color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
