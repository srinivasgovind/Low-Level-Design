package Factory.Components.Button;

public class AndroidButton implements Button {
    @Override
    public void click() {
         System.out.println("Clicked AndroidButton");
    }
}
