package com.design_patterns.abstract_factory;

public class LinFactory implements GUIFactory{

    @Override
    public Button createButton() {
        Button b = new LinButton();
        return b;
    }

    @Override
    public Checkbox creatCheckbox() {
        Checkbox c = new LinCheckbox();
        return c;
    }

}
