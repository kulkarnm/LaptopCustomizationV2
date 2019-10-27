package com.example.laptop.components.motherboard.cpu;


import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class AMDRyzen3 extends AbstractCPU {
    public AMDRyzen3(ASSEMBLYCOMPONENTTYPE type, double cost, CPUSpecification specification) {
        super("AMDRyzen3",type,BUDGETCATEGORY.LOW, cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("AMD Ryzen 3 specific assembly of MOTHERBOARD_CPU is done");
    }

    @Override
    public String toString() {
        return "AMDRyzen3{ " + super.toString() + "}";
    }
}
