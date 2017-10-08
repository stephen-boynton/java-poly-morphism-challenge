/**
 * Created by stephenboynton on 6/30/17.
 */

class Car {

    private int wheels;
    private String engine;
    private int cylanders;
    private int doors;

    public Car(int wheels, String engine, int cylanders, int doors) {
        this.wheels = wheels;
        this.engine = engine;
        this.cylanders = cylanders;
        this.doors = doors;
    }

    public void startEngine () {
        System.out.println("You have started the engine.");
    }

    public void accelerate() {
        for (int i = 0; i < 10; i++)
            System.out.println("Accelerating to " + i + "mph.");
    }

    public void brake() {
        for (int i = 10; i > 0; i--)
            System.out.println("Slowing to " + i + "mph.");
    }
}

class Buick extends Car {

    public Buick() {
        super(4, "big", 6, 4);
    }

}

class Tesla extends Car {

    public Tesla() {
        super(4, "electric", 6, 4);
    }

    @Override
    public void startEngine () {
        System.out.println("Push button start.... nice.");
    }

}


public class Main {

    public static void main(String[] args) {

    Car lasabre = new Buick();
    Car tesla = new Tesla();

    tesla.startEngine();

    lasabre.startEngine();

    Buick van = new Buick();

    van.startEngine();


    }

}
