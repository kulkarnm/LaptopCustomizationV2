package com.example.laptop.components.motherboard.cpu;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class IntelI7 extends AbstractCPU {
    public IntelI7(ASSEMBLYCOMPONENTTYPE type, double cost, CPUSpecification specification) {
        super("IntelI7",type, BUDGETCATEGORY.HIGH, cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("Intel I7 specific assembly of MOTHERBOARD_CPU is done");
    }

    @Override
    public String toString() {
        return "IntelI7 { " + super.toString() + "}";
    }

}
