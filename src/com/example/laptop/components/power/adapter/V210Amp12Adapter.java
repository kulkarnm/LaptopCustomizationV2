package com.example.laptop.components.power.adapter;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class V210Amp12Adapter extends AbstractPowerAdapter {
    public V210Amp12Adapter(ASSEMBLYCOMPONENTTYPE type, double cost, AdapterSpecification specification) {
        super("V210Amp12Adapter",type, BUDGETCATEGORY.LOW, cost, specification,ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("V 210, 12 Amp Power adapter assembled");
    }


    @Override
    public String toString() {
        return "V210Amp12Adapter{" + super.toString() + " }" ;
    }
}
