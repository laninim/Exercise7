package it.develhope.Exercise7;

public class Test {

    public static void main(String[] args) {

        Car ferrari = new Car(4,2,200.000);
        Boat motoscafo = new Boat(50.0, 1000);

        ferrari.doVehicleSound();
        ferrari.showVehicleDetails();

        motoscafo.doVehicleSound();
        System.out.println(motoscafo.getBoatWeightAndSpeed());
    }
}
