package com.example.laptop.components.upgrade;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.inventory.ComponentInventory;

import java.util.List;

public class GraphicsCardUpgrader implements AssemblyUpgrader {
    private AssemblyUpgrader assemblyUpgrader;
    public AssemblyUpgrader setNext(AssemblyUpgrader assemblyUpgrader){
        this.assemblyUpgrader = assemblyUpgrader;
        return this.assemblyUpgrader;
    }

    @Override
    public AssemblyComponent upgrade(UpgradeRequest request, AssemblyComponent assemblyComponentTobeUpgraded) {
        AssemblyComponent existingComponentInAssembly = assemblyComponentTobeUpgraded.findByComponentType(ASSEMBLYCOMPONENTTYPE.GRAPHICS_CARD);
        AssemblyComponent replacingComponent = ComponentInventory.getInstance().findByComponentIdentifier(request.getComponentId());
        boolean isCompatible = replacingComponent.isAssemblyComponentSupported(existingComponentInAssembly);
        if (request.componentType == ASSEMBLYCOMPONENTTYPE.GRAPHICS_CARD) {
            assemblyComponentTobeUpgraded.removeFromAssembly(existingComponentInAssembly);
            assemblyComponentTobeUpgraded.addToAssembly(replacingComponent);
        } else if(! isCompatible){
            List<AssemblyComponent> compatibleComponents = replacingComponent.findCompatibleAssemblyComponentsByFamilyAndByBudget(ASSEMBLYCOMPONENTTYPE.GRAPHICS_ASSEMBLY, existingComponentInAssembly.getBudgetcategory());
            replacingComponent = compatibleComponents.stream().filter(cc -> cc.getType() == ASSEMBLYCOMPONENTTYPE.GRAPHICS_CARD).findFirst().get();
            assemblyComponentTobeUpgraded.removeFromAssembly(existingComponentInAssembly);
            assemblyComponentTobeUpgraded.addToAssembly(replacingComponent);
        }
        if (null != assemblyUpgrader) {
            return assemblyUpgrader.upgrade(request, assemblyComponentTobeUpgraded);
        }
        return assemblyComponentTobeUpgraded;
    }
}
