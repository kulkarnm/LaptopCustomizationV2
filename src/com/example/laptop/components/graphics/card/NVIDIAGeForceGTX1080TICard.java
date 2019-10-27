package com.example.laptop.components.graphics.card;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class NVIDIAGeForceGTX1080TICard extends AbstractGraphicsCard {

    public NVIDIAGeForceGTX1080TICard(ASSEMBLYCOMPONENTTYPE type, double cost, GraphicsSpecification specification) {
        super("NVIDIAGeForceGTX1080TICard",type, BUDGETCATEGORY.HIGH,cost, specification,ASSEMBLYCOMPONENTTYPE.GRAPHICS_ASSEMBLY);
    }

    public void assemble() {
        System.out.println("NVIDIA GeForce GTX 1080 Ti Card specific assembly process is executed");
    }

    @Override
    public String toString() {
        return "NVIDIAGeForceGTX1080TICard{" +
                super.toString() +
                "}";
    }

}
