package com.example.laptop.components.motherboard.board;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class AMDRyzen5Motherboard extends AbstractMotherBoard {
    public AMDRyzen5Motherboard(ASSEMBLYCOMPONENTTYPE type, double cost, MotherboardSpecification specification) {
        super("AMDRyzen5Motherboard",type, BUDGETCATEGORY.MEDIUM,cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    public void assemble(){
        System.out.println("AMD RYZEN 5 SPECIFIC ASSEMBLING OF COMPONENTS COMPLETED");
    }

    @Override
    public String toString() {
        return "AMDRyzen5Motherboard{" + super.toString() + "}";
    }
}
