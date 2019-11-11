package com.example.laptop.components.upgrade;

import com.example.laptop.components.AssemblyComponent;
//Interface for chain of responsibility
public interface AssemblyUpgrader {

    public AssemblyComponent upgrade(UpgradeRequest request, AssemblyComponent assemblyToBeUpgrded);
    public AssemblyUpgrader setNext(AssemblyUpgrader assemblyUpgrader);
}
