package it.develhope.Exercise7;

public abstract class Vehicle {

    public String type;
    public int numberOfWheel;

    public Vehicle(String type, int numberOfWheel){
        this.type = type;
        this.numberOfWheel = numberOfWheel;
    }

    public void showVehicleDetails(){
        System.out.println("Vehicle type: " + this.type + "\nnumberofwheel: "+this.numberOfWheel);
    }

    abstract  void doVehicleSound();

}
