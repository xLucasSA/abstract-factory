package com.design_patterns.abstract_factory;

public class WinCheckbox implements Checkbox{

    @Override
    public void selected() {
        System.out.println("Selecionado checkbox do Windows!");
    }

}
