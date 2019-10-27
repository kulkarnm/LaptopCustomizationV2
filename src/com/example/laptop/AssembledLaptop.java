package com.example.laptop;

import com.example.laptop.assemble.AggregateAssembler;
import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.components.selector.factory.AssemblyComponentsSelectorFactory;
import com.example.laptop.components.upgrade.*;
import com.example.laptop.inventory.ComponentInventory;
import com.example.laptop.selection.criteria.AssemblyTypeSelectorFactory;
import com.example.laptop.selection.criteria.PURPOSE;
import com.example.laptop.print.SpecificationPrinter;

public class AssembledLaptop {
    public static ComponentInventory registerAssemblyComponents(){
        ComponentInventory componentInventory = ComponentInventory.getInstance();
        componentInventory.registerComponents();
        return componentInventory;
    }
    public void assembleLaptop() {
        System.out.println("############## Assembly selection for business Purpose#################");
        AssemblyComponentsSelectorFactory assemblyComponentsSelectorFactory = AssemblyTypeSelectorFactory.chooseAppropriateAssemblySelection(PURPOSE.BUSINESS,BUDGETCATEGORY.LOW);
        AggregateAssembler assembler = new AggregateAssembler();
        AssemblyComponent laptopAssembly = assembler.buildAssembly(assemblyComponentsSelectorFactory);
        SpecificationPrinter visitor= new SpecificationPrinter();
        laptopAssembly.accept(visitor);
        System.out.println("############## Printing proposed assembly#############");
        visitor.print();

        System.out.println("##########Assembly upgradation for Intel I5####################");
        UpgraderChain chain = new UpgraderChain();
        UpgradeRequest request = new UpgradeRequest("IntelI5Motherboard", ASSEMBLYCOMPONENTTYPE.MOTHERBOARD);
        laptopAssembly = chain.upgrade(request,laptopAssembly);
        System.out.println("################Assembly get modified for Intel I7 and compatible components############");
        SpecificationPrinter visitor2= new SpecificationPrinter();
        laptopAssembly.accept(visitor2);
        System.out.println("############## Printing modified assembly#############");
        visitor2.print();
        assembler.assemble(laptopAssembly);
    }

    public static void main(String[] args){
        AssembledLaptop laptop= new AssembledLaptop();
        laptop.registerAssemblyComponents();
        laptop.assembleLaptop();
    }

}
