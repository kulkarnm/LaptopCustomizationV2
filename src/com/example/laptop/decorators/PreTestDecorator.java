package com.example.laptop.decorators;

import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.visitor.IVisitable;
import com.example.laptop.visitor.IVisitor;

public class PreTestDecorator implements IVisitor {

    @Override
    public void visit(IVisitable visitable) {
        AssemblyComponentVerifier verifier = VerifierStaticFactory.createVerifier((AssemblyComponent)visitable);
        if(null != verifier) {
            boolean testPassed = verifier.qualityCheck((AssemblyComponent) visitable);
            if (testPassed) {
//            super.assemble();
            } else {
                throw new RuntimeException("Quality Check Failed : " + ((AssemblyComponent) visitable).getComponentIdentifier());
            }
        }
    }
}
