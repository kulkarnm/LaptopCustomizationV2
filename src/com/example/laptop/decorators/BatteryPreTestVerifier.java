package com.example.laptop.decorators;

import com.example.laptop.components.AssemblyComponent;

public class BatteryPreTestVerifier implements AssemblyComponentVerifier{
    public boolean qualityCheck(AssemblyComponent wrappyComponent){
        System.out.println("^^^^^^^^^ 3 point quality check initiated for : " + wrappyComponent.getComponentIdentifier());
        System.out.println("^^^^^^^^^ 3 point quality check completed for : " + wrappyComponent.getComponentIdentifier());
        return true;
    }
}
