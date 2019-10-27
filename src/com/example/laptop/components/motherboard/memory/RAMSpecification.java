package com.example.laptop.components.motherboard.memory;

public class RAMSpecification {
    private int capacityInGB;
    private String type;
    private String manufacturer;

    public RAMSpecification(int capacityInGB, String type, String manufacturer) {
        this.capacityInGB = capacityInGB;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public int getCapacityInGB() {
        return capacityInGB;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "RAMSpecification{" +
                "capacityInGB=" + capacityInGB +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
