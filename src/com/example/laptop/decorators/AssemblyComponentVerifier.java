package com.example.laptop.decorators;

import com.example.laptop.components.AssemblyComponent;

public interface AssemblyComponentVerifier {
    public boolean qualityCheck(AssemblyComponent wrappyComponent);
}
