package com.example.laptop.components.power.adapter;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class V260Amp15Adapter extends AbstractPowerAdapter  {
    public V260Amp15Adapter(ASSEMBLYCOMPONENTTYPE type, double cost, AdapterSpecification specification) {
        super("V260Amp15Adapter",type, BUDGETCATEGORY.HIGH, cost, specification,ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY);
    }
    @Override
    public void assemble() {
        System.out.println("V 260, 15 Amp Power adapter assembled");
    }

    @Override
    public String toString() {
        return "V260Amp15Adapter{" + super.toString() + " }" ;
    }
}
