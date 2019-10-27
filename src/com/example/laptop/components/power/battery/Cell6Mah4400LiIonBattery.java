package com.example.laptop.components.power.battery;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class Cell6Mah4400LiIonBattery extends AbstractLaptopBattery {
    public Cell6Mah4400LiIonBattery(ASSEMBLYCOMPONENTTYPE type, double cost, BatterySpecification specification) {
        super("Cell6Mah4400LiIonBattery",type, BUDGETCATEGORY.LOW, cost, specification,ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("6 MAH 4400 Lithium Ion Battery installed");
    }

    @Override
    public String toString() {
        return "Cell6Mah4400LiIonBattery{" + super.toString() + "}";
    }

}
