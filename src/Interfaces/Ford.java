package Interfaces;

public class Ford implements Car{

    @Override
    public void run() {
        System.out.println("Ford run");
    }

    @Override
    public void stop() {
        System.out.println("Ford stop");
    }

    @Override
    public void move() {
        System.out.println("Ford move");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("Ford setSpeed");
    }

    @Override
    public int getSpeed() {
        System.out.println("Ford getSpeed");
        return 0;

    }
}
