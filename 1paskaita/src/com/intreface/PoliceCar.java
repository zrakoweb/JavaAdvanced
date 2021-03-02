package com.intreface;

public class PoliceCar implements  IsEmergency,IsLandVehicle{

    private  int numWheels;
    private String name;
    private int maxPassengers;
    private int maxSpeed;
    @Override
    public void soundSiren() {
        System.out.println("huuuu huuuuu");

    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;

    }

    @Override
    public void drive() {
        System.out.println("police driving");

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;

    }
}
