package com.example.laptop.components.motherboard.board;

public class MotherboardSpecification {
    private int frontSideBusSpeed;
    private String chipset;
    private String BIOS;
    private String memorySupportType;
    private String manufacturer;
    private String cpuCompatibility;

    public MotherboardSpecification(int frontSideBusSpeed, String chipset, String BIOS, String memorySupportType, String manufacturer, String cpuCompatibility) {
        this.frontSideBusSpeed = frontSideBusSpeed;
        this.chipset = chipset;
        this.BIOS = BIOS;
        this.memorySupportType = memorySupportType;
        this.manufacturer = manufacturer;
        this.cpuCompatibility = cpuCompatibility;
    }

    public int getFrontSideBusSpeed() {
        return frontSideBusSpeed;
    }

    public String getChipset() {
        return chipset;
    }

    public String getBIOS() {
        return BIOS;
    }

    public String getMemorySupportType() {
        return memorySupportType;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public String getCpuCompatibility() {
        return cpuCompatibility;
    }

    @Override
    public String toString() {
        return "MotherboardSpecification{" +
                "frontSideBusSpeed=" + frontSideBusSpeed +
                ", chipset='" + chipset + '\'' +
                ", BIOS='" + BIOS + '\'' +
                ", memorySupportType='" + memorySupportType + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", cpuCompatibility='" + cpuCompatibility + '\'' +
                '}';
    }
}
