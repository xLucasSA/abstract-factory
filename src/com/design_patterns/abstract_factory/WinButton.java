package com.design_patterns.abstract_factory;

public class WinButton implements Button{
    
    @Override
    public void press() {
        System.out.println("Apertou o botão do Windows!");
    }
}
