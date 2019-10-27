package com.example.laptop.print;

import com.example.laptop.visitor.IVisitable;
import com.example.laptop.visitor.IVisitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class SpecificationPrinter implements IVisitor {
    List<String> specifications;
    public SpecificationPrinter(){
        specifications = new ArrayList<>();
    }
    @Override
    public void visit(IVisitable visitable) {
        try {
            Method polymorphicMethod = visitable.getClass().getMethod("toString");
            String specification = (String)polymorphicMethod.invoke(visitable);
            specifications.add(specification);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public void print(){
        for(String specification: specifications){
            System.out.println(specification);
            System.out.println("\n\n");
        }
    }
}
