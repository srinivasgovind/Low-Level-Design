package Factory;

import Factory.Components.Menu.Menu;
import Factory.Components.Button.Button;

public class AndriodUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        System.out.println("AndriodUIFactory createButton");
        return null;
    }

    @Override
    public Menu createMenu() {
        System.out.println("AndriodUIFactory createMenu");
        return null;
    }
}
