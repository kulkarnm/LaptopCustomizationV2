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
    public static ComponentInventory registerAssemblyComponents(){
        ComponentInventory componentInventory = ComponentInventory.getInstance();
        componentInventory.registerComponents();
        return componentInventory;
    }
    public void assembleLaptop() {
        System.out.println("############## Assembly selection #################");
        AssemblyComponentsSelectorFactory assemblyComponentsSelectorFactory = AssemblyTypeSelectorFactory.chooseAppropriateAssemblySelection(PURPOSE.BUSINESS,BUDGETCATEGORY.LOW);
        AggregateAssembler assembler = new AggregateAssembler();
        AssemblyComponent laptopAssembly = assembler.buildAssembly(assemblyComponentsSelectorFactory);
        SpecificationPrinter visitor= new SpecificationPrinter();
        laptopAssembly.accept(visitor);
        System.out.println("############## Printing specifications of proposed assembly #############");
        visitor.print();
        System.out.println("=====================================================================================================");

        System.out.println("##########Assembly modification as per customer request####################");
        UpgraderChain chain = new UpgraderChain();
        UpgradeRequest request = new UpgradeRequest("IntelI5Motherboard", ASSEMBLYCOMPONENTTYPE.MOTHERBOARD);
        laptopAssembly = chain.upgrade(request,laptopAssembly);
        System.out.println("################Assembly modified as per customer request############");
        System.out.println("=====================================================================================================");

        System.out.println("################Printing Specification of modified assembly ############");
        SpecificationPrinter visitor2= new SpecificationPrinter();
        laptopAssembly.accept(visitor2);
        visitor2.print();
        System.out.println("############## Printing of modified assembly specifications completed#############");
        System.out.println("=====================================================================================================");



        //assembler.assemble(laptopAssembly);
        System.out.println("############## Testing initiated for assembly components#############");
        IVisitor preTestDecorator = new PreTestDecorator();
        laptopAssembly.accept(preTestDecorator);
        System.out.println("############## Testing completed for assembly components#############");
        System.out.println("=====================================================================================================");

        PostTestDecorator priorTestingHarness = new PostTestDecorator(laptopAssembly);
        assembler.assemble(priorTestingHarness);
        System.out.println("=====================================================================================================");
    }

    public static void main(String[] args){
        AssembledLaptop laptop= new AssembledLaptop();
        laptop.registerAssemblyComponents();
        laptop.assembleLaptop();
    }

}
