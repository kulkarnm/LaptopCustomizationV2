package com.example.laptop.components.storage.hdd;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.BUDGETCATEGORY;

public class Segate4TBDrive extends AbstractHardDisk {
    public Segate4TBDrive(ASSEMBLYCOMPONENTTYPE type, double cost, HDDSpecification specification) {
        super("Segate4TBDrive",type, BUDGETCATEGORY.HIGH,cost, specification,ASSEMBLYCOMPONENTTYPE.STORAGE_ASSEMBLY);
    }

    @Override
    public void assemble() {
        System.out.println("installation of Segate 4 TB drive done");
    }

    @Override
    public String toString() {
        return "Segate4TBDrive{" + super.toString() +" } ";
    }
}
