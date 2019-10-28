package com.example.laptop.decorators;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.visitor.IVisitor;

public class AssemblyComponentBaseDecorator implements AssemblyComponent {
    protected AssemblyComponent wrappyComponent;

    public AssemblyComponentBaseDecorator(AssemblyComponent wrappyComponent) {
        this.wrappyComponent = wrappyComponent;
    }

    @Override
    public String getComponentIdentifier() {
        return wrappyComponent.getComponentIdentifier();
    }

    @Override
    public ASSEMBLYCOMPONENTTYPE getType() {
        return wrappyComponent.getType();
    }

    @Override
    public ASSEMBLYCOMPONENTTYPE getFamily() {
        return wrappyComponent.getFamily();
    }

    @Override
    public BUDGETCATEGORY getBudgetcategory() {
        return wrappyComponent.getBudgetcategory();
    }

    @Override
    public double getCost() {
        return wrappyComponent.getCost();
    }

    @Override
    public AssemblyComponent findByComponentType(ASSEMBLYCOMPONENTTYPE ASSEMBLYCOMPONENTTYPE) {
        return wrappyComponent.findByComponentType(ASSEMBLYCOMPONENTTYPE);
    }

    @Override
    public void assemble() {
        wrappyComponent.assemble();
    }

    @Override
    public void accept(IVisitor visitor) {
        wrappyComponent.accept(visitor);
    }
}