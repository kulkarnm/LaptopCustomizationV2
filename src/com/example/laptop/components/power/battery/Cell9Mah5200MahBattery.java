package com.example.laptop.components.power.battery;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class Cell9Mah5200MahBattery extends AbstractLaptopBattery {
    public Cell9Mah5200MahBattery(ASSEMBLYCOMPONENTTYPE type, double cost, BatterySpecification specification) {
        super("Cell9Mah5200MahBattery",type, BUDGETCATEGORY.MEDIUM,cost, specification,ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("9 MAH 5200 Lithium Ion Battery installed");
    }

    @Override
    public String toString() {
        return "Cell9Mah6600LiIonBattery{" + super.toString() + "}";
    }

}
