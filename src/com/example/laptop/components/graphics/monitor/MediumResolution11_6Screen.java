package com.example.laptop.components.graphics.monitor;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.BUDGETCATEGORY;

public class MediumResolution11_6Screen extends AbstractScreen{

    public MediumResolution11_6Screen(ASSEMBLYCOMPONENTTYPE type, double cost, ScreenSpecification specification) {
        super("MediumResolution11_6Screen",type, BUDGETCATEGORY.MEDIUM,cost,specification,ASSEMBLYCOMPONENTTYPE.GRAPHICS_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("Medium resolution 11X6 screen assmebly done");
    }

}
