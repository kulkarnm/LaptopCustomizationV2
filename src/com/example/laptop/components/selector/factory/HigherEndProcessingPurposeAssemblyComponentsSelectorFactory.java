package com.example.laptop.components.selector.factory;

import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.components.selector.AssemblyComponentsFamilySelector;
import com.example.laptop.components.selector.graphics.HighResolutionBigScreenSelector;
import com.example.laptop.components.selector.graphics.MediumResolutionBigScreenSelector;
import com.example.laptop.components.selector.motherboard.*;
import com.example.laptop.components.selector.power.HighProcessingHighBudgetBoardCompatiblePowerSelector;
import com.example.laptop.components.selector.power.HighProcessingMediumBudgetBoardCompatiblePowerSelector;
import com.example.laptop.components.selector.storage.BigCapacityHDDSelector;
import com.example.laptop.components.selector.storage.LargeCapacityHDDSelector;

public class HigherEndProcessingPurposeAssemblyComponentsSelectorFactory implements AssemblyComponentsSelectorFactory {

    private AssemblyComponentsFamilySelector assemblyComponentsMotherboardFamilySelector;
    private AssemblyComponentsFamilySelector assemblyComponentsGraphicsFamilySelector;
    private AssemblyComponentsFamilySelector assemblyComponentsPowerFamilySelector;
    private AssemblyComponentsFamilySelector assemblyComponentsStorageFamilySelector;


    public HigherEndProcessingPurposeAssemblyComponentsSelectorFactory create(BUDGETCATEGORY budget){
        switch (budget){
            case MEDIUM_TO_HIGH:
                this.assemblyComponentsMotherboardFamilySelector = new MediumProcessingMediumBudgetBoardSelector(); //intel5
                this.assemblyComponentsGraphicsFamilySelector = new MediumResolutionBigScreenSelector();
                this.assemblyComponentsPowerFamilySelector = new HighProcessingMediumBudgetBoardCompatiblePowerSelector();
                this.assemblyComponentsStorageFamilySelector = new BigCapacityHDDSelector();
                break;
            case HIGH:
                this.assemblyComponentsMotherboardFamilySelector = new HighProcessingMediumBudgetBoardSelector(); //Ryzen7
                this.assemblyComponentsGraphicsFamilySelector = new MediumResolutionBigScreenSelector();
                this.assemblyComponentsPowerFamilySelector = new HighProcessingHighBudgetBoardCompatiblePowerSelector();
                this.assemblyComponentsStorageFamilySelector = new BigCapacityHDDSelector();
                break;
            case VERY_HIGH:
                this.assemblyComponentsMotherboardFamilySelector = new HighProcessingHighBudgetBoardSelector(); //Intel7
                this.assemblyComponentsGraphicsFamilySelector = new HighResolutionBigScreenSelector();
                this.assemblyComponentsPowerFamilySelector = new HighProcessingHighBudgetBoardCompatiblePowerSelector();
                this.assemblyComponentsStorageFamilySelector = new LargeCapacityHDDSelector();
        }
        return this;
    }

    public AssemblyComponentsFamilySelector getAssemblyComponentsMotherboardFamilySelector() {
        return assemblyComponentsMotherboardFamilySelector;
    }

    public AssemblyComponentsFamilySelector getAssemblyComponentsGraphicsFamilySelector() {
        return assemblyComponentsGraphicsFamilySelector;
    }

    public AssemblyComponentsFamilySelector getAssemblyComponentsPowerFamilySelector() {
        return assemblyComponentsPowerFamilySelector;
    }

    public AssemblyComponentsFamilySelector getAssemblyComponentsStorageFamilySelector() {
        return assemblyComponentsStorageFamilySelector;
    }

}
