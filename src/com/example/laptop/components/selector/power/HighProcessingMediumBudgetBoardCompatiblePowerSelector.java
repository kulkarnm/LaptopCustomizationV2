package com.example.laptop.components.selector.power;

import com.example.laptop.assemble.AssemblyTypeWiseIngredientsComposition;
import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.components.CompositeAssembly;
import com.example.laptop.components.selector.AssemblyComponentsFamilySelector;
import com.example.laptop.inventory.ComponentInventory;

import java.util.List;

public class HighProcessingMediumBudgetBoardCompatiblePowerSelector implements AssemblyComponentsFamilySelector {
    public AssemblyComponent selectCompatibleAssemblyComponents(AssemblyComponent assemblyComponent){
        ComponentInventory componentInventory = ComponentInventory.getInstance();
        AssemblyComponent compositeAssembly = new CompositeAssembly(ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY, AssemblyTypeWiseIngredientsComposition.selectComponentTypes(ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY));
        List<AssemblyComponent> compatibleComponents = assemblyComponent.findCompatibleAssemblyComponentsByFamilyAndByBudget(ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY,BUDGETCATEGORY.MEDIUM);
        for(AssemblyComponent compatibleComponent: compatibleComponents){
            compositeAssembly.addToAssembly(compatibleComponent);
        }

        return compositeAssembly;
    }
}
