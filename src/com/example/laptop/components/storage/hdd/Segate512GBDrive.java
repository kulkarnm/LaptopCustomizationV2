package com.example.laptop.components.storage.hdd;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class Segate512GBDrive extends AbstractHardDisk {
    public Segate512GBDrive(ASSEMBLYCOMPONENTTYPE type, double cost, HDDSpecification specification) {
        super("Segate512GBDrive",type, BUDGETCATEGORY.LOW, cost, specification,ASSEMBLYCOMPONENTTYPE.STORAGE_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("installation of Segate 512 MB drive done");
    }

    @Override
    public String toString() {
        return "Segate512GBDrive{" + super.toString() +" } ";
    }
}
