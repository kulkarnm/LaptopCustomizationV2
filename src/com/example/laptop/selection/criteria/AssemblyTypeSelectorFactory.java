package com.example.laptop.selection.criteria;

import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.components.selector.factory.AssemblyComponentsSelectorFactory;
import com.example.laptop.components.selector.factory.BusinessPurposeAssemblyComponentsSelectorFactory;
import com.example.laptop.components.selector.factory.GraphicsPurposeAssemblyComponentsSelectorFactory;
import com.example.laptop.components.selector.factory.HigherEndProcessingPurposeAssemblyComponentsSelectorFactory;

//Example of Static factory
public class AssemblyTypeSelectorFactory {

    public static AssemblyComponentsSelectorFactory chooseAppropriateAssemblySelection(PURPOSE purpose,BUDGETCATEGORY budget ){
        if(purpose == PURPOSE.BUSINESS ){
            return (new BusinessPurposeAssemblyComponentsSelectorFactory()).create(budget);
        }else if(purpose == PURPOSE.PROGRAMMING){
            return (new HigherEndProcessingPurposeAssemblyComponentsSelectorFactory()).create(budget);
        }else if(purpose ==PURPOSE.GRAPHICSDESIGN){
            return (new GraphicsPurposeAssemblyComponentsSelectorFactory()).create(budget);
        }else{
            return (new BusinessPurposeAssemblyComponentsSelectorFactory()).create(BUDGETCATEGORY.MEDIUM);
        }
    }
}
