package com.example.laptop.components.motherboard.cpu;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class AMDRyzen7 extends AbstractCPU {
    public AMDRyzen7(ASSEMBLYCOMPONENTTYPE type, double cost, CPUSpecification specification) {
        super("AMDRyzen7",type, BUDGETCATEGORY.HIGH, cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("AMD Ryzen 7 specific assembly of MOTHERBOARD_CPU is done");
    }

    @Override
    public String toString() {
        return "AMDRyzen7{ " + super.toString() + "}";
    }
}
