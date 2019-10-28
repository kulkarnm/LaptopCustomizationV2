package com.example.laptop.decorators;

import com.example.laptop.components.AssemblyComponent;

public class PostTestDecorator extends AssemblyComponentBaseDecorator {
    public PostTestDecorator(AssemblyComponent wrappyComponent) {
        super(wrappyComponent);
    }

    @Override
    public void assemble() {
        AssemblyComponentVerifier verifier = new LaptopAssemblyPreTestVerifier();
        super.assemble();
        boolean testPassed = verifier.qualityCheck(wrappyComponent);
        if (!testPassed) {
            throw new RuntimeException("Quality Check Failed : " + wrappyComponent.getComponentIdentifier());
        }
    }
} 
