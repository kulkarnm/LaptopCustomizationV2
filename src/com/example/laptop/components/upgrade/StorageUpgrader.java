package com.example.laptop.components.upgrade;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.inventory.ComponentInventory;

import java.util.List;

public class StorageUpgrader implements AssemblyUpgrader {
    private AssemblyUpgrader assemblyUpgrader;
    public AssemblyUpgrader setNext(AssemblyUpgrader assemblyUpgrader){
        this.assemblyUpgrader = assemblyUpgrader;
        return this.assemblyUpgrader;
    }

    @Override
    public AssemblyComponent upgrade(UpgradeRequest request, AssemblyComponent assemblyComponentTobeUpgraded) {
        AssemblyComponent existingComponentInAssembly = assemblyComponentTobeUpgraded.findByComponentType(ASSEMBLYCOMPONENTTYPE.STORAGE_HARD_DISC);
        AssemblyComponent replacingComponent = ComponentInventory.getInstance().findByComponentIdentifier(request.getComponentId());
        boolean isCompatible = replacingComponent.isAssemblyComponentSupported(existingComponentInAssembly);

        if (request.componentType == ASSEMBLYCOMPONENTTYPE.STORAGE_HARD_DISC ) {
            assemblyComponentTobeUpgraded.removeFromAssembly(existingComponentInAssembly);
            assemblyComponentTobeUpgraded.addToAssembly(replacingComponent);
        } else if (! isCompatible){
            List<AssemblyComponent> compatibleComponents = replacingComponent.findCompatibleAssemblyComponentsByFamilyAndByBudget(ASSEMBLYCOMPONENTTYPE.STORAGE_ASSEMBLY, existingComponentInAssembly.getBudgetcategory());
            replacingComponent = compatibleComponents.stream().filter(cc -> cc.getType() == ASSEMBLYCOMPONENTTYPE.STORAGE_HARD_DISC).findFirst().get();
            assemblyComponentTobeUpgraded.removeFromAssembly(existingComponentInAssembly);
            assemblyComponentTobeUpgraded.addToAssembly(replacingComponent);
        }
        if (null != assemblyUpgrader) {
            return assemblyUpgrader.upgrade(request, assemblyComponentTobeUpgraded);
        }
        return assemblyComponentTobeUpgraded;
    }

}
