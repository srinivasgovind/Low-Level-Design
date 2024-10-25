package Decorator;

public class Chocochips implements IcecreamConeConstiuents{

    IcecreamConeConstiuents coneConstiuents;

    public Chocochips(IcecreamConeConstiuents base){
        this.coneConstiuents = base;
    }


    @Override
    public int getCost() {
        return coneConstiuents.getCost()+ 1 ; //Basecost + choco chips cost;
    }

    @Override
    public String getDescription() {

        return coneConstiuents.getDescription() + "VanillaScoop";  // Base Desc + current desc
    }
}
