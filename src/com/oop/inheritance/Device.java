package com.oop.inheritance;

public class Device {
    private String name;
    private String model;
    private String make;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                '}';
    }

    public void price(){
        System.out.println(
                "Price of : "+name+" , Model : "+model+" Made by : "+make+
                         " is : "+calPrice()
        );
    }

    private int calPrice() {
        return 100;
    }
}
