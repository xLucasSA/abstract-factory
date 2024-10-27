package src.com.design_patterns.abstract_factory;

public class LinCheckbox implements Checkbox {

    @Override
    public void selected() {
        System.out.println("Selecionado checkbox do Linux!");
    }

}
