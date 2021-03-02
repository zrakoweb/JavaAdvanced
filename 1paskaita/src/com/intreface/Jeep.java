package com.intreface;

public class Jeep implements IsLandVehicle {
    private int numWheels;
    private String name;
    private int maxPassengers;
    private int maxSpeed;

    public Jeep(int numWheels, String name, int maxPassengers, int maxSpeed) {
        this.numWheels = numWheels;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public void soundHorn() {
        System.out.println("beep beep");
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
        System.out.println("beep vaziuoja jeepas");
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
