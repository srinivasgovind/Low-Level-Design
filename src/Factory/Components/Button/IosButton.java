package Factory.Components.Button;

public class IosButton implements Button {
    @Override
    public void click() {
         System.out.println("Clicking IosButton");
    }
}
