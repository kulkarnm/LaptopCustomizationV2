package com.example.laptop.assemble;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;

import java.util.ArrayList;
import java.util.List;

//another static factory
public class AssemblyTypeWiseIngredientsComposition {
    public static List<ASSEMBLYCOMPONENTTYPE> selectComponentTypes(ASSEMBLYCOMPONENTTYPE parentAssemblyType) {
        List<ASSEMBLYCOMPONENTTYPE> associatedComponentTypes = new ArrayList<>();
        switch (parentAssemblyType) {
            case LAPTOP:
                associatedComponentTypes.add(ASSEMBLYCOMPONENTTYPE.GRAPHICS_ASSEMBLY);
                associatedComponentTypes.add(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_ASSEMBLY);
                associatedComponentTypes.add(ASSEMBLYCOMPONENTTYPE.POWER_ASSEMBLY);
                associatedComponentTypes.add(ASSEMBLYCOMPONENTTYPE.STORAGE_ASSEMBLY);
                break;
            case MOTHERBOARD_ASSEMBLY:
                associatedComponentTypes.add(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_CPU);
                associatedComponentTypes.add(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_RAM);
                associatedComponentTypes.add(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD);
                break;
            case GRAPHICS_ASSEMBLY:
                associatedComponentTypes.add(ASSEMBLYCOMPONENTTYPE.GRAPHICS_CARD);
                associatedComponentTypes.add(ASSEMBLYCOMPONENTTYPE.GRAPHICS_SCREEN);
                break;
            case POWER_ASSEMBLY:
                associatedComponentTypes.add(ASSEMBLYCOMPONENTTYPE.POWER_AC_ADAPTER);
                associatedComponentTypes.add(ASSEMBLYCOMPONENTTYPE.POWER_BATTERY);
                break;
            case STORAGE_ASSEMBLY:
                associatedComponentTypes.add(ASSEMBLYCOMPONENTTYPE.STORAGE_HARD_DISC);
                break;
        }
        return associatedComponentTypes;
    }
} 
