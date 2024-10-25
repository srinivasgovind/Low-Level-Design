package Decorator;

public class ChocolateCone implements IcecreamConeConstiuents{

    IcecreamConeConstiuents coneConstiuents;

    public ChocolateCone(IcecreamConeConstiuents cone){
        this.coneConstiuents = cone;
    }

    public ChocolateCone(){}

    @Override
    public int getCost() {
        if(coneConstiuents == null){
            return 1; //Just Chocolate cone cost
        }
        return coneConstiuents.getCost()+ 1 ; //Basecost + chocolate cone cost;
    }

    @Override
    public String getDescription() {
        if(coneConstiuents == null){
            return "Chocolate Cone"; //Just Chocolate cone desc
        }
        return coneConstiuents.getDescription() + "Chocolate Cone";
    }
}
