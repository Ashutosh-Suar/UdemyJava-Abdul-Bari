package Section12_Inheritance;

// Polymorphism using Overloading and Overriding

// Overloading or Compile Time Polymorphism
class Test {
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}

// Overriding or Run Time Polymorphism
class Super1 {
    public void display() {
        System.out.println("Super Class Display");
    }
}

class Sub1 extends Super1 {
    @Override
    public void display() {
        System.out.println("Sub Class Display");
    }
}

public class vdo133 {

    public static void main(String[] args) {

        // Overloading
        Test t = new Test();
        System.out.println("Maximum is " + t.max(10, 5));
        System.out.println("Maximum is " + t.max(10, 15, 5));
        System.out.println();

        // Overriding
        Super1 s = new Super1();
        s.display();
        System.out.println();

        // Dynamic Method Dispatch
        Super1 s1 = new Sub1();
        s1.display();

    }
}
