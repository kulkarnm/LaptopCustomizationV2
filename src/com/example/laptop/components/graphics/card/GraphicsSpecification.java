package com.example.laptop.components.graphics.card;

public class GraphicsSpecification {
    private String chip;
    private int memorySpeed;
    private String memoryType;
    private String name;
    private String manufacturer;

    public GraphicsSpecification(String chip,int memorySpeed, String memoryType, String name, String manufacturer) {
        this.chip=chip;
        this.memorySpeed = memorySpeed;
        this.memoryType = memoryType;
        this.name = name;
        this.manufacturer = manufacturer;
    }


    public int getMemorySpeed() {
        return memorySpeed;
    }


    public String getMemoryType() {
        return memoryType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getChip() {
        return chip;
    }

    @Override
    public String toString() {
        return "GraphicsSpecification{" +
                "chip='" + chip + '\'' +
                ", memorySpeed=" + memorySpeed +
                ", memoryType='" + memoryType + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
