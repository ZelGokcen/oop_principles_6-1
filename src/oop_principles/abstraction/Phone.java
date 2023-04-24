package oop_principles.abstraction;

public abstract class Phone {
    public Phone(){

}

    public Phone(String color){
        this.color = color;
    }

    public String color;
    public String brand;
    public int memory;
    public double price;

    public abstract void call();

    public abstract void text();

    public void ring(){
        System.out.println("Phone rings");
    }
    private void someMethod(){

    }
}
