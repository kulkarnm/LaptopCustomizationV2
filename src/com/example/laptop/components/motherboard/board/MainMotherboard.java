package com.example.laptop.components.motherboard.board;

import com.example.laptop.components.AssemblyComponent;

//Composite Design pattern - Leaf Node
public interface MainMotherboard extends AssemblyComponent {
    MotherboardSpecification getSpecification();
} 
