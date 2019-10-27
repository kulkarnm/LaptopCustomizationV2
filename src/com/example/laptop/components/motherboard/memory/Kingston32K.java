package com.example.laptop.components.motherboard.memory;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class Kingston32K extends AbstractRAM {
    public Kingston32K(ASSEMBLYCOMPONENTTYPE type, double cost, RAMSpecification specification) {
        super("Kingston32K",type, BUDGETCATEGORY.MEDIUM,cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    public void assemble(){
        System.out.println("Kingston 32 K MOTHERBOARD_RAM assembly done");
    }

    @Override
    public String toString() {
        return "Kingston32K{" + super.toString() + "}";
    }
}
