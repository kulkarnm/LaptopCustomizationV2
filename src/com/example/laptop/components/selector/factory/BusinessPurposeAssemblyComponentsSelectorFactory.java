package com.example.laptop.components.selector.factory;

import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.components.selector.*;
import com.example.laptop.components.selector.graphics.MediumResolutionBigScreenSelector;
import com.example.laptop.components.selector.graphics.MediumResolutionSmallScreenSelector;
import com.example.laptop.components.selector.motherboard.*;
import com.example.laptop.components.selector.power.HighProcessingMediumBudgetBoardCompatiblePowerSelector;
import com.example.laptop.components.selector.power.MediumProcessingLowBudgetBoardCompatiblePowerSelector;
import com.example.laptop.components.selector.storage.SmallCapacityHDDSelector;

public class BusinessPurposeAssemblyComponentsSelectorFactory implements AssemblyComponentsSelectorFactory {
    private AssemblyComponentsFamilySelector assemblyComponentsMotherboardFamilySelector;
    private AssemblyComponentsFamilySelector assemblyComponentsGraphicsFamilySelector;
    private AssemblyComponentsFamilySelector assemblyComponentsPowerFamilySelector;
    private AssemblyComponentsFamilySelector assemblyComponentsStorageFamilySelector;


    public BusinessPurposeAssemblyComponentsSelectorFactory create(BUDGETCATEGORY budget){
        switch (budget){
            case LOW:
                this.assemblyComponentsMotherboardFamilySelector =new LowProcessingLowBudgetBoardSelector();    //ryzen3
                this.assemblyComponentsGraphicsFamilySelector = new MediumResolutionSmallScreenSelector();
                this.assemblyComponentsPowerFamilySelector = new MediumProcessingLowBudgetBoardCompatiblePowerSelector();
                this.assemblyComponentsStorageFamilySelector = new SmallCapacityHDDSelector();
                break;
            case LOW_TO_MEDIUM:
                this.assemblyComponentsMotherboardFamilySelector = new MediumProcessingLowBudgetBoardSelector(); //intel3
                this.assemblyComponentsGraphicsFamilySelector = new MediumResolutionSmallScreenSelector();
                this.assemblyComponentsPowerFamilySelector = new MediumProcessingLowBudgetBoardCompatiblePowerSelector();
                this.assemblyComponentsStorageFamilySelector = new SmallCapacityHDDSelector();
                break;
            case MEDIUM:
                this.assemblyComponentsMotherboardFamilySelector = new LowProcessingMediumBudgetBoardSelector(); //ryzen5
                this.assemblyComponentsGraphicsFamilySelector = new MediumResolutionBigScreenSelector();
                this.assemblyComponentsPowerFamilySelector = new HighProcessingMediumBudgetBoardCompatiblePowerSelector();
                this.assemblyComponentsStorageFamilySelector = new SmallCapacityHDDSelector();
                break;
/*
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
*/
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
