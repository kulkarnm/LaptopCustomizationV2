package com.example.laptop.components.motherboard.cpu;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class IntelI5 extends AbstractCPU {
    public IntelI5(ASSEMBLYCOMPONENTTYPE type, double cost, CPUSpecification specification) {
        super("IntelI5",type, BUDGETCATEGORY.MEDIUM, cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("Intel I5 specific assembly of MOTHERBOARD_CPU is done");
    }

    @Override
    public String toString() {
        return "IntelI5{ " + super.toString() + "}";
    }
}
