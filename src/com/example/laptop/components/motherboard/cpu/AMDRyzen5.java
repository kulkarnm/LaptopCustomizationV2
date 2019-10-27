package com.example.laptop.components.motherboard.cpu;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class AMDRyzen5 extends AbstractCPU {
    public AMDRyzen5(ASSEMBLYCOMPONENTTYPE type, double cost, CPUSpecification specification) {
        super("AMDRyzen5",type, BUDGETCATEGORY.MEDIUM, cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("AMD Ryzen 5 specific assembly of MOTHERBOARD_CPU is done");
    }

    @Override
    public String toString() {
        return "AMDRyzen5{ " + super.toString() + "}";
    }
}
