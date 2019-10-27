package com.example.laptop.components.power.adapter;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class V240Amp15Adapter extends AbstractPowerAdapter  {
    public V240Amp15Adapter(ASSEMBLYCOMPONENTTYPE type, double cost, AdapterSpecification specification) {
        super("V240Amp15Adapter",type, BUDGETCATEGORY.MEDIUM, cost, specification,ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY);
    }
    @Override
    public void assemble() {
        System.out.println("V 240, 15 Amp Power adapter assembled");
    }


    @Override
    public String toString() {
        return "V240Amp15Adapter{" + super.toString() + " }" ;
    }
}
