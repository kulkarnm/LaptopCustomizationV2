package com.example.laptop.components.selector.motherboard;

import com.example.laptop.assemble.AssemblyTypeWiseIngredientsComposition;
import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.components.CompositeAssembly;
import com.example.laptop.components.selector.AssemblyComponentsFamilySelector;
import com.example.laptop.inventory.ComponentInventory;

import java.util.List;

public class LowProcessingMediumBudgetBoardSelector implements AssemblyComponentsFamilySelector {
    public AssemblyComponent selectCompatibleAssemblyComponents(AssemblyComponent assemblyComponent){
        ComponentInventory componentInventory = ComponentInventory.getInstance();
        AssemblyComponent compositeAssembly = new CompositeAssembly(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY, AssemblyTypeWiseIngredientsComposition.selectComponentTypes(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY));
        AssemblyComponent cpu = componentInventory.findByComponentIdentifier("IntelI3");
        compositeAssembly.addToAssembly(cpu);
        List<AssemblyComponent> compatibleComponents = cpu.findCompatibleAssemblyComponentsByFamilyAndByBudget(cpu.getFamily(),BUDGETCATEGORY.MEDIUM);
        for(AssemblyComponent compatibleComponent: compatibleComponents){
            compositeAssembly.addToAssembly(compatibleComponent);
        }

        return compositeAssembly;
    }

}
