package src.com.design_patterns.abstract_factory;

public class LinButton implements Button{

    @Override
    public void press() {
        System.out.println("Apertou o botão do Linux!");
    }
    
}
