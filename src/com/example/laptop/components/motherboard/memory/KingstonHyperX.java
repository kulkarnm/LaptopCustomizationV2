package com.example.laptop.components.motherboard.memory;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class KingstonHyperX extends AbstractRAM {
    public KingstonHyperX(ASSEMBLYCOMPONENTTYPE type, double cost, RAMSpecification specification) {
        super("KingstonHyperX",type, BUDGETCATEGORY.HIGH,cost, specification,ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
    }

    public void assemble(){
        System.out.println("Kingston HyperX MOTHERBOARD_RAM assembly done");
    }

    @Override
    public String toString() {
        return "KingstonHyperX {" + super.toString() + "}";
    }
}
