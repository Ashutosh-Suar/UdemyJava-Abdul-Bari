package Section12_Inheritance;

class Car {
    public void start() {
        System.out.println("Car is Started");
    }

    public void accelerate() {
        System.out.println("Car is Accelerated");
    }

    public void changeGear() {
        System.out.println("Car gear is changed");
    }
}

class LuxaryCar extends Car {
    @Override
    public void changeGear() {
        System.out.println("Automatic Gear");
    }

    public void openRoof() {
        System.out.println("Sun Roof is Opened");
    }
}

public class vdo129 {

    public static void main(String[] args) {

        // Car class Object
        // Car c = new Car();
        // c.start();
        // c.accelerate();
        // c.changeGear();

        // Dynamic Method Dispatch
        Car c = new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        // c.openRoof(); // This will give an error as openRoof() is not present in Car class
    }
}
