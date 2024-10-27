package src.com.design_patterns.abstract_factory;


public class Application {
    //Base Code:
    private Button b;
    private Checkbox c;

    public Application(GUIFactory factory) {
        b = factory.createButton();
        c = factory.creatCheckbox();
    }

    public void Using(){
        System.out.println();
        b.press();
        c.selected();
    }
}
