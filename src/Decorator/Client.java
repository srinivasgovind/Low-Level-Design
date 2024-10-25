package Decorator;

public class Client {
    public static void main(String[] args) {

        IcecreamConeConstiuents icecreamConeConstiuents =
              new Chocochips(
                      new VanillaScoop(
                            new StrawberryScoop(
                                    new ChocolateCone(
                                            new OrangeCone()
                                    )
                            )
                      )
              );
        System.out.println(icecreamConeConstiuents.getDescription());
    }
}
