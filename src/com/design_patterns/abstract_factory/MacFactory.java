package com.design_patterns.abstract_factory;

public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        Button b = new MacButton();
        return b;
    }

    @Override
    public Checkbox creatCheckbox() {
        Checkbox c = new MacCheckbox();
        return c;
    }

}
