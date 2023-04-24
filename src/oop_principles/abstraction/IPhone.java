package oop_principles.abstraction;

public class IPhone extends Phone implements WiFi, Camera, Bluetooth {

    @Override
    public void call() {
        System.out.println("IPhone calls");
    }

    @Override
    public void text() {
        System.out.println("IPhone texts");
    }

    @Override
    public void ring(){
        System.out.println("IPhone rings");
    }
    @Override
    public void connectWifi() {
        System.out.println("IPhone connects WiFi");
    }

    @Override
    public void takePhoto() {
        System.out.println("IPhone takes photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("IPhone records video");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("IPhone connects to Bluetooth");
    }
}
