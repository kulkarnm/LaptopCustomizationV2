package com.example.laptop.components.power.battery;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class Cell9Mah6600LiIonBattery extends AbstractLaptopBattery {
    public Cell9Mah6600LiIonBattery(ASSEMBLYCOMPONENTTYPE type, double cost, BatterySpecification specification) {
        super("Cell9Mah6600LiIonBattery",type, BUDGETCATEGORY.HIGH,cost, specification,ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("9 MAH 6600 Lithium Ion Battery installed");
    }

    @Override
    public String toString() {
        return "Cell9Mah6600LiIonBattery{" + super.toString() + "}";
    }
}
