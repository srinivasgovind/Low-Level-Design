package Interfaces;

public class Mustang implements Car{

    @Override
    public void run() {
        System.out.println("Mustang run");
    }

    @Override
    public void stop() {
        System.out.println("Mustang stop");
    }

    @Override
    public void move() {
      System.out.println("Mustang move");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("Mustang setSpeed");
    }

    @Override
    public int getSpeed() {
        System.out.println("Mustang getSpeed");
        return 0;
    }
}
