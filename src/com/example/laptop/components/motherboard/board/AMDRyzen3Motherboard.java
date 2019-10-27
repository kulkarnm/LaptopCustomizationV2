package com.example.laptop.components.motherboard.board;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class AMDRyzen3Motherboard extends AbstractMotherBoard {
    public AMDRyzen3Motherboard(ASSEMBLYCOMPONENTTYPE type, double cost, MotherboardSpecification specification) {
        super("AMDRyzen3Motherboard",type, BUDGETCATEGORY.LOW,cost,specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    @Override
    public void assemble(){
        System.out.println("AMD RYZEN 3 SPECIFIC ASSEMBLING OF COMPONENTS COMPLETED");
    }

    @Override
    public String toString() {
        return "AMDRyzen3Motherboard{" + super.toString() + "}";
    }

}
