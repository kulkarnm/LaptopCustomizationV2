package com.example.laptop.components;

import com.example.laptop.inventory.ComponentInventory;
import com.example.laptop.registry.AssemblyComponentRegistryRecord;
import com.example.laptop.registry.ComponentsRegistry;
import com.example.laptop.visitor.IVisitable;

import java.util.ArrayList;
import java.util.List;

//Parent interface - Composite Design pattern
public interface AssemblyComponent extends IVisitable{
    String getComponentIdentifier();
    ASSEMBLYCOMPONENTTYPE getType();
    ASSEMBLYCOMPONENTTYPE getFamily();
    BUDGETCATEGORY getBudgetcategory();
    double getCost();

    AssemblyComponent findByComponentType(ASSEMBLYCOMPONENTTYPE ASSEMBLYCOMPONENTTYPE);
    void assemble();

    default void registerComponent(AssemblyComponentRegistryRecord assemblyComponentRegistryRecord){
        ComponentsRegistry componentsRegistry = ComponentsRegistry.getInstance();
        componentsRegistry.registerComponent(assemblyComponentRegistryRecord);
    }

    default void registerCompatibility(AssemblyComponent component){
        ComponentsRegistry componentsRegistry = ComponentsRegistry.getInstance();
        AssemblyComponentRegistryRecord thisComponentRecord = componentsRegistry.findByComponentId(this.getComponentIdentifier());
        AssemblyComponentRegistryRecord newComponentRecord = componentsRegistry.findByComponentId(component.getComponentIdentifier());
        thisComponentRecord.registerCompatibleComponent(newComponentRecord);
        newComponentRecord.registerCompatibleComponent(thisComponentRecord);
    }
    default boolean isAssemblyComponentSupported(AssemblyComponent assemblyComponentTobeReplaced){
        ComponentsRegistry registry = ComponentsRegistry.getInstance();
        AssemblyComponentRegistryRecord thisComponent = registry.findByComponentId(this.getComponentIdentifier());
        AssemblyComponentRegistryRecord assemblyComponentTobeReplacedRecord = registry.findByComponentId(assemblyComponentTobeReplaced.getComponentIdentifier());
        return thisComponent.isComponentCompatible(assemblyComponentTobeReplacedRecord);
    }

    default List<AssemblyComponent> findCompatibleAssemblyComponentsByFamilyAndByBudget(ASSEMBLYCOMPONENTTYPE family, BUDGETCATEGORY budget){
        ComponentsRegistry componentsRegistry = ComponentsRegistry.getInstance();
        ComponentInventory componentInventory = ComponentInventory.getInstance();
        AssemblyComponentRegistryRecord assemblyComponentRegistryRecord = componentsRegistry.findByComponentId(this.getComponentIdentifier());
        List<AssemblyComponentRegistryRecord> compatibleComponentsRegistryRecords = assemblyComponentRegistryRecord.findCompatibleComponentsByFamilyAndByBudget(family,budget);
        List<AssemblyComponent> compatibleComponents = new ArrayList<>();
        for(AssemblyComponentRegistryRecord componentRegistryRecord: compatibleComponentsRegistryRecords){
            AssemblyComponent compatibleAssemblyComponent = componentInventory.findByComponentIdentifier(componentRegistryRecord.getComponentIdentifier());
            compatibleComponents.add(compatibleAssemblyComponent);
        }
        return compatibleComponents;
    }

    public default void addToAssembly(AssemblyComponent componentTobeAdded) {
        //do nothing
    }

    public default void removeFromAssembly(AssemblyComponent componentTobeRemoved) {
        //do nothing
    }
}
