package com.example.laptop.components.motherboard.memory;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class PNYAnarchyBlue2X extends AbstractRAM {
    public PNYAnarchyBlue2X(ASSEMBLYCOMPONENTTYPE type, double cost, RAMSpecification specification) {
        super("PNYAnarchyBlue2X",type, BUDGETCATEGORY.LOW,cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    public void assemble(){
        System.out.println("PNY Anarchy Blue MOTHERBOARD_RAM assembly done");
    }

    @Override
    public String toString() {
        return "PNYAnarchyBlue2X {" + super.toString() + "}";
    }
}
