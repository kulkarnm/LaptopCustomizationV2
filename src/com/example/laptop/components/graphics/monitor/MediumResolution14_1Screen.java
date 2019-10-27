package com.example.laptop.components.graphics.monitor;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class MediumResolution14_1Screen extends AbstractScreen{
    public MediumResolution14_1Screen(ASSEMBLYCOMPONENTTYPE type, double cost, ScreenSpecification specification) {
        super("MediumResolution14_1Screen",type, BUDGETCATEGORY.LOW,cost,specification,ASSEMBLYCOMPONENTTYPE.GRAPHICS_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("Medium resolution 14X1 screen assmebly done");
    }

}
