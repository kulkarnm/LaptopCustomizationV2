package com.example.laptop.registry;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AssemblyComponentRegistryRecord {
    private ASSEMBLYCOMPONENTTYPE assemblycomponenttype;
    private ASSEMBLYCOMPONENTTYPE family;
    private BUDGETCATEGORY budgetCategory;
    private String componentIdentifier;
    private List<AssemblyComponentRegistryRecord> compatibleComponents;

    public AssemblyComponentRegistryRecord(ASSEMBLYCOMPONENTTYPE assemblycomponenttype, BUDGETCATEGORY budgetCategory, String componentIdentifier, ASSEMBLYCOMPONENTTYPE family) {
        this.assemblycomponenttype = assemblycomponenttype;
        this.budgetCategory = budgetCategory;
        this.componentIdentifier = componentIdentifier;
        this.compatibleComponents = new ArrayList<>();
        this.family = family;
    }

/*
    public AssemblyComponentRegistryRecord clone(){
        return new AssemblyComponentRegistryRecord(this.getAssemblycomponenttype(),this.getBudgetCategory(),this.getComponentIdentifier(),this.getFamily());
    }
*/

    public void setCompatibleComponents(List<AssemblyComponentRegistryRecord> compatibleComponents) {
        this.compatibleComponents = compatibleComponents;
    }

    public void registerCompatibleComponent(AssemblyComponentRegistryRecord assemblyComponentRegistryRecord) {
        if(! this.compatibleComponents.contains(assemblyComponentRegistryRecord)) {
            this.compatibleComponents.add(assemblyComponentRegistryRecord);
        }
    }

    public ASSEMBLYCOMPONENTTYPE getAssemblycomponenttype() {
        return assemblycomponenttype;
    }

    public BUDGETCATEGORY getBudgetCategory() {
        return budgetCategory;
    }

    public String getComponentIdentifier() {
        return componentIdentifier;
    }

    public ASSEMBLYCOMPONENTTYPE getFamily() {
        return family;
    }

    public List<AssemblyComponentRegistryRecord> getCompatibleComponents() {
        return compatibleComponents;
    }

    public List<AssemblyComponentRegistryRecord> findCompatibleComponentsByFamily(ASSEMBLYCOMPONENTTYPE family) {
        return this.compatibleComponents.stream().filter(cc -> cc.getFamily() == family).collect(Collectors.toList());
    }

    public List<AssemblyComponentRegistryRecord> findCompatibleComponentsByFamilyAndByBudget(ASSEMBLYCOMPONENTTYPE family, BUDGETCATEGORY budget) {
        List<AssemblyComponentRegistryRecord> compatibleComponents = this.compatibleComponents.stream().filter(cc -> cc.getFamily() == family).collect(Collectors.toList());
        List<AssemblyComponentRegistryRecord> compatibleComponentsWithBudget = new ArrayList<>();

        for (AssemblyComponentRegistryRecord componentRegistryRecord : compatibleComponents) {
            boolean componentAlreadyAdded = compatibleComponentsWithBudget.stream().filter(ccb -> ccb.getAssemblycomponenttype() == componentRegistryRecord.getAssemblycomponenttype()).findAny().isPresent();
            if (!componentAlreadyAdded) {
                if (componentRegistryRecord.getBudgetCategory() == budget) {
                    compatibleComponentsWithBudget.add(componentRegistryRecord);
                } else {
                    //find the matching component of same type
                    List<AssemblyComponentRegistryRecord> compatibleComponentsOfSameType = compatibleComponents.stream().filter(cc -> cc.getAssemblycomponenttype() == componentRegistryRecord.getAssemblycomponenttype()).collect(Collectors.toList());
                    //if there is single matching types component then simply assign it
                    if (compatibleComponentsOfSameType.size() == 1) {
                        compatibleComponentsWithBudget.add(compatibleComponentsOfSameType.get(0));
                    } else if (compatibleComponentsOfSameType.size() > 1) {
                        if (budget == BUDGETCATEGORY.LOW || budget == BUDGETCATEGORY.LOW_TO_MEDIUM) {
                            //assign lower budgeted compatible component
                            AssemblyComponentRegistryRecord nextMatchincComponentRecord = compatibleComponentsOfSameType.stream().filter(cc -> cc.getBudgetCategory() == BUDGETCATEGORY.LOW || cc.getBudgetCategory() == BUDGETCATEGORY.LOW_TO_MEDIUM || cc.getBudgetCategory() == BUDGETCATEGORY.MEDIUM).findFirst().get();
                            compatibleComponentsWithBudget.add(nextMatchincComponentRecord);
                        } else if (budget == BUDGETCATEGORY.MEDIUM || budget == BUDGETCATEGORY.MEDIUM_TO_HIGH) {
                            //assign medium budgeted compatible component
                            AssemblyComponentRegistryRecord nextMatchincComponentRecord = compatibleComponentsOfSameType.stream().filter(cc -> cc.getBudgetCategory() == BUDGETCATEGORY.MEDIUM || cc.getBudgetCategory() == BUDGETCATEGORY.MEDIUM_TO_HIGH || cc.getBudgetCategory() == BUDGETCATEGORY.HIGH).findFirst().get();
                            compatibleComponentsWithBudget.add(nextMatchincComponentRecord);
                        } else {
                            //assign higher budgeted compatible component
                            AssemblyComponentRegistryRecord nextMatchincComponentRecord = compatibleComponentsOfSameType.stream().filter(cc -> cc.getBudgetCategory() == BUDGETCATEGORY.HIGH || cc.getBudgetCategory() == BUDGETCATEGORY.VERY_HIGH).findFirst().get();
                            compatibleComponentsWithBudget.add(nextMatchincComponentRecord);
                        }
                    } else {
                        throw new RuntimeException("No matching budget category");
                    }
                }
            }
        }
        return compatibleComponentsWithBudget;
    }

    public boolean isComponentCompatible(AssemblyComponentRegistryRecord component) {
        if (this.equals(component)) {
            return true;
        }
        boolean returnValue = false;
        List<AssemblyComponentRegistryRecord> compatibleComponents = this.getCompatibleComponents();
        return compatibleComponents.contains(component);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssemblyComponentRegistryRecord that = (AssemblyComponentRegistryRecord) o;
        return getAssemblycomponenttype() == that.getAssemblycomponenttype() &&
                Objects.equals(getComponentIdentifier(), that.getComponentIdentifier());
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
