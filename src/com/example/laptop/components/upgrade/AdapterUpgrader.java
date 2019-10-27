package com.example.laptop.components.upgrade;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.inventory.ComponentInventory;

import java.util.List;


public class AdapterUpgrader implements AssemblyUpgrader {
    private AssemblyUpgrader assemblyUpgrader;

    public AssemblyUpgrader setNext(AssemblyUpgrader assemblyUpgrader) {
        this.assemblyUpgrader = assemblyUpgrader;
        return this;
    }

    @Override
    public AssemblyComponent upgrade(UpgradeRequest request, AssemblyComponent assemblyComponentTobeUpgraded) {
        AssemblyComponent existingComponentInAssembly = assemblyComponentTobeUpgraded.findByComponentType(ASSEMBLYCOMPONENTTYPE.POWER_AC_ADAPTER);
        AssemblyComponent replacingComponent = ComponentInventory.getInstance().findByComponentIdentifier(request.getComponentId());
        boolean isCompatible = replacingComponent.isAssemblyComponentSupported(existingComponentInAssembly);

        if (request.componentType == ASSEMBLYCOMPONENTTYPE.POWER_AC_ADAPTER) {
            assemblyComponentTobeUpgraded.removeFromAssembly(existingComponentInAssembly);
            assemblyComponentTobeUpgraded.addToAssembly(replacingComponent);
            //No next component
        } else if (!isCompatible) {
            List<AssemblyComponent> compatibleComponents = replacingComponent.findCompatibleAssemblyComponentsByFamilyAndByBudget(ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY, existingComponentInAssembly.getBudgetcategory());
            replacingComponent = compatibleComponents.stream().filter(cc -> cc.getType() == ASSEMBLYCOMPONENTTYPE.POWER_AC_ADAPTER).findFirst().get();
            assemblyComponentTobeUpgraded.removeFromAssembly(existingComponentInAssembly);
            assemblyComponentTobeUpgraded.addToAssembly(replacingComponent);
        }
        if (null != assemblyUpgrader) {
            return assemblyUpgrader.upgrade(request, assemblyComponentTobeUpgraded);
        }

        return assemblyComponentTobeUpgraded;
    }

}

