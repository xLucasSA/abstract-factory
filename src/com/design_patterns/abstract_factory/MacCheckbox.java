package com.design_patterns.abstract_factory;

public class MacCheckbox implements Checkbox {

    @Override
    public void selected() {
        System.out.println("Selecionado checkbox do Mac!");
    }

}
