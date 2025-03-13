package Section_13_Abstract_Classes;

abstract class Shape {
    abstract public double perimeter();

    abstract public double area();
}

class Circle extends Shape {
    double radius;

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double area() {
        return length * breadth;
    }

}

public class vdo138 {

    public static void main(String[] args) {

        // Rectangle Object
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;

        Shape s = r;

        System.out.println("Area of Rectangle : " + s.area());
        System.out.println("Perimeter of Rectangle : " + s.perimeter());

        // Circle Object
        Circle c = new Circle();
        c.radius = 5;

        Shape s1 = c;
        System.out.println("Area of Circle : " + s1.area());
        System.out.println("Circumference of Circle : " + s1.perimeter());

    }
}
