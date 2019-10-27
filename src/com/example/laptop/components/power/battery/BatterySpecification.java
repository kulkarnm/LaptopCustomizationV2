package com.example.laptop.components.power.battery;

public class BatterySpecification {
    private double voltage;
    private double wattage;
    private double current;

    public BatterySpecification(double voltage, double wattage, double current) {
        this.voltage = voltage;
        this.wattage = wattage;
        this.current = current;
    }

    public double getVoltage() {
        return voltage;
    }

    public double getWattage() {
        return wattage;
    }

    public double getCurrent() {
        return current;
    }

    @Override
    public String toString() {
        return "BatterySpecification{" +
                "voltage=" + voltage +
                ", wattage=" + wattage +
                ", current=" + current +
                '}';
    }
}
