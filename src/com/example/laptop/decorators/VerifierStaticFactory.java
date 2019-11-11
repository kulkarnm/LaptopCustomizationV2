package com.example.laptop.decorators;

import com.example.laptop.components.AssemblyComponent;
//static factory
public class VerifierStaticFactory {

    public static AssemblyComponentVerifier createVerifier(AssemblyComponent wrappyComponent) {
        AssemblyComponentVerifier verifier = null;
        switch (wrappyComponent.getType()) {
            case MOTHERBOARD_CPU:
                verifier = new CPUPreTestVerifier();
                break;
            case MOTHERBOARD:
                verifier = new MotherboardPreTestVerifier();
                break;
            case MOTHERBOARD_RAM:
                verifier = new RAMPreTestVerifier();
                break;
            case GRAPHICS_CARD:
                verifier = new GraphicsCardPreTestVerifier();
                break;
            case GRAPHICS_SCREEN:
                verifier = new ScreenPreTestVerifier();
                break;
            case POWER_BATTERY:
                verifier = new BatteryPreTestVerifier();
                break;
            case POWER_AC_ADAPTER:
                verifier = new AdapterPreTestVerifier();
                break;
            case STORAGE_HARD_DISC:
                verifier = new HDDPreTestVerifier();

        }
        return verifier;
    }

} 
