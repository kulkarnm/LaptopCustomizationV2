package com.example.laptop.components.selector.factory;

import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.components.selector.AssemblyComponentsFamilySelector;

//Abstract factory & factory method
public interface AssemblyComponentsSelectorFactory {
    public AssemblyComponentsSelectorFactory create(BUDGETCATEGORY BUDGETCATEOGRY);
    public AssemblyComponentsFamilySelector getAssemblyComponentsMotherboardFamilySelector();
    public AssemblyComponentsFamilySelector getAssemblyComponentsGraphicsFamilySelector();
    public AssemblyComponentsFamilySelector getAssemblyComponentsPowerFamilySelector();
    public AssemblyComponentsFamilySelector getAssemblyComponentsStorageFamilySelector();
}
