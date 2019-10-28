package com.example.laptop.decorators;

import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.visitor.IVisitable;
import com.example.laptop.visitor.IVisitor;

public class RAMPreTestVerifier implements AssemblyComponentVerifier {
    public boolean qualityCheck(AssemblyComponent wrappyComponent){
        System.out.println("^^^^^^^^^ 3 point quality check initiated for : " + wrappyComponent.getComponentIdentifier());
        System.out.println("^^^^^^^^^ 3 point quality check completed for : " + wrappyComponent.getComponentIdentifier());
        return true;
    }

}
