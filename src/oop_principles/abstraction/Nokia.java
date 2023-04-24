package oop_principles.abstraction;

public class Nokia extends Phone{

    @Override
    public void call() {
        System.out.println("Nokia calls");
    }

    @Override
    public void text() {
        System.out.println("Nokia texts");
    }
}
