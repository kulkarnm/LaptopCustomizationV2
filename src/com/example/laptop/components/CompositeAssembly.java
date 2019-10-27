package com.example.laptop.components;

import com.example.laptop.visitor.IVisitor;

import java.util.*;

//Composite Child of Assembly Component - Composite Design Pattern
public class CompositeAssembly implements AssemblyComponent {
    private HashMap<ASSEMBLYCOMPONENTTYPE, AssemblyComponent> assemblyComponentMap;
    private ASSEMBLYCOMPONENTTYPE type;
    private List<ASSEMBLYCOMPONENTTYPE> associatedComponentTypes;
    private double cost;


    public CompositeAssembly(ASSEMBLYCOMPONENTTYPE ASSEMBLYCOMPONENTTYPE, List<ASSEMBLYCOMPONENTTYPE> associatedComponentTypes) {
        assemblyComponentMap = new HashMap<>();
        this.type = ASSEMBLYCOMPONENTTYPE;
        this.associatedComponentTypes=associatedComponentTypes;
    }

    public void addToAssembly(AssemblyComponent componentTobeAdded) {
        if(this.isComponentTypeSupportedByAssembly(componentTobeAdded.getType())){
            this.assemblyComponentMap.put(componentTobeAdded.getType(), componentTobeAdded);
            this.cost += componentTobeAdded.getCost();
        }else{
            Set<ASSEMBLYCOMPONENTTYPE> types = assemblyComponentMap.keySet();
            for (ASSEMBLYCOMPONENTTYPE type : types) {
                AssemblyComponent component = assemblyComponentMap.get(type);
                if (component instanceof CompositeAssembly) {
                    ((CompositeAssembly) component).addToAssembly(componentTobeAdded);
                }
            }
        }
    }

    boolean isComponentTypeSupportedByAssembly(ASSEMBLYCOMPONENTTYPE type){
        return this.associatedComponentTypes.stream().anyMatch(act-> act == type);
    }
    public void removeFromAssembly(AssemblyComponent componentTobeRemoved) {
        Set<ASSEMBLYCOMPONENTTYPE> types = assemblyComponentMap.keySet();
        boolean found=false;
        for (ASSEMBLYCOMPONENTTYPE type : types) {
            AssemblyComponent component = assemblyComponentMap.get(type);
            if (type == componentTobeRemoved.getType()) {
                found = true;
                break;
            }
            else if (component instanceof CompositeAssembly) {
                ((CompositeAssembly) component).removeFromAssembly(componentTobeRemoved);
            }
        }
        if(found == true) {
            assemblyComponentMap.remove(type);
            this.removeCost(componentTobeRemoved.getCost());
        }
    }

    public void addCost(double amount){
        this.cost +=amount;
    }
    public void removeCost(double amount){
        this.cost -=amount;
    }
    public AssemblyComponent findByComponentType(ASSEMBLYCOMPONENTTYPE ASSEMBLYCOMPONENTTYPE) {
        Set<ASSEMBLYCOMPONENTTYPE> types = assemblyComponentMap.keySet();
        AssemblyComponent compoFound = null;
        for (ASSEMBLYCOMPONENTTYPE type : types) {
            AssemblyComponent component = assemblyComponentMap.get(type);
            if (type == ASSEMBLYCOMPONENTTYPE) {
                compoFound = component;
            }
            if (component instanceof CompositeAssembly) {
                compoFound = ((CompositeAssembly) component).findByComponentType(ASSEMBLYCOMPONENTTYPE);
            }
            if (compoFound != null) {
                return compoFound;
            }
        }
        return null;
    }

    @Override
    public ASSEMBLYCOMPONENTTYPE getType() {
        return type;
    }

    @Override
    public ASSEMBLYCOMPONENTTYPE getFamily() {
        return type;
    }

    @Override
    public BUDGETCATEGORY getBudgetcategory() {
        return this.assemblyComponentMap.values().iterator().next().getBudgetcategory();
    }

    @Override
    public String getComponentIdentifier() {
        return null;
    }

    public double getCost() {
        double cost = 0;
        for (AssemblyComponent component : assemblyComponentMap.values()) {
            cost += component.getCost();
        }
        return cost;
    }

    @Override
    public boolean isAssemblyComponentSupported(AssemblyComponent assemblyComponentTobeReplaced){
        Collection<AssemblyComponent> children =  this.assemblyComponentMap.values();
        for(AssemblyComponent component : children){
            if(!component.isAssemblyComponentSupported(assemblyComponentTobeReplaced)){
                return false;
            }
        }
        return true;
    }

    @Override
    public List<AssemblyComponent> findCompatibleAssemblyComponentsByFamilyAndByBudget(ASSEMBLYCOMPONENTTYPE family, BUDGETCATEGORY budget){
        Collection<AssemblyComponent> children =  this.assemblyComponentMap.values();
        List<AssemblyComponent> compatibleComponentsList = new ArrayList<>();
        for(AssemblyComponent component : children){
            compatibleComponentsList.addAll(component.findCompatibleAssemblyComponentsByFamilyAndByBudget(family,budget));
        }
        return compatibleComponentsList;
    }
    public void assemble() {
        System.out.println(":::Assmebly of " + this.type + " initiated:::");
        for (AssemblyComponent component : assemblyComponentMap.values()) {
            component.assemble();
        }
        System.out.println(":::Assmebly of " + this.type + " completed:::");
    }

/*
    @Override
    public void registerCompatibility() {
        //do nothing
    }
*/

    @Override
    public void accept(IVisitor visitor) {
        for (AssemblyComponent component : assemblyComponentMap.values()) {
            component.accept(visitor);
        }
    }
}
