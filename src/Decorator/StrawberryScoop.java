package Decorator;

public class StrawberryScoop implements IcecreamConeConstiuents{

    IcecreamConeConstiuents coneConstiuents;

    public StrawberryScoop(IcecreamConeConstiuents scoop){
        this.coneConstiuents = scoop;
    }


    @Override
    public int getCost() {
        return coneConstiuents.getCost()+ 2 ; //Basecost + strawberry scoop cost;
    }

    @Override
    public String getDescription() {

        return coneConstiuents.getDescription() + "Strawberryscoop";  // Base Desc + current desc
    }
}
