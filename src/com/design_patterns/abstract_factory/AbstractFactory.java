package src.com.design_patterns.abstract_factory;

public class AbstractFactory {
    public static void main(String[] args) throws Exception {
        // Mude entre as instancia da fábrica e o código base continuará funcionando normalmente
        // GUIFactory f = new MacFactory();
        // GUIFactory f = new WinFactory();
        GUIFactory f = new LinFactory();
        
        Application app = new Application(f);

        app.Using();
    }
}
