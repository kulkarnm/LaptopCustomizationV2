package com.example.laptop.components.upgrade;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;

public class UpgradeRequest {
    String componentId;
    ASSEMBLYCOMPONENTTYPE componentType;

    public UpgradeRequest(String componentId, ASSEMBLYCOMPONENTTYPE componentType) {
        this.componentId = componentId;
        this.componentType = componentType;
    }

    public String getComponentId() {
        return componentId;
    }

    public ASSEMBLYCOMPONENTTYPE getComponentType() {
        return componentType;
    }

}
