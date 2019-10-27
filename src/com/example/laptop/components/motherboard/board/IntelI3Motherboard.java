package com.example.laptop.components.motherboard.board;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class IntelI3Motherboard extends AbstractMotherBoard {
    public IntelI3Motherboard(ASSEMBLYCOMPONENTTYPE type, double cost, MotherboardSpecification specification) {
        super("IntelI3Motherboard",type, BUDGETCATEGORY.LOW_TO_MEDIUM, cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    public void assemble(){
        System.out.println("INTEL I3 SPECIFIC ASSEMBLING OF COMPONENTS COMPLETED");
    }

    @Override
    public String toString() {
        return "IntelI3Motherboard{" + super.toString() + "}";
    }
}
