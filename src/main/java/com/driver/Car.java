package com.driver;

public class Car extends Vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    @Override
    public String getName() {
        return name;
    }

    public Car(String name, int wheels, String type, int doors, int gears, boolean isManual, int seats) {
        super(name);
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
        this.seats = seats;
    }

    public void changeGear(int newGear){
        currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        this.move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public void move(int speed,int direction){
        this.currentSpeed = speed;
        this.currentDirection = direction;
    }

    public void steer(int direction){

        currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getSeats() {
        return seats;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
