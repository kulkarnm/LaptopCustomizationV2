package com.example.laptop.components.power.adapter;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class V220Amp15Adapter extends AbstractPowerAdapter  {
    public V220Amp15Adapter(ASSEMBLYCOMPONENTTYPE type, double cost, AdapterSpecification specification) {
        super("V220Amp15Adapter",type, BUDGETCATEGORY.LOW_TO_MEDIUM, cost, specification,ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("V 220, 15 Amp Power adapter assembled");
    }

    @Override
    public String toString() {
        return "V220Amp15Adapter{" + super.toString() + " }" ;
    }
}
