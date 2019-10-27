package com.example.laptop.components.motherboard.board;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class AMDRyzen7Motherboard extends AbstractMotherBoard {
    public AMDRyzen7Motherboard(ASSEMBLYCOMPONENTTYPE type, double cost, MotherboardSpecification specification) {
        super("AMDRyzen7Motherboard",type, BUDGETCATEGORY.HIGH, cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    public void assemble(){
        System.out.println("AMD RYZEN 7 SPECIFIC ASSEMBLING OF COMPONENTS COMPLETED");
    }

    @Override
    public String toString() {
        return "AMDRyzen7Motherboard{" + super.toString() + "}";
    }
}
