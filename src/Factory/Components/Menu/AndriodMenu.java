package Factory.Components.Menu;

public class AndriodMenu implements Menu {
    @Override
    public void display() {
        System.out.println("Andriod Menu");
    }

    @Override
    public void setSize() {
    System.out.println("Andriod set size");
    }
}
