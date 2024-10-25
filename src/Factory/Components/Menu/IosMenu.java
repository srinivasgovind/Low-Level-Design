package Factory.Components.Menu;

public class IosMenu implements Menu {
    @Override
    public void display() {
        System.out.println("Ios Display");
    }

    @Override
    public void setSize() {
        System.out.println("Ios Setsize");
    }
}
