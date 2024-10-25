package Factory;


import Factory.Components.Menu.Menu;
import Factory.Components.Button.Button;


public interface UIFactory {

    public Button createButton();

    public Menu createMenu();
}
