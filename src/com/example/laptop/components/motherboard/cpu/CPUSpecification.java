package com.example.laptop.components.motherboard.cpu;

public class CPUSpecification {
    public String cpuMainType;
    public String cpuSubType;
    public String manufacturer;

    public CPUSpecification(String cpuMainType, String cpuSubType, String manufacturer) {
        this.cpuMainType = cpuMainType;
        this.cpuSubType = cpuSubType;
        this.manufacturer = manufacturer;
    }

    public String getCpuMainType() {
        return cpuMainType;
    }

    public String getCpuSubType() {
        return cpuSubType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "CPUSpecification{" +
                "cpuMainType='" + cpuMainType + '\'' +
                ", cpuSubType='" + cpuSubType + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
