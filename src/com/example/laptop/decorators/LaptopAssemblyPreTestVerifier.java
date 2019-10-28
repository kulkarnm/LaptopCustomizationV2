package com.example.laptop.decorators;

import com.example.laptop.components.AssemblyComponent;

public class LaptopAssemblyPreTestVerifier implements AssemblyComponentVerifier{

    public boolean qualityCheck(AssemblyComponent wrappyComponent){
        System.out.println("^^^^^^^^^ 3 point quality check initiated for Laptop");
        System.out.println("^^^^^^^^^ 3 point quality check completed for Laptop");
        return true;
    }
}
