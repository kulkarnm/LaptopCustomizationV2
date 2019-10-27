package com.example.laptop.components.upgrade;

import com.example.laptop.components.AssemblyComponent;

public class UpgraderChain {
    private AssemblyUpgrader defaultUpgrader;

    public UpgraderChain() {
        defaultUpgrader = new CPUUpgrader();
        AssemblyUpgrader motherboardUpgrader = new MotherboardUpgrader();
        AssemblyUpgrader ramUpgrader = new RAMUpgrader();
        AssemblyUpgrader graphicsUpgrader = new GraphicsCardUpgrader();
        AssemblyUpgrader batteryUpgrader = new BatteryUpgrader();
        AssemblyUpgrader storageUpgrader = new StorageUpgrader();
        AssemblyUpgrader adapterUpgrader = new AdapterUpgrader();
        AssemblyUpgrader screenUpgrader = new ScreenUpgrader();
        defaultUpgrader.setNext(motherboardUpgrader);
        motherboardUpgrader.setNext(ramUpgrader);
        ramUpgrader.setNext(graphicsUpgrader);
        graphicsUpgrader.setNext(batteryUpgrader);
        batteryUpgrader.setNext(storageUpgrader);
        storageUpgrader.setNext(adapterUpgrader);
        adapterUpgrader.setNext(screenUpgrader);
    }

    public AssemblyComponent upgrade(UpgradeRequest request,AssemblyComponent assembly){
        return this.defaultUpgrader.upgrade(request,assembly);
    }
} 
