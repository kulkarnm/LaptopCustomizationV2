package com.example.laptop.components.graphics.monitor;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class HighResolution15_4Screen extends AbstractScreen {

    public HighResolution15_4Screen(ASSEMBLYCOMPONENTTYPE type, double cost, ScreenSpecification specification) {
        super("HighResolution15_4Screen",type, BUDGETCATEGORY.HIGH,cost,specification,ASSEMBLYCOMPONENTTYPE.GRAPHICS_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("High resolution 15X4 screen assmebly done");
    }
}
