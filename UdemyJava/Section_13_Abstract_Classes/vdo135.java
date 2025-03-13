package Section_13_Abstract_Classes;

abstract class Super {
    public Super() {
        System.out.println("Super Class Constructor.");
    }

    public void meth1() {
        System.out.println("Meth1 Of Super Class.");
    }

    abstract public void meth2();
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Sub Class Meth2.");
    }
}

public class vdo135 {

    public static void main(String[] args) {

        Super s = new Sub();
        s.meth1();
        s.meth2();

    }
}
