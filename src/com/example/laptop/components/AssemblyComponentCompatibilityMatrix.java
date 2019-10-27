package com.example.laptop.components;

import java.util.List;
import java.util.stream.Collectors;

public class AssemblyComponentCompatibilityMatrix {
    private ASSEMBLYCOMPONENTTYPE ASSEMBLYCOMPONENTTYPE;
    private String assemblyComponentClassName;
    private Class assemblyComponentCreatorClass;
    private List<AssemblyComponentCompatibilityMatrix> compatibleComponentDefinitions;

    public AssemblyComponentCompatibilityMatrix(ASSEMBLYCOMPONENTTYPE ASSEMBLYCOMPONENTTYPE, String assemblyComponentClassName, Class assemblyComponentCreatorClass, List<AssemblyComponentCompatibilityMatrix> compatibleComponentDefinitions) {
        this.ASSEMBLYCOMPONENTTYPE = ASSEMBLYCOMPONENTTYPE;
        this.assemblyComponentClassName = assemblyComponentClassName;
        this.assemblyComponentCreatorClass =assemblyComponentCreatorClass;
        this.compatibleComponentDefinitions = compatibleComponentDefinitions;
    }

    public ASSEMBLYCOMPONENTTYPE getASSEMBLYCOMPONENTTYPE() {
        return ASSEMBLYCOMPONENTTYPE;
    }

    public String getAssemblyComponentClassName() {
        return assemblyComponentClassName;
    }

    public List<AssemblyComponentCompatibilityMatrix> getCompatibleComponentDefinitions() {
        return compatibleComponentDefinitions;
    }

    public Class getAssemblyComponentCreatorClass() {
        return assemblyComponentCreatorClass;
    }

    public List<AssemblyComponentCompatibilityMatrix> findCompatibleAssemblyComponentsByType(ASSEMBLYCOMPONENTTYPE ASSEMBLYCOMPONENTTYPE){
        return compatibleComponentDefinitions.stream().filter(ccd->ccd.getASSEMBLYCOMPONENTTYPE()== ASSEMBLYCOMPONENTTYPE).collect(Collectors.toList());
    }
}
