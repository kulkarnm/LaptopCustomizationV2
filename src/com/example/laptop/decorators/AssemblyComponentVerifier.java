package com.example.laptop.decorators;

import com.example.laptop.components.AssemblyComponent;
//strategy pattern
public interface AssemblyComponentVerifier {
    public boolean qualityCheck(AssemblyComponent wrappyComponent);
}
