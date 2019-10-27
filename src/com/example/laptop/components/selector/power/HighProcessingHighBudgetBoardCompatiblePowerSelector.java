package com.example.laptop.components.selector.power;

import com.example.laptop.assemble.AssemblyTypeWiseIngredientsComposition;
import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.components.CompositeAssembly;
import com.example.laptop.components.selector.AssemblyComponentsFamilySelector;

import java.util.List;

public class HighProcessingHighBudgetBoardCompatiblePowerSelector implements AssemblyComponentsFamilySelector {
    public AssemblyComponent selectCompatibleAssemblyComponents(AssemblyComponent assemblyComponent){
        AssemblyComponent compositeAssembly = new CompositeAssembly(ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY, AssemblyTypeWiseIngredientsComposition.selectComponentTypes(ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY));
        List<AssemblyComponent> compatibleComponents = assemblyComponent.findCompatibleAssemblyComponentsByFamilyAndByBudget(ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY,BUDGETCATEGORY.HIGH);
        for(AssemblyComponent compatibleComponent: compatibleComponents){
            compositeAssembly.addToAssembly(compatibleComponent);
        }

        return compositeAssembly;
    }

} 
