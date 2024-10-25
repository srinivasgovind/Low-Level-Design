package Decorator;

public class VanillaScoop implements IcecreamConeConstiuents{

    IcecreamConeConstiuents coneConstiuents;

    public VanillaScoop(IcecreamConeConstiuents scoop){
        this.coneConstiuents = scoop;
    }


    @Override
    public int getCost() {
        return coneConstiuents.getCost()+ 2 ; //Basecost + vanilla scoop cost;
    }

    @Override
    public String getDescription() {

        return coneConstiuents.getDescription() + "VanillaScoop";  // Base Desc + current desc
    }
}
