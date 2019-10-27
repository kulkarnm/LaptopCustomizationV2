package com.example.laptop.registry;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComponentsRegistry {
    private List<AssemblyComponentRegistryRecord> assemblyComponents;
    private static ComponentsRegistry componentsRegistry;
    public static ComponentsRegistry getInstance(){
        if(null == componentsRegistry){
            componentsRegistry = new ComponentsRegistry();
        }
        return componentsRegistry;

    }
    private ComponentsRegistry(){
        this.assemblyComponents = new ArrayList<>();
    }

    public void registerComponent(AssemblyComponentRegistryRecord assemblyComponentRegistryRecord){
        if(!this.assemblyComponents.contains(assemblyComponentRegistryRecord)) {
            this.assemblyComponents.add(assemblyComponentRegistryRecord);
        }
    }

    public AssemblyComponentRegistryRecord findByComponentId(String componentId){
        return assemblyComponents.stream().filter(acr->acr.getComponentIdentifier().equals(componentId)).collect(Collectors.toList()).get(0);
/*
        for(AssemblyComponentRegistryRecord record: assemblyComponents){
            if(record.getComponentIdentifier().equals(componentId)){
                return record;
            }
        }
        return null;
*/
    }


} 
