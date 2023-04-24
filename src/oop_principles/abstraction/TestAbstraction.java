package oop_principles.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
    // Phone phone1 = new Phone(); //Abstract class cannot be instantiated

    Samsung s1 = new Samsung();
    IPhone i1 = new IPhone();
    Nokia n1 = new Nokia();

    s1.call(); // Samsung calls
    i1.call(); // IPhone calls
    n1.call(); // Nokia calls


    s1.text(); // Samsung texts
    i1.text(); // IPhone texts
    n1.text(); // Nokia texts

    s1.ring(); // Phone rings
    i1.ring(); // IPhone rings
    n1.ring(); // Phone rings

        i1.connectWifi();
        s1.connectWifi();
}
}
