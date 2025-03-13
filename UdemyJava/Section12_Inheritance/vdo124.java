package Section12_Inheritance;

// First example
class MyParent {

    public MyParent() {
        System.out.println("Non-param of MyParent class");
    }

    MyParent(int x) {
        System.out.println("Param of MyParent class : " + x);
    }
}

class MyChild extends MyParent {

    MyChild() {
        System.out.println("Non-param of MyChild class");
    }

    MyChild(int y) {
        System.out.println("Param of MyChild class");
    }

    MyChild(int x, int y) {
        super(x);
        System.out.println("2 Param of MyChild class: " + y);
    }
}

// Second example
class Rectangle {
    public int length;
    public int breadth;

    public Rectangle() {
        length = breadth = 1;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rectangle {
    public int height;

    public Cuboid() {
        height = 1;
    }

    public Cuboid(int h) {
        height = h;
    }

    public Cuboid(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    public int volume() {
        return length * breadth * height;
    }
}

public class vdo124 {

    public static void main(String[] args) {

        // uncomment the below lines one by one and check the output of the program

        // First Example
        // MyChild c = new MyChild();
        // MyChild c = new MyChild(10);
        // MyChild c = new MyChild(10, 20);

        //Second Example
        Cuboid c = new Cuboid(5,3,10);
        System.out.println("Volume : " + c.volume());
    }
}
