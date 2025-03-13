package Section_14_Interfaces;

interface Test {
    public void meth1();

    public void meth2();
}

class My implements Test {
    public void meth1() {
        System.out.println("Meth1 of class My.");
    }

    public void meth2() {
        System.out.println("Meth2 of class My.");
    }

    public void meth3() {
        System.out.println("Meth3 of class My.");
    }
}

public class vdo142 {

    public static void main(String[] args) {

        // Dynamic method dispatch
        Test t = new My();
        t.meth1();
        t.meth2();
        // t.meth3(); // Error: meth3() is not defined in interface Test.
        System.out.println("--------------------");

        // Object of class My
        My m = new My();
        m.meth1();
        m.meth2();
        m.meth3();

        // Interfaces are used to acheive run time polymorphism or dynamic method dispatch.

    }
}
