package it.develhope.Exercise7;

public class Car extends Vehicle {

    public int numberOfDoors;
    public double carPrice;

    public Car(int numberOfWheel, int numberOfDoors, double carPrice){
        super("Car",numberOfWheel);
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Veicolo a " + numberOfDoors + "porte");
    }

    @Override
    void doVehicleSound() {
        System.out.println("Brum brum! ahah");
    }
}
