package com.example.laptop.components.selector;

import com.example.laptop.components.AssemblyComponent;

//Abstract factory
public interface AssemblyComponentsFamilySelector {
    public AssemblyComponent selectCompatibleAssemblyComponents(AssemblyComponent assemblyComponent);

} 
