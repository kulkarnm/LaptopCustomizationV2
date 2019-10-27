package com.example.laptop.components.graphics.card;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class NVIDIAGeForceGTX1060Card extends AbstractGraphicsCard {

    public NVIDIAGeForceGTX1060Card(ASSEMBLYCOMPONENTTYPE type, double cost, GraphicsSpecification specification) {
        super("NVIDIAGeForceGTX1060Card",type, BUDGETCATEGORY.LOW,cost, specification,ASSEMBLYCOMPONENTTYPE.GRAPHICS_ASSEMBLY);
    }

    public void assemble() {
        System.out.println("NVIDIA GeForce GTX 1060 Card specific assembly process is executed");
    }

    @Override
    public String toString() {
        return "NVIDIAGeForceGTX1060Card{" +
                super.toString() +
    "}";
    }

}
