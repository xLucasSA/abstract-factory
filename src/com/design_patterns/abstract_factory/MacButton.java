package com.design_patterns.abstract_factory;

public class MacButton implements Button{

    @Override
    public void press() {
        System.out.println("Apertou o botão do Mac!");
    }

}
