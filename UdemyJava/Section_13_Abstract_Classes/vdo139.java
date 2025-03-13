package Section_13_Abstract_Classes;

abstract class Super1 {
    abstract public void meth1();
}

class Sub1 extends Super1 {
    public void meth1() {
        System.out.println("Meth1 Of Sub Class.");
    }
}

public class vdo139 {

    public static void main(String[] args) {

        Super1 s;
        s = new Sub1();
        s.meth1();

    }
}
