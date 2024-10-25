package Factory;

import Factory.Components.Menu.Menu;
import Factory.Components.Button.Button;


public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        System.out.println("IosUIFactory createButton");
        return null;
    }

    @Override
    public Menu createMenu() {
        System.out.println("IosUIFactory createMenu");
        return null;
    }
}
