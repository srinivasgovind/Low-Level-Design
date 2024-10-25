package Decorator;

public class OrangeCone implements IcecreamConeConstiuents{


    @Override
    public int getCost() {
        return 1;   // 1 dollar for Orange Cone
    }

    @Override
    public String getDescription() {
        return "OrangeCone";
    }
}
