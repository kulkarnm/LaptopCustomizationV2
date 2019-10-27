package com.example.laptop.components.motherboard.board;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class IntelI7Motherboard extends AbstractMotherBoard {
    public IntelI7Motherboard(ASSEMBLYCOMPONENTTYPE type, double cost, MotherboardSpecification specification) {
        super("IntelI7Motherboard",type, BUDGETCATEGORY.HIGH,cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    public void assemble() {
        System.out.println("INTEL I7 SPECIFIC ASSEMBLING OF COMPONENTS COMPLETED");
    }

    @Override
    public String toString() {
        return "IntelI7Motherboard{" + super.toString() + "}";
    }

}
