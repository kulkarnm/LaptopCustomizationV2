package com.example.laptop.components.motherboard.board;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class IntelI5Motherboard extends AbstractMotherBoard {
    public IntelI5Motherboard(ASSEMBLYCOMPONENTTYPE type, double cost, MotherboardSpecification specification) {
        super("IntelI5Motherboard",type, BUDGETCATEGORY.MEDIUM,cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    public void assemble(){
        System.out.println("INTEL I5 SPECIFIC ASSEMBLING OF COMPONENTS COMPLETED");
    }

    @Override
    public String toString() {
        return "IntelI5Motherboard{" + super.toString() + "}";
    }
}
