package com.example.laptop.decorators;

import com.example.laptop.components.AssemblyComponent;

public class PreTestDecorator extends AssemblyComponentBaseDecorator {
    public PreTestDecorator(AssemblyComponent wrappyComponent) {
        super(wrappyComponent);
    }

    @Override
    public void assemble() {
        AssemblyComponentVerifier verifier = VerifierStaticFactory.createVerifier(wrappyComponent);
        boolean  testPassed = verifier.qualityCheck(wrappyComponent);
        if(testPassed) {
            super.assemble();
        }else{
            throw new RuntimeException("Quality Check Failed : " + wrappyComponent.getComponentIdentifier());
        }
    }
} 
