package com.example.laptop.components.motherboard.cpu;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class IntelI3 extends AbstractCPU {
    public IntelI3(ASSEMBLYCOMPONENTTYPE type, double cost, CPUSpecification specification) {
        super("IntelI3",type, BUDGETCATEGORY.LOW, cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("Intel I3 specific assembly of MOTHERBOARD_CPU is done");
    }

    @Override
    public String toString() {
        return "IntelI3{ " + super.toString() + "}";
    }
}
