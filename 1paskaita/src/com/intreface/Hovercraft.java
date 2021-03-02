package com.intreface;

public class Hovercraft implements IsLandVehicle, IsSeaVessel{

    private int numWheels;
    private String name;
    private int maxPassengers;
    private int maxSpeed;
    private int displacement;

    public Hovercraft(int numWheels, String name, int maxPassengers, int maxSpeed, int displacement) {
        this.numWheels = numWheels;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.displacement = displacement;
    }

    public void enterLand(){
        System.out.println("Hovercraft on land");
    }
    public void enterSea(){
        System.out.println("Hovercraft on sea");
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
        System.out.println("Hovercraft is driving");
    }


    @Override
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(int displacement){
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("Hovercraft start jorney");

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
