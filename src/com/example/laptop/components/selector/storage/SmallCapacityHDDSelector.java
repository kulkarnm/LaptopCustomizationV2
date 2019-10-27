package com.example.laptop.components.selector.storage;

import com.example.laptop.assemble.AssemblyTypeWiseIngredientsComposition;
import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.components.CompositeAssembly;
import com.example.laptop.components.selector.AssemblyComponentsFamilySelector;

import java.util.List;

public class SmallCapacityHDDSelector implements AssemblyComponentsFamilySelector {
    public AssemblyComponent selectCompatibleAssemblyComponents(AssemblyComponent assemblyComponent){
        AssemblyComponent compositeAssembly = new CompositeAssembly(ASSEMBLYCOMPONENTTYPE.STORAGE_ASSEMBLY, AssemblyTypeWiseIngredientsComposition.selectComponentTypes(ASSEMBLYCOMPONENTTYPE.STORAGE_ASSEMBLY));
        //List<AssemblyComponent> compatibleComponents = componentInventory.findCompatibleAssemblyComponentsByFamily(assemblyComponent,ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY);
        List<AssemblyComponent> compatibleComponents = assemblyComponent.findCompatibleAssemblyComponentsByFamilyAndByBudget(ASSEMBLYCOMPONENTTYPE.STORAGE_ASSEMBLY,BUDGETCATEGORY.LOW);
        for(AssemblyComponent compatibleComponent: compatibleComponents){
            compositeAssembly.addToAssembly(compatibleComponent);
        }
        return compositeAssembly;
    }
}
