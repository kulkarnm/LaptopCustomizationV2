package com.example.laptop;

import com.example.laptop.assemble.AggregateAssembler;
import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.BUDGETCATEGORY;
import com.example.laptop.components.selector.factory.AssemblyComponentsSelectorFactory;
import com.example.laptop.components.upgrade.UpgradeRequest;
import com.example.laptop.components.upgrade.UpgraderChain;
import com.example.laptop.decorators.PostTestDecorator;
import com.example.laptop.decorators.PreTestDecorator;
import com.example.laptop.print.SpecificationPrinter;
import com.example.laptop.selection.criteria.AssemblyTypeSelectorFactory;
import com.example.laptop.selection.criteria.PURPOSE;
import com.example.laptop.visitor.IVisitor;
//facade design pattern
public class LaptopAssemblyFacade {
    private AggregateAssembler assembler;

    public LaptopAssemblyFacade(){
        this.assembler= new AggregateAssembler();
    }
    public AssemblyComponent proposeAssemblyConfiguration(){
        System.out.println("=====================================================================================================");
        System.out.println("############## Assembly selection #################");
        AssemblyComponentsSelectorFactory assemblyComponentsSelectorFactory = AssemblyTypeSelectorFactory.chooseAppropriateAssemblySelection(PURPOSE.BUSINESS, BUDGETCATEGORY.LOW);
        AssemblyComponent laptopAssembly = assembler.buildAssembly(assemblyComponentsSelectorFactory);
        System.out.println("############## Assembly proposed as per purpose and budget #################");
        System.out.println("=====================================================================================================");
        return laptopAssembly;
    }

    public void printAssemblySpecs(AssemblyComponent laptopAssembly){
        SpecificationPrinter visitor= new SpecificationPrinter();
        laptopAssembly.accept(visitor);
        System.out.println("=====================================================================================================");
        System.out.println("############## Printing specifications of proposed assembly #############");
        visitor.print();
        System.out.println("##############  Assembly Specifications printed #############");
        System.out.println("=====================================================================================================");
    }

    public AssemblyComponent modifyAssembly(String componentId, ASSEMBLYCOMPONENTTYPE componentType, AssemblyComponent laptopAssembly){
        System.out.println("=====================================================================================================");
        System.out.println("##########Assembly modification as per customer request####################");
        UpgraderChain chain = new UpgraderChain();
        UpgradeRequest request = new UpgradeRequest(componentId, componentType);
        laptopAssembly = chain.upgrade(request,laptopAssembly);
        System.out.println("################Assembly modified as per customer request############");
        System.out.println("=====================================================================================================");
        return laptopAssembly;
    }
    public void testComponentsInAssembly(AssemblyComponent laptopAssembly){
        System.out.println("=====================================================================================================");
        System.out.println("############## Testing initiated for assembly components#############");
        IVisitor preTestDecorator = new PreTestDecorator();
        laptopAssembly.accept(preTestDecorator);
        System.out.println("############## Testing completed for assembly components#############");
        System.out.println("=====================================================================================================");
    }

    public void testAssembledLaptop(AssemblyComponent laptopAssembly){
        System.out.println("=====================================================================================================");
        System.out.println("############## Testing initiated for laptop assembly#############");
        PostTestDecorator priorTestingHarness = new PostTestDecorator(laptopAssembly);
        assembler.assemble(priorTestingHarness);
        System.out.println("############## Testing completed for laptop assembly#############");
        System.out.println("=====================================================================================================");

    }

} 
