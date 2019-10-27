package com.example.laptop.components.graphics.monitor;

public class ScreenSpecification {
    private String resolution;
    private String dimensions;
    private String manufacturer;


    public ScreenSpecification(String resolution, String dimensions, String manufacturer) {
        this.resolution = resolution;
        this.dimensions = dimensions;
        this.manufacturer = manufacturer;
    }

    public String getResolution() {
        return resolution;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "ScreenSpecification{" +
                "resolution='" + resolution + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
