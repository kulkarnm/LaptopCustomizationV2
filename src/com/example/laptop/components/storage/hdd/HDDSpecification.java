package com.example.laptop.components.storage.hdd;

public class HDDSpecification {
    private String name;
    private String manufacturer;
    private int sizeInGB;
    private int rpm;

    public HDDSpecification(String name, String manufacturer, int sizeInGB, int rpm) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.sizeInGB = sizeInGB;
        this.rpm = rpm;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSizeInGB() {
        return sizeInGB;
    }


    public int getRpm() {
        return rpm;
    }

    @Override
    public String toString() {
        return "HDDSpecification{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", sizeInGB=" + sizeInGB +
                ", rpm=" + rpm +
                '}';
    }
}
