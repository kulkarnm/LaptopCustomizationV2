package com.example.laptop.inventory;

import com.example.laptop.components.ASSEMBLYCOMPONENTTYPE;
import com.example.laptop.components.AssemblyComponent;
import com.example.laptop.components.graphics.card.GraphicsSpecification;
import com.example.laptop.components.graphics.card.NVIDIAGeForceGTX1060Card;
import com.example.laptop.components.graphics.card.NVIDIAGeForceGTX1070Card;
import com.example.laptop.components.graphics.card.NVIDIAGeForceGTX1080TICard;
import com.example.laptop.components.graphics.monitor.HighResolution15_4Screen;
import com.example.laptop.components.graphics.monitor.MediumResolution11_6Screen;
import com.example.laptop.components.graphics.monitor.MediumResolution14_1Screen;
import com.example.laptop.components.graphics.monitor.ScreenSpecification;
import com.example.laptop.components.motherboard.board.*;
import com.example.laptop.components.motherboard.cpu.*;
import com.example.laptop.components.motherboard.memory.Kingston32K;
import com.example.laptop.components.motherboard.memory.KingstonHyperX;
import com.example.laptop.components.motherboard.memory.PNYAnarchyBlue2X;
import com.example.laptop.components.motherboard.memory.RAMSpecification;
import com.example.laptop.components.power.adapter.*;
import com.example.laptop.components.power.battery.*;
import com.example.laptop.components.storage.hdd.HDDSpecification;
import com.example.laptop.components.storage.hdd.Segate1TBDrive;
import com.example.laptop.components.storage.hdd.Segate4TBDrive;
import com.example.laptop.components.storage.hdd.Segate512GBDrive;
import com.example.laptop.registry.AssemblyComponentRegistryRecord;
import com.example.laptop.registry.ComponentsRegistry;

import java.util.ArrayList;
import java.util.List;

public class ComponentInventory {
    private List<AssemblyComponent> assemblyComponents;
    private static ComponentInventory componentInventory;

    private ComponentInventory(){
        this.assemblyComponents = new ArrayList<>();
    }
    public static ComponentInventory getInstance(){
        if(null == componentInventory){
            componentInventory = new ComponentInventory();
        }
        return componentInventory;

    }
    public void registerComponents(){
        AssemblyComponent motherBoard1 = new AMDRyzen5Motherboard(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD,21800,new MotherboardSpecification(2933,"AMD A320","E731AMS.1C0","DDR4-2933", "AMD","AMD Ryzen 5"));
        this.assemblyComponents.add(motherBoard1);

        AssemblyComponent cpu1 = new AMDRyzen5(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_CPU,21500,new CPUSpecification("4.1 GHz","1 Core","AMD"));
        this.assemblyComponents.add(cpu1);

        AssemblyComponent ram1 = new PNYAnarchyBlue2X(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_RAM,18000,new RAMSpecification(16,"DDR3","PNY"));
        this.assemblyComponents.add(ram1);

        AssemblyComponent graphics1 = new NVIDIAGeForceGTX1060Card(ASSEMBLYCOMPONENTTYPE.GRAPHICS_CARD, 3300, new GraphicsSpecification("Maxwell", 5, "5GB DDR5", "GEFORCE", "NVIDIA"));
        this.assemblyComponents.add(graphics1);

        AssemblyComponent screen1 = new MediumResolution11_6Screen(ASSEMBLYCOMPONENTTYPE.GRAPHICS_SCREEN,3100, new ScreenSpecification("1200X800","11X4","HP")); new MediumResolution11_6Screen(ASSEMBLYCOMPONENTTYPE.GRAPHICS_SCREEN,3100, new ScreenSpecification("1200X800","11X4","HP"));
        this.assemblyComponents.add(screen1);

        AssemblyComponent adapter1 = new V220Amp15Adapter(ASSEMBLYCOMPONENTTYPE.POWER_AC_ADAPTER,1200,new AdapterSpecification(220,40,15));
        this.assemblyComponents.add(adapter1);

        AssemblyComponent battery1 = new Cell6Mah4400LiIonBattery(ASSEMBLYCOMPONENTTYPE.POWER_BATTERY,1200,new BatterySpecification(220,40,15));
        this.assemblyComponents.add(battery1);

        AssemblyComponent hdd1 = new Segate512GBDrive(ASSEMBLYCOMPONENTTYPE.STORAGE_HARD_DISC,2400,new HDDSpecification("Segate 512GB","Segate",512,640));
        this.assemblyComponents.add(hdd1);

        AssemblyComponent motherBoard2 = new IntelI7Motherboard(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD,43500,new MotherboardSpecification(3400,"INTEL A766","INTEL BIOS","DDR4", "INTEL","Intel I7"));
        this.assemblyComponents.add(motherBoard2);

        AssemblyComponent cpu2 = new IntelI7(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_CPU,39500,new CPUSpecification("5.5 GHz","8 Core","INTEL"));
        this.assemblyComponents.add(cpu2);

        AssemblyComponent ram2 = new KingstonHyperX(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_RAM,24000,new RAMSpecification(16,"DDR4","Kingston"));
        this.assemblyComponents.add(ram2);

        AssemblyComponent graphics2 = new NVIDIAGeForceGTX1080TICard(ASSEMBLYCOMPONENTTYPE.GRAPHICS_CARD, 4000, new GraphicsSpecification("Maxwell", 11, "11GB DDR5", "GEFORCE", "NVIDIA"));
        this.assemblyComponents.add(graphics2);

        AssemblyComponent screen2 = new HighResolution15_4Screen(ASSEMBLYCOMPONENTTYPE.GRAPHICS_SCREEN,3600, new ScreenSpecification("1600X1200","15X4","HP"));
        this.assemblyComponents.add(screen2);

        AssemblyComponent adapter2 = new V260Amp15Adapter(ASSEMBLYCOMPONENTTYPE.POWER_AC_ADAPTER,1800,new AdapterSpecification(260,60,15));
        this.assemblyComponents.add(adapter2);

        AssemblyComponent battery2 = new Cell9Mah6600LiIonBattery(ASSEMBLYCOMPONENTTYPE.POWER_BATTERY,2000,new BatterySpecification(260,60,15));
        this.assemblyComponents.add(battery2);

        AssemblyComponent hdd2 = new Segate4TBDrive(ASSEMBLYCOMPONENTTYPE.STORAGE_HARD_DISC,6200,new HDDSpecification("Segate 4TB","Segate",4000,840));
        this.assemblyComponents.add(hdd2);

        AssemblyComponent motherBoard3 = new AMDRyzen7Motherboard(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD,31800,new MotherboardSpecification(2933,"AMD A320","E731AMS.1C0","DDR4-2933", "AMD","AMD Ryzen 7"));
        this.assemblyComponents.add(motherBoard3);

        AssemblyComponent cpu3 =  new AMDRyzen7(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_CPU,29500,new CPUSpecification("4.1 GHz","8 Core","AMD"));
        this.assemblyComponents.add(cpu3);

        AssemblyComponent ram3 =  new PNYAnarchyBlue2X(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_RAM,18000,new RAMSpecification(16,"DDR3","PNY"));
        this.assemblyComponents.add(ram3);

        AssemblyComponent graphics3 = new NVIDIAGeForceGTX1070Card(ASSEMBLYCOMPONENTTYPE.GRAPHICS_CARD, 2800, new GraphicsSpecification("Pascal", 7, "6GB DDR5", "GEFORCE", "NVIDIA"));
        this.assemblyComponents.add(graphics3);

        AssemblyComponent screen3 =  new MediumResolution14_1Screen(ASSEMBLYCOMPONENTTYPE.GRAPHICS_SCREEN,2850, new ScreenSpecification("1200X900","14X1","HP"));
        this.assemblyComponents.add(screen3);

        AssemblyComponent adapter3 = new V240Amp15Adapter(ASSEMBLYCOMPONENTTYPE.POWER_AC_ADAPTER,1400,new AdapterSpecification(240,60,15));
        this.assemblyComponents.add(adapter3);

        AssemblyComponent battery3 = new Cell9Mah5200MahBattery(ASSEMBLYCOMPONENTTYPE.POWER_BATTERY,1800,new BatterySpecification(240,60,15));
        this.assemblyComponents.add(battery3);

        AssemblyComponent hdd3 =  new Segate1TBDrive(ASSEMBLYCOMPONENTTYPE.STORAGE_HARD_DISC,3200,new HDDSpecification("Segate 1TB","Segate",1000,640));
        this.assemblyComponents.add(hdd3);

        AssemblyComponent battery4 = new Cell9Mah4400LiIonBattery(ASSEMBLYCOMPONENTTYPE.POWER_BATTERY,1400,new BatterySpecification(240,60,15));
        this.assemblyComponents.add(battery4);

        AssemblyComponent ram4 = new Kingston32K(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_RAM,29000,new RAMSpecification(12,"DDR4","Kingston"));
        this.assemblyComponents.add(ram4);

        AssemblyComponent motherboard4 = new IntelI3Motherboard(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD,23500,new MotherboardSpecification(3400,"INTEL A366","INTEL BIOS","DDR4", "INTEL","Intel I3"));
        this.assemblyComponents.add(motherboard4);

        AssemblyComponent cpu4 = new IntelI3(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_CPU,21500,new CPUSpecification("2.5 GHz","1 Core","INTEL"));
        this.assemblyComponents.add(cpu4);

        AssemblyComponent motherboard5 = new IntelI5Motherboard(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD,25500,new MotherboardSpecification(3400,"INTEL A566","INTEL BIOS","DDR4", "INTEL","Intel I5"));
        this.assemblyComponents.add(motherboard5);

        AssemblyComponent cpu5 = new IntelI5(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_CPU,29500,new CPUSpecification("5.5 GHz","1 Core","INTEL"));
        this.assemblyComponents.add(cpu5);

        AssemblyComponent motherboard6 = new AMDRyzen3Motherboard(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD,17800,new MotherboardSpecification(2933,"AMD A320","E731AMS.1C0","DDR4-2933", "AMD","AMD Ryzen 3"));
        this.assemblyComponents.add(motherboard6);

        AssemblyComponent cpu6 = new AMDRyzen3(ASSEMBLYCOMPONENTTYPE.MOTHERBOARD_CPU,19500,new CPUSpecification("2.2 GHz","1 Core","AMD"));
        this.assemblyComponents.add(cpu6);

        AssemblyComponent adapter4 = new V210Amp12Adapter(ASSEMBLYCOMPONENTTYPE.POWER_AC_ADAPTER,800,new AdapterSpecification(210,40,12));
        this.assemblyComponents.add(adapter4);

        cpu1.registerCompatibility(motherBoard1);
        cpu1.registerCompatibility(battery3);
        cpu1.registerCompatibility(battery4);
        cpu1.registerCompatibility(adapter1);
        cpu1.registerCompatibility(adapter4);
        cpu1.registerCompatibility(graphics1);
        cpu1.registerCompatibility(ram1);
        cpu1.registerCompatibility(ram2);
        cpu1.registerCompatibility(ram3);
        cpu1.registerCompatibility(hdd1);
        cpu1.registerCompatibility(hdd2);
        cpu1.registerCompatibility(hdd3);
        cpu1.registerCompatibility(screen1);
        cpu1.registerCompatibility(screen3);

        motherBoard1.registerCompatibility(battery3);
        motherBoard1.registerCompatibility(battery4);
        motherBoard1.registerCompatibility(adapter1);
        motherBoard1.registerCompatibility(adapter4);
        motherBoard1.registerCompatibility(graphics1);
        motherBoard1.registerCompatibility(ram1);
        motherBoard1.registerCompatibility(ram2);
        motherBoard1.registerCompatibility(ram3);
        motherBoard1.registerCompatibility(hdd1);
        motherBoard1.registerCompatibility(hdd2);
        motherBoard1.registerCompatibility(hdd3);
        motherBoard1.registerCompatibility(screen1);
        motherBoard1.registerCompatibility(screen3);

        cpu2.registerCompatibility(motherBoard2);
        cpu2.registerCompatibility(battery2);
        cpu2.registerCompatibility(adapter3);
        cpu2.registerCompatibility(graphics3);
        cpu2.registerCompatibility(graphics2);
        cpu2.registerCompatibility(screen1);
        cpu2.registerCompatibility(screen2);
        cpu2.registerCompatibility(screen3);
        cpu2.registerCompatibility(ram2);
        cpu2.registerCompatibility(ram4);
        cpu2.registerCompatibility(hdd1);
        cpu2.registerCompatibility(hdd2);
        cpu2.registerCompatibility(hdd3);


        motherBoard2.registerCompatibility(battery2);
        motherBoard2.registerCompatibility(adapter3);
        motherBoard2.registerCompatibility(graphics3);
        motherBoard2.registerCompatibility(graphics2);
        motherBoard2.registerCompatibility(screen1);
        motherBoard2.registerCompatibility(screen2);
        motherBoard2.registerCompatibility(screen3);
        motherBoard2.registerCompatibility(ram2);
        motherBoard2.registerCompatibility(ram4);
        motherBoard2.registerCompatibility(hdd1);
        motherBoard2.registerCompatibility(hdd2);
        motherBoard2.registerCompatibility(hdd3);


        cpu3.registerCompatibility(motherBoard3);
        cpu3.registerCompatibility(battery3);
        cpu3.registerCompatibility(adapter1);
        cpu3.registerCompatibility(graphics3);
        cpu3.registerCompatibility(graphics2);
        cpu3.registerCompatibility(screen1);
        cpu3.registerCompatibility(screen2);
        cpu3.registerCompatibility(screen3);
        cpu3.registerCompatibility(ram2);
        cpu3.registerCompatibility(ram4);
        cpu3.registerCompatibility(hdd1);
        cpu3.registerCompatibility(hdd2);
        cpu3.registerCompatibility(hdd3);


        motherBoard3.registerCompatibility(battery3);
        motherBoard3.registerCompatibility(adapter1);
        motherBoard3.registerCompatibility(graphics3);
        motherBoard3.registerCompatibility(graphics2);
        motherBoard3.registerCompatibility(screen1);
        motherBoard3.registerCompatibility(screen2);
        motherBoard3.registerCompatibility(screen3);
        motherBoard3.registerCompatibility(ram2);
        motherBoard3.registerCompatibility(ram4);
        motherBoard3.registerCompatibility(hdd1);
        motherBoard3.registerCompatibility(hdd2);
        motherBoard3.registerCompatibility(hdd3);

        cpu4.registerCompatibility(motherboard4);
        cpu4.registerCompatibility(battery1);
        cpu4.registerCompatibility(battery4);
        cpu4.registerCompatibility(adapter4);
        cpu4.registerCompatibility(adapter1);
        cpu4.registerCompatibility(graphics1);
        cpu4.registerCompatibility(screen1);
        cpu4.registerCompatibility(screen3);
        cpu4.registerCompatibility(ram1);
        cpu4.registerCompatibility(hdd1);
        cpu4.registerCompatibility(hdd2);
        cpu4.registerCompatibility(hdd3);


        motherboard4.registerCompatibility(battery1);
        motherboard4.registerCompatibility(battery4);
        motherboard4.registerCompatibility(adapter4);
        motherboard4.registerCompatibility(adapter1);
        motherboard4.registerCompatibility(graphics1);
        motherboard4.registerCompatibility(screen1);
        motherboard4.registerCompatibility(screen3);
        motherboard4.registerCompatibility(ram1);
        motherboard4.registerCompatibility(hdd1);
        motherboard4.registerCompatibility(hdd2);
        motherboard4.registerCompatibility(hdd3);

        cpu5.registerCompatibility(motherboard5);
        cpu5.registerCompatibility(battery3);
        cpu5.registerCompatibility(battery4);
        cpu5.registerCompatibility(adapter1);
        cpu5.registerCompatibility(graphics3);
        cpu5.registerCompatibility(screen1);
        cpu5.registerCompatibility(screen3);
        cpu5.registerCompatibility(ram2);
        cpu5.registerCompatibility(ram4);
        cpu5.registerCompatibility(hdd1);
        cpu5.registerCompatibility(hdd2);
        cpu5.registerCompatibility(hdd3);


        motherboard5.registerCompatibility(battery3);
        motherboard5.registerCompatibility(battery4);
        motherboard5.registerCompatibility(adapter1);
        motherboard5.registerCompatibility(graphics3);
        motherboard5.registerCompatibility(screen1);
        motherboard5.registerCompatibility(screen3);
        motherboard5.registerCompatibility(ram2);
        motherboard5.registerCompatibility(ram4);
        motherboard5.registerCompatibility(hdd1);
        motherboard5.registerCompatibility(hdd2);
        motherboard5.registerCompatibility(hdd3);

        cpu6.registerCompatibility(motherboard6);
        cpu6.registerCompatibility(battery1);
        cpu6.registerCompatibility(adapter1);
        cpu6.registerCompatibility(adapter4);
        cpu6.registerCompatibility(graphics1);
        cpu6.registerCompatibility(screen1);
        cpu6.registerCompatibility(screen3);
        cpu6.registerCompatibility(ram1);
        cpu6.registerCompatibility(hdd1);
        cpu6.registerCompatibility(hdd2);
        cpu6.registerCompatibility(hdd3);


        motherboard6.registerCompatibility(battery1);
        motherboard6.registerCompatibility(adapter1);
        motherboard6.registerCompatibility(adapter4);
        motherboard6.registerCompatibility(graphics1);
        motherboard6.registerCompatibility(screen1);
        motherboard6.registerCompatibility(screen3);
        motherboard6.registerCompatibility(ram1);
        motherboard6.registerCompatibility(hdd1);
        motherboard6.registerCompatibility(hdd2);
        motherboard6.registerCompatibility(hdd3);


        battery1.registerCompatibility(adapter4);
        battery1.registerCompatibility(graphics1);

        battery2.registerCompatibility(adapter3);
        battery2.registerCompatibility(graphics3);
        battery2.registerCompatibility(graphics2);

        battery3.registerCompatibility(adapter1);
        battery3.registerCompatibility(graphics3);

        battery4.registerCompatibility(adapter1);
        battery4.registerCompatibility(graphics2);

        adapter1.registerCompatibility(graphics3);
        adapter1.registerCompatibility(graphics2);

        adapter2.registerCompatibility(graphics3);
        adapter2.registerCompatibility(graphics2);

        adapter3.registerCompatibility(graphics3);
        adapter3.registerCompatibility(graphics2);

        adapter4.registerCompatibility(graphics1);

        ram1.registerCompatibility(battery3);
        ram1.registerCompatibility(battery4);
        ram1.registerCompatibility(adapter1);
        ram1.registerCompatibility(adapter4);

        ram2.registerCompatibility(battery2);
        ram2.registerCompatibility(battery3);
        ram2.registerCompatibility(battery4);
        ram2.registerCompatibility(adapter1);
        ram2.registerCompatibility(adapter3);
        ram2.registerCompatibility(adapter4);

        ram3.registerCompatibility(battery3);
        ram3.registerCompatibility(battery4);
        ram3.registerCompatibility(adapter1);
        ram3.registerCompatibility(adapter4);

        ram4.registerCompatibility(battery3);
        ram4.registerCompatibility(adapter1);
        ram4.registerCompatibility(battery2);
        ram4.registerCompatibility(adapter3);

        hdd1.registerCompatibility(adapter1);
        hdd1.registerCompatibility(adapter2);
        hdd1.registerCompatibility(adapter3);
        hdd1.registerCompatibility(adapter4);
        hdd1.registerCompatibility(battery1);
        hdd1.registerCompatibility(battery2);
        hdd1.registerCompatibility(battery3);
        hdd1.registerCompatibility(battery4);

        hdd2.registerCompatibility(adapter1);
        hdd2.registerCompatibility(adapter2);
        hdd2.registerCompatibility(adapter3);
        hdd2.registerCompatibility(adapter4);
        hdd2.registerCompatibility(battery1);
        hdd2.registerCompatibility(battery2);
        hdd2.registerCompatibility(battery3);
        hdd2.registerCompatibility(battery4);

        screen1.registerCompatibility(battery1);
        screen1.registerCompatibility(battery2);
        screen1.registerCompatibility(battery3);
        screen1.registerCompatibility(battery4);
        screen1.registerCompatibility(adapter1);
        screen1.registerCompatibility(adapter2);
        screen1.registerCompatibility(adapter3);

        screen2.registerCompatibility(battery2);
        screen2.registerCompatibility(battery3);
        screen2.registerCompatibility(adapter1);
        screen2.registerCompatibility(adapter3);

        screen3.registerCompatibility(battery2);
        screen3.registerCompatibility(battery3);
        screen3.registerCompatibility(battery1);
        screen3.registerCompatibility(battery4);
        screen3.registerCompatibility(adapter1);
        screen3.registerCompatibility(adapter2);
        screen3.registerCompatibility(adapter3);
        screen3.registerCompatibility(adapter4);

/*
        motherBoard1.registerCompatibility();
        cpu1.registerCompatibility();
        ram1.registerCompatibility();
        graphics1.registerCompatibility();
        screen1.registerCompatibility();
        adapter1.registerCompatibility();
        battery1.registerCompatibility();
        hdd1.registerCompatibility();
        motherBoard2.registerCompatibility();
        cpu2.registerCompatibility();
        ram2.registerCompatibility();
        graphics2.registerCompatibility();
        screen2.registerCompatibility();
        adapter2.registerCompatibility();
        battery2.registerCompatibility();
        hdd2.registerCompatibility();
        motherBoard3.registerCompatibility();
        cpu3.registerCompatibility();
        ram3.registerCompatibility();
        graphics3.registerCompatibility();
        screen3.registerCompatibility();
        adapter3.registerCompatibility();
        battery3.registerCompatibility();
        hdd3.registerCompatibility();
        battery4.registerCompatibility();
        ram4.registerCompatibility();
        motherboard4.registerCompatibility();
        cpu4.registerCompatibility();
        motherboard5.registerCompatibility();
        cpu5.registerCompatibility();
        motherboard6.registerCompatibility();
        cpu6.registerCompatibility();
        adapter4.registerCompatibility();
*/
    }


    public AssemblyComponent findByComponentIdentifier(String componentId){
        return assemblyComponents.stream().filter(ac->ac.getComponentIdentifier().equals(componentId)).findFirst().get();
    }
    public List<AssemblyComponent> findCompatibleAssemblyComponents(AssemblyComponent component){
        ComponentsRegistry componentsRegistry = ComponentsRegistry.getInstance();
        AssemblyComponentRegistryRecord assemblyComponentRegistryRecord = componentsRegistry.findByComponentId(component.getComponentIdentifier());
        List<AssemblyComponentRegistryRecord> compatibleComponentsRegistryRecords = assemblyComponentRegistryRecord.getCompatibleComponents();
        List<AssemblyComponent> compatibleComponents = new ArrayList<>();
        for(AssemblyComponentRegistryRecord componentRegistryRecord: compatibleComponentsRegistryRecords){
            compatibleComponents.add(this.findByComponentIdentifier(componentRegistryRecord.getComponentIdentifier()));
        }
        return compatibleComponents;
    }

    public List<AssemblyComponent> findCompatibleAssemblyComponentsByFamily(AssemblyComponent component,ASSEMBLYCOMPONENTTYPE family){
        ComponentsRegistry componentsRegistry = ComponentsRegistry.getInstance();
        AssemblyComponentRegistryRecord assemblyComponentRegistryRecord = componentsRegistry.findByComponentId(component.getComponentIdentifier());
        List<AssemblyComponentRegistryRecord> compatibleComponentsRegistryRecords = assemblyComponentRegistryRecord.findCompatibleComponentsByFamily(family);
        List<AssemblyComponent> compatibleComponents = new ArrayList<>();
        for(AssemblyComponentRegistryRecord componentRegistryRecord: compatibleComponentsRegistryRecords){
            compatibleComponents.add(this.findByComponentIdentifier(componentRegistryRecord.getComponentIdentifier()));
        }
        return compatibleComponents;
    }


} 
