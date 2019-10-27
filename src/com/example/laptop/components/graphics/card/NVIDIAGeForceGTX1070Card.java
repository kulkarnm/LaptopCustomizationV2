package com.example.laptop.components.graphics.card;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class NVIDIAGeForceGTX1070Card extends AbstractGraphicsCard {

    public NVIDIAGeForceGTX1070Card(ASSEMBLYCOMPONENTTYPE type, double cost, GraphicsSpecification specification) {
        super("NVIDIAGeForceGTX1070Card",type, BUDGETCATEGORY.MEDIUM, cost, specification,ASSEMBLYCOMPONENTTYPE.GRAPHICS_ASSEMBLY);
    }

    public void assemble() {
        System.out.println("NVIDIA GeForce GTX 1070 Card specific assembly process is executed");
    }

    @Override
    public String toString() {
        return "NVIDIAGeForceGTX1070Card{" + super.toString() + "}";
    }
}
