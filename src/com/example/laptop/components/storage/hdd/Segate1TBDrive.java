package com.example.laptop.components.storage.hdd;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class Segate1TBDrive extends AbstractHardDisk {

    public Segate1TBDrive(ASSEMBLYCOMPONENTTYPE type, double cost, HDDSpecification specification) {
        super("Segate1TBDrive",type, BUDGETCATEGORY.MEDIUM,cost, specification,ASSEMBLYCOMPONENTTYPE.STORAGE_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("installation of Segate 1 TB drive done");
    }

    @Override
    public String toString() {
        return "Segate1TBDrive{" + super.toString() +" } ";
    }

}
