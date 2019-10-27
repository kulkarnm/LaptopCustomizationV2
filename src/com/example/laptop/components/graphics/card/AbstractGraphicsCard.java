package com.example.laptop.components.graphics.card;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.registry.AssemblyComponentRegistryRecord;
import com.example.laptop.visitor.IVisitor;

public abstract class AbstractGraphicsCard implements GraphicsCard {
    private String componentIdentifier;
    protected ASSEMBLYCOMPONENTTYPE type;
    private ASSEMBLYCOMPONENTTYPE family;
    private BUDGETCATEGORY budgetcategory;
    protected double cost;
    protected GraphicsSpecification specification;

    public AbstractGraphicsCard(String componentIdentifier, ASSEMBLYCOMPONENTTYPE type,BUDGETCATEGORY budgetcategory,  double cost, GraphicsSpecification specification,ASSEMBLYCOMPONENTTYPE family) {
        this.componentIdentifier = componentIdentifier;
        this.type = type;
        this.budgetcategory = budgetcategory;
        this.cost = cost;
        this.specification = specification;
        this.family = family;
        this.registerComponent(new AssemblyComponentRegistryRecord(type,budgetcategory,componentIdentifier,family));
    }

    @Override
    public GraphicsSpecification getSpecification() {
        return specification;
    }


    @Override
    public ASSEMBLYCOMPONENTTYPE getType() {
        return type;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getComponentIdentifier() {
        return componentIdentifier;
    }

    public BUDGETCATEGORY getBudgetcategory() {
        return budgetcategory;
    }

    @Override
    public ASSEMBLYCOMPONENTTYPE getFamily() {
        return family;
    }

    @Override
    public AssemblyComponent findByComponentType(ASSEMBLYCOMPONENTTYPE ASSEMBLYCOMPONENTTYPE){ return null;}

    @Override
    public String toString() {
        return "AbstractGraphicsCard{" +
                "componentIdentifier='" + componentIdentifier + '\'' +
                ", type=" + type +
                ", budgetcategory=" + budgetcategory +
                ", cost=" + cost +
                ", specification=" + specification +
                '}';
    }
}
