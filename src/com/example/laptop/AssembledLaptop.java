package com.example.laptop;

import com.example.laptop.assemble.AggregateAssembler;
import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.components.selector.factory.AssemblyComponentsSelectorFactory;
import com.example.laptop.components.upgrade.*;
import com.example.laptop.decorators.PostTestDecorator;
import com.example.laptop.decorators.PreTestDecorator;
import com.example.laptop.inventory.ComponentInventory;
import com.example.laptop.selection.criteria.AssemblyTypeSelectorFactory;
import com.example.laptop.selection.criteria.PURPOSE;
import com.example.laptop.print.SpecificationPrinter;
import com.example.laptop.visitor.IVisitor;

public class AssembledLaptop {
    public ComponentInventory registerAssemblyComponents(){
        ComponentInventory componentInventory = ComponentInventory.getInstance();
        componentInventory.registerComponents();
        return componentInventory;
    }
    public AssembledLaptop(){
     registerAssemblyComponents();
    }
    public void assembleLaptop() {
        LaptopAssemblyFacade facade = new LaptopAssemblyFacade();
        AssemblyComponent laptopAssembly = facade.proposeAssemblyConfiguration();
        facade.printAssemblySpecs(laptopAssembly);
        laptopAssembly = facade.modifyAssembly("IntelI5Motherboard", ASSEMBLYCOMPONENTTYPE.MOTHERBOARD,laptopAssembly);
        facade.printAssemblySpecs(laptopAssembly);
        facade.testComponentsInAssembly(laptopAssembly);
        facade.testAssembledLaptop(laptopAssembly);
    }

    public static void main(String[] args){
        AssembledLaptop laptop= new AssembledLaptop();
        laptop.assembleLaptop();
    }

}
