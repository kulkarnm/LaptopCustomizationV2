package com.example.laptop.assemble;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.CompositeAssembly;
import com.example.laptop.components.selector.factory.AssemblyComponentsSelectorFactory;

import static com.example.laptop.components.ASSEMBLYCOMPONENTTYPE.LAPTOP;

public class AggregateAssembler {
    public AssemblyComponent buildAssembly(AssemblyComponentsSelectorFactory assemblyComponentsSelectorFactory){
        AssemblyComponent laptopAssembly = new CompositeAssembly(LAPTOP,AssemblyTypeWiseIngredientsComposition.selectComponentTypes(ASSEMBLYCOMPONENTTYPE.LAPTOP));
        AssemblyComponent motherboardFamilyAssembly = assemblyComponentsSelectorFactory.getAssemblyComponentsMotherboardFamilySelector().selectCompatibleAssemblyComponents(null);
        laptopAssembly.addToAssembly(motherboardFamilyAssembly);

        AssemblyComponent motherBoard = motherboardFamilyAssembly.findByComponentType(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD);
        laptopAssembly.addToAssembly(assemblyComponentsSelectorFactory.getAssemblyComponentsPowerFamilySelector().selectCompatibleAssemblyComponents(motherBoard));
        laptopAssembly.addToAssembly(assemblyComponentsSelectorFactory.getAssemblyComponentsGraphicsFamilySelector().selectCompatibleAssemblyComponents(motherBoard));
        laptopAssembly.addToAssembly(assemblyComponentsSelectorFactory.getAssemblyComponentsStorageFamilySelector().selectCompatibleAssemblyComponents(motherBoard));
        return laptopAssembly;
    }
    public void assemble(AssemblyComponent laptopAssembly){
        System.out.println("::::Laptop Assembly Initiated:::");
        laptopAssembly.assemble();
        System.out.println("::::Laptop Assembly Completed:::");
    }

    public void estimateCost(CompositeAssembly laptopAssembly){
        System.out.println("::::Laptop Cost estimate Initiated:::");
        double cost =0;
        laptopAssembly.getCost();
        System.out.println("::::Laptop Cost Estimate Completed; Total Estimate is: " + cost + ":::");

    }
}
