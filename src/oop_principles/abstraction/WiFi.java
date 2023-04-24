package oop_principles.abstraction;

public interface WiFi {// We can only have public static final instance variables in an interface
    public static final String variable = "";

    void connectWifi(); // this method is public and abstract by default

    default void getWiFi(){
        // body
    }

    static void method(){

    }
}
