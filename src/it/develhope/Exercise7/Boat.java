package it.develhope.Exercise7;

public class Boat extends Vehicle {

    public double maxKnotsSpeed;
    public int boatKilosWeight;

    public Boat(double maxKnotsSpeed, int boatKilosWeight){
        super("boat",0);
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Brooooom brooom");
    }

    public String getBoatWeightAndSpeed(){
       return "Boat speed: " + this.maxKnotsSpeed + "\nBoat weight: " + this.boatKilosWeight;
    }


}
