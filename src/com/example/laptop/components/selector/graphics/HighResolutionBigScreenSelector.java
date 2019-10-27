package com.example.laptop.components.selector.graphics;

import com.example.laptop.assemble.AssemblyTypeWiseIngredientsComposition;
import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.components.CompositeAssembly;
import com.example.laptop.components.selector.AssemblyComponentsFamilySelector;
import com.example.laptop.inventory.ComponentInventory;

import java.util.List;

public class HighResolutionBigScreenSelector implements AssemblyComponentsFamilySelector {

    public AssemblyComponent selectCompatibleAssemblyComponents(AssemblyComponent assemblyComponent){
        ComponentInventory componentInventory = ComponentInventory.getInstance();
        AssemblyComponent compositeAssembly = new CompositeAssembly(ASSEMBLYCOMPONENTTYPE.GRAPHICS_ASSEMBLY, AssemblyTypeWiseIngredientsComposition.selectComponentTypes(ASSEMBLYCOMPONENTTYPE.GRAPHICS_ASSEMBLY));
        List<AssemblyComponent> compatibleComponents = assemblyComponent.findCompatibleAssemblyComponentsByFamilyAndByBudget(ASSEMBLYCOMPONENTTYPE.GRAPHICS_ASSEMBLY,BUDGETCATEGORY.HIGH);
        for(AssemblyComponent compatibleComponent: compatibleComponents){
            compositeAssembly.addToAssembly(compatibleComponent);
        }

        return compositeAssembly;
    }
}
