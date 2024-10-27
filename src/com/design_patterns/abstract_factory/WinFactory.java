package src.com.design_patterns.abstract_factory;

public class WinFactory implements GUIFactory{

    @Override
    public Button createButton() {
        Button b = new WinButton();
        return b;
    }

    @Override
    public Checkbox creatCheckbox() {
        Checkbox c = new WinCheckbox();
        return c;
    }

}
