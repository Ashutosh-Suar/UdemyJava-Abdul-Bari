package Section12_Inheritance;

class Super {
    public void display() {
        System.out.println("Super Class Display");
    }
}

class Sub extends Super {
    public void display() {
        System.out.println("Sub Class Display");
    }
}

public class vdo127 {

    public static void main(String[] args) {

        // Super sup = new Super();
        // sup.display();

        // Sub s = new Sub();
        // s.display();

        // Dynamic Method Dispatch
        Super sup = new Sub();
        sup.display();
    }
}
