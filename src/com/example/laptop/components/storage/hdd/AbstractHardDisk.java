package com.example.laptop.components.storage.hdd;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.registry.AssemblyComponentRegistryRecord;
import com.example.laptop.visitor.IVisitor;

public abstract class AbstractHardDisk  implements HardDisk{
    private String componentIdentifier;
    private ASSEMBLYCOMPONENTTYPE type;
    private ASSEMBLYCOMPONENTTYPE family;
    private BUDGETCATEGORY budgetcategory;
    private double cost;
    private HDDSpecification specification;

    public AbstractHardDisk(String componentIdentifier, ASSEMBLYCOMPONENTTYPE type,BUDGETCATEGORY budgetcategory,  double cost, HDDSpecification specification,ASSEMBLYCOMPONENTTYPE family) {
        this.componentIdentifier = componentIdentifier;
        this.type = type;
        this.family=family;
        this.budgetcategory =budgetcategory;
        this.cost = cost;
        this.specification = specification;
        this.registerComponent(new AssemblyComponentRegistryRecord(type,budgetcategory,componentIdentifier,family));
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
    public HDDSpecification getSpecification() {
        return specification;
    }

    @Override
    public void accept(IVisitor visitor){
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
    public void removeFromAssembly(AssemblyComponent componentTobeRemoved) {

    }

    @Override
    public void addToAssembly(AssemblyComponent componentTobeAdded) {

    }

    @Override
    public String toString() {
        return "AbstractHardDisk{" +
                "componentIdentifier='" + componentIdentifier + '\'' +
                ", type=" + type +
                ", budgetcategory=" + budgetcategory +
                ", cost=" + cost +
                ", specification=" + specification +
                '}';
    }
}
